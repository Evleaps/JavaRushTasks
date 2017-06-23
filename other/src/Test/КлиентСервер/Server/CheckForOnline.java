package Test.КлиентСервер.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Для каждого клиента создается
 */
public class CheckForOnline implements Runnable {
    private static final int    PORT_ONLINE = 7001;
    private static ServerSocket server;
    protected static String     nameUser = "";
    private static List<ConnectedClient> clients = new ArrayList<> ( );

    @Override
    public void run() {
        try {
            server = new ServerSocket (PORT_ONLINE);
            while (true) {
                ConnectedClient client = new ConnectedClient (server.accept ( ));
                clients.add (client);
                client.start ();
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    private static class ConnectedClient extends Thread {
        private static Socket             connection;
        private static ObjectInputStream  input;
        private static ObjectOutputStream output;
        private static String             loginUser;


        public ConnectedClient(Socket socket) throws IOException {
            connection = socket;
            output = new ObjectOutputStream (connection.getOutputStream ()); //Пишем в чат
            input = new ObjectInputStream (connection.getInputStream ()); //читаем с сервера
        }

        @Override
        public void run() {
            try {
                while (connection.isConnected()) {
                    loginUser = (String) input.readObject();
                    String[] allUser = nameUser.split ("\n");

                    boolean coincidence = false;
                    for (String s : allUser) {
                        if (s.equals (loginUser)) coincidence = true;
                    }
                    if (coincidence == false) nameUser += (loginUser + "\n");

                    output.writeObject (nameUser);
                }
            } catch (IOException e) {
            } catch (ClassNotFoundException e) {
            }finally {
                nameUser.replaceAll (loginUser,"");
                System.out.println (loginUser + " перестал быть онлайн");
            }
        }
    }
}
