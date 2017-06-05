package Test.ОсновыСетей.UDP_КлиентСервер;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
Эту красоту можно запустить на другом компе и все будет работать)) !
 */
public class Клиент_UDP {
    public static void main(String[] args) {
        DatagramSocket shok = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            shok = new DatagramSocket();
            while (true) {
                //Ожидаем ввод сообщений серверу
                System.out.println("Введите сообщение серверу: ");
                String messages = (String) reader.readLine();
                byte[] buffer = messages.getBytes();

                //Отправляем сообщение
                DatagramPacket pack = new DatagramPacket(buffer, buffer.length,
                        InetAddress.getByName("192.168.137.1"), 7000);
                shok.send(pack);

                //Буфер для получения входящих данных
                byte[] bufferData = new byte[65536];
                DatagramPacket reply = new DatagramPacket(bufferData, bufferData.length);

                //Получаем данные
                shok.receive(reply);
                byte[] data = reply.getData();
                messages = new String(data, 0, reply.getLength());

                System.out.println("Сервер: " + reply.getAddress().getHostAddress()
                        + ", порт: " + reply.getPort() + ", получил" + messages);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
