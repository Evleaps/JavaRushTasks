package Test.ClientServer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Ромчи on 01.06.2017.
 */
public class Server implements Runnable {
    static private Socket connection;
    static private ObjectInputStream input;
    static private ObjectOutputStream output;
    static private ServerSocket server;

    @Override
    public void run() {
        try {
            server = new ServerSocket (1234,10);
            while (true) {
                connection = server.accept ();//возвращает сокет который получил
                output = new ObjectOutputStream (connection.getOutputStream ( )); //записываем на сервер
                input = new ObjectInputStream (connection.getInputStream ( )); //читаем с сервера
                output.writeObject ("Вы прислали" + (String)input.readObject ());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace ( );
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
