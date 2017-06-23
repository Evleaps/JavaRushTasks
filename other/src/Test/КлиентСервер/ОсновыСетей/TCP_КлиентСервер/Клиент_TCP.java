package Test.КлиентСервер.ОсновыСетей.TCP_КлиентСервер;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Ромчи on 05.06.2017.
 */
public class Клиент_TCP {
    public static void main(String[] args) {
            String host = "192.168.137.1";
            int port = 7000;
            String data;

            //Создаем сокет
            Socket socket = null;
            try {
                socket = new Socket(host, port);
            } catch (UnknownHostException e) {
                System.out.println("Неизвестный хост: " + host);
                System.exit(-1);
            } catch (IOException e) {
                System.out.println("Ошибка ввода/вывода при создании сокета " + host
                        + ":" + port);
                System.exit(-1);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //поток вывода, через который проходят сообщения
            OutputStream out = null;
            try {
                out = socket.getOutputStream();
            } catch (IOException e) {
                System.out.println("Невозможно получить поток вывода!");
                System.exit(-1);
            }

            //транслируем сообщения пользователя в поток вывода
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            String ln = null;
            try {
                while ((ln = reader.readLine()) != null) {
                    writer.write(ln + "\n");
                    writer.flush();

                    //Читаем обратное сообщение от сервера
                    try{
                        InputStream iStream = socket.getInputStream();
                        DataInputStream inStream = new DataInputStream(iStream);
                        data = inStream.readUTF();
                        System.out.println("Сервер ответил: " + data);
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                System.out.println("Ошибка записи сообщения!");
                System.exit(-1);
            }
    }
}
