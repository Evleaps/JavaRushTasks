package Test.КлиентЧата.GUI;

import Test.КлиентЧата.Logic.Constant;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ромчи on 02.06.2017.
 */
public class App1 extends JFrame implements Runnable {
    private JPanel      tykChat;
    private JTextField  messages;
    private JButton     send;
    private JTextArea   chat;
    private JTextArea   userChat;

    public App1() {
        new SelectionIP().IPButton ();//пользователь выбирает адресс подключения
        new SelectionLogin().Login ( );//Идентификация пользователя
        if (Constant.LOGIN == null) System.exit (0);

        setContentPane (tykChat);
        setSize (400, 700);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo (null); //окно вылезет в центре монитора
        setVisible (true);

        send.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource () == send)
                    Send (messages.getText ());
            }
        });
    }

    @Override
    public void run() {
        try {
            while (true) {
                Constant.connection = new Socket (Constant.IP, Constant.PORT);
                Constant.input = new ObjectInputStream (Constant.connection.getInputStream ());//читаем с сервера
                Constant.output = new ObjectOutputStream (Constant.connection.getOutputStream ()); //записываем на сервер
                UserOnline();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }


    private void Send(Object messagesText) {
        try {
            SimpleDateFormat date = new SimpleDateFormat ("HH:mm:ss");
            Constant.output.flush ();
            Constant.output.writeObject (messagesText);
            chat.append ("\n" + Constant.LOGIN + ": "
                    + date.format (new Date ()) + "\n"
                    + messagesText.toString ());
            messages.setText (null);//после отправки поле сообщения очищается.
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }

    private void UserOnline() {
        if (Constant.online == true && !userChat.getText().contains (Constant.LOGIN)) {
            userChat.append ("\n" + Constant.LOGIN);
        } else {
            String buf = userChat.getText ();
            buf.replace (Constant.LOGIN.toString(),"");
            userChat.setText(buf);
        }
    }
}