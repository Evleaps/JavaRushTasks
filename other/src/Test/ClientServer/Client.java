package Test.ClientServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Ромчи on 01.06.2017.
 */

// Примеры отсюда http://math.sgu.ru/sites/chairs/prinf/materials/java/lesson8.htm
public class Client extends JFrame implements Runnable {
    static private Socket connection;
    static private ObjectInputStream input;
    static private ObjectOutputStream output;

    public static void main(String[] args) {
        new Thread(new Client("Chat")).start();
        new Thread(new Server()).start();
    }

    public Client(String nameWindow) throws HeadlessException {
        super(nameWindow);
        setLayout(new FlowLayout());
        setSize(400, 300);
        setLocationRelativeTo(null); //окно вылезет в центре монитора
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        final JTextField chatTextWindow = new JTextField(10);//создается текстовое поле на 20 символов(потом новая строка// )
        final JButton buttonSend = new JButton("Send");
        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonSend) {
                    Send(chatTextWindow.getText());
                }
            }
        });
        add(chatTextWindow);
        add(buttonSend);
    }

    @Override
    public void run() {
        //Сокет = адресс ПК + название порта
        try {
            int port = 1234;
            //InetAddress ip = InetAddress.getByName("95.79.233.198");
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            while (true) {
                connection = new Socket(ip, port);
                output = new ObjectOutputStream(connection.getOutputStream()); //записываем на сервер
                input = new ObjectInputStream(connection.getInputStream());//читаем с сервера
                JOptionPane.showMessageDialog(null, (String) input.readObject());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Send(Object obg) {
        try {
            output.flush();
            output.writeObject(obg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


