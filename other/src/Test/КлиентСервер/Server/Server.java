package Test.КлиентСервер.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Server {
    private List<Connection> connections = Collections.synchronizedList (new ArrayList<Connection> ( ));
    private static StringBuffer historyMassages = new StringBuffer ("История сообщений: ");
    public static final int PORT_MESSAGE = 7000;
    private ServerSocket server;

    /**
     * Сервер ждет подключение в бесконечном цикле, если есть подключение, отправляем в список подключенных клиентов
     * Список клиентов clients содержит каждого клиента как новый поток
     * Если в historyMassages больше 5000 символов, удаляем ранние сообщения
     */

    public Server() {
        try {
            new Thread (new CheckForOnline ( )).start ( );//проверка: в сети ли пользователь?
            server = new ServerSocket (PORT_MESSAGE);

            while (true) {
                Socket socket = server.accept ( );
                Connection con = new Connection (socket);
                connections.add (con);
                con.start ( );

            }
        } catch (IOException e) {
            e.printStackTrace ( );
        } finally {
            closeAll ( );
        }
    }

    private void closeAll() {
        try {
            server.close ( );
            synchronized (connections) {
                Iterator<Connection> iter = connections.iterator ( );
                while (iter.hasNext ( )) {
                    ((Connection) iter.next ( )).close ( );
                }
            }
        } catch (Exception e) {
            System.err.println ("Потоки не были закрыты!");
        }
    }

    private class Connection extends Thread {
        private  Socket connection;
        private  ObjectInputStream input;
        private  ObjectOutputStream output;
        protected  Connection nameClient;
        private  String messages;


        public Connection(Socket socket) {
            try {
                connection = socket;
                output = new ObjectOutputStream (connection.getOutputStream ( )); //Пишем в чат
                input = new ObjectInputStream (connection.getInputStream ( )); //читаем с сервера
                output.writeObject (CheckForOnline.nameUser);
                output.flush ( );

            } catch (IOException e) {
                e.printStackTrace ( );
            }
        }

        @Override
        public void run() {
            try {
                while (connection.isConnected ()) {
                    messages = (String) input.readObject();
                    historyMassages.append (messages);

                    if (historyMassages.length ( ) > 5000)
                        historyMassages.delete (5000, historyMassages.length ( ));

                    output.writeObject (historyMassages.toString ());
                    output.flush ();
                }
            } catch (IOException e) {
                e.printStackTrace ( );
            } catch (ClassNotFoundException e) {
                e.printStackTrace ( );
            } finally {
                close ( );
            }
        }

        /**
         * Закрывает входной и выходной потоки и сокет
         */
        public void close() {
            try {
                // Если больше не осталось соединений, закрываем всё, что есть и
                // завершаем работу сервера
                connections.remove (this);
                if (connections.size ( ) == 0) {
                    Server.this.closeAll ( );
                    System.exit (0);
                }
            } catch (Exception e) {
                System.err.println ("Потоки не были закрыты!");
            }
        }
    }
}