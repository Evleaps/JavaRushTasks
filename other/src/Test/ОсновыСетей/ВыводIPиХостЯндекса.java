package Test.ОсновыСетей;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Ромчи on 05.06.2017.
 */
public class ВыводIPиХостЯндекса {
    public static void main(String[] args) {
        try {
            //создадим объект типа InetAdress
            InetAddress addressYandex = InetAddress.getByName("ya.ru");
            InetAddress addressGoogle = InetAddress.getByName("google.com");

            //Вывод IP адреса хоста и имени
            System.out.println("IP хоста: " + addressYandex.getHostAddress() + ", имя хоста: " + addressYandex.getHostName());
            System.out.println("IP хоста: " + addressGoogle.getHostAddress() + ", имя хоста: " + addressGoogle.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
