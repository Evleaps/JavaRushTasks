
package Test.КлиентСервер.Server.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * Created by Ромчи on 02.06.2017
 */

public class App1 extends JFrame {
    private JPanel      tykChat;
    private JTextField  messages;
    private JButton     send;
    private JTextArea   chat;
    private JTextArea   userChat;

    private Socket              connectionCheckOn;
    private ObjectInputStream   inputCheckOn;
    private ObjectOutputStream  outputCheckOn;

    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;

    public static void main(String[] args) throws UnknownHostException {
        new App1();
    }

    public App1() {
        new SelectionIP().IPButton();//пользователь выбирает адресс подключения
        Scanner scan = new Scanner(System.in);
        String activeLogin;
        System.out.println("Запущен Клиент...");
        try {
            socket = new Socket (Constant.IP, Constant.PORT_MESSAGE);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);


            /*new SelectionLogin().Login ("");//Идентификация пользователя(Ввод логина)
            if (Constant.LOGIN == null) System.exit (0);//в случе если нажмет крестик на вводе логина
            out.println(Constant.LOGIN);*/
            System.out.println("Введите свой ник:");
            out.println(scan.nextLine());

            setContentPane (tykChat);
            setSize (400, 700);
            setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo (null); //окно вылезет в центре монитора
            setVisible (true);
            userChat.setText ("Участники беседы:" + "\n" + Constant.LOGIN);

            Resender resend = new Resender();
            resend.start();

        } catch (UnknownHostException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }  finally {
            close();
        }

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == send)
                    sendMessage(messages.getText());
            }
        });
    }

    private void close() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.err.println("Потоки не были закрыты!");
        }
    }

    private class Resender extends Thread {
        private boolean stoped;
        public void setStop() {
            stoped = true;
        }

        @Override
        public void run() {
            try {
                while (!stoped) {
                    String str = in.readLine();
                    chat.setText(str);
                    UserOnline();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при получении сообщения.");
                e.printStackTrace();
            }
        }
    }

    private void sendMessage(Object messagesText) {
            SimpleDateFormat date = new SimpleDateFormat ("HH:mm:ss");
            out.println ( Constant.LOGIN + ": "
                    + date.format (new Date ()) + " - "
                    + messagesText.toString ());

            messages.setText ("");//после отправки поле сообщения очищается.
    }

    private void UserOnline() {
        try {
            connectionCheckOn = new Socket (Constant.IP, Constant.PORT_ONLINE);
            inputCheckOn = new ObjectInputStream (connectionCheckOn.getInputStream ());//читаем с сервера
            outputCheckOn = new ObjectOutputStream (connectionCheckOn.getOutputStream ()); //записываем на сервер

            outputCheckOn.writeObject (Constant.LOGIN);
            userChat.setText ("Участники беседы:" + "\n"
                    + inputCheckOn.readObject().toString ());
        } catch (IOException e) {
            e.printStackTrace ( );
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        }
    }
}
