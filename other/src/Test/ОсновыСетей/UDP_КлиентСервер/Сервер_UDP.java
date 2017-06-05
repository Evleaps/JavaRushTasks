package Test.ОсновыСетей.UDP_КлиентСервер;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Ромчи on 05.06.2017.
 */
public class Сервер_UDP {
    public static void main(String[] args) {
        try {
            //создаем сокет
            DatagramSocket socket = new DatagramSocket(7000);

            //Буфер для получения входящих данных
            byte[] buffer = new byte[65536];
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

            System.out.println("Ожидаем данные ...");

            while (true) {
                //Получаем данные
                socket.receive(packet);
                byte[] data = packet.getData();
                String messages = new String(data,0,packet.getLength());

                System.out.println("Сервер получил: " + messages);

                //Отправляем клиенту данные
                DatagramPacket receiveMessages = new DatagramPacket(messages.getBytes(),
                        messages.getBytes().length,
                        packet.getAddress(),
                        packet.getPort());
                socket.send(receiveMessages);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
