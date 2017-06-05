package Test.ОсновыСетей.TCP_КлиентСервер;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Ромчи on 05.06.2017.
 */
public class Сервер_TCP {
    public static void main(String[] args) {
        int port = 7000;

        //Проверим доступность порта
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Порт: " + port + " - ошибка подключения!");
            System.exit(-1);
        }

        //Создание клиента
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.out.println("Порт: " + port + " - ошибка подключения!");
            System.exit(-1);
        }

        //Поток ввода от клиента, получаем из него сообщения
        InputStream inClientStream = null;
        try {
            inClientStream = clientSocket.getInputStream();
        } catch (IOException e) {
            System.out.println("Невозможно получить поток ввода!");
            System.exit(-1);
        }

        //Читаем поток
        BufferedReader reader = new BufferedReader(new InputStreamReader(inClientStream));
        String readClientStream = null;
        try {
            while ((readClientStream = reader.readLine()) != null) {
                System.out.println("Сообщение от клиента: " + readClientStream);
                System.out.flush();

                //Отсылаем сообщение обратно клиенту
                OutputStream outClientStream = null;
                outClientStream = clientSocket.getOutputStream();
                DataOutputStream outDataClientStream = new DataOutputStream(outClientStream);
                try {
                    outDataClientStream.writeUTF("Принял!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("Невозможно прочесть сообщение!");
            System.exit(-1);
        }
    }
}
