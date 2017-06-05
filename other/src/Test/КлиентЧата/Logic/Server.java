package Test.КлиентЧата.Logic;

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
    private static Socket             connection;
    private static ObjectInputStream  input;
    private static ObjectOutputStream output;

    @Override
    public void run() {
        try {
            Constant.server = new ServerSocket (Constant.PORT,10);
            while (true) {
                Constant.online = false;
                connection = Constant.server.accept ();//возвращает сокет который получил
                Constant.online = true;
                output = new ObjectOutputStream (connection.getOutputStream ()); //Пишем в чат
                input = new ObjectInputStream (connection.getInputStream ()); //читаем с сервера
                output.writeObject ("Вы прислали " + (String)input.readObject ());
            }
        } catch (UnknownHostException e) {
            Constant.online = false;
            e.printStackTrace ( );
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}