package Test.КлиентСервер.GUI;

import javax.swing.*;

public class SelectionIP extends JFrame {
    private static String[] setIP = {"LocalHost: 127.0.0.1",
            "Компьютер Ромы: 192.168.137.1",
            "Компьютер Ромы2: 5.3.210.100",
            "Другой IP"};
    private static ImageIcon icon = null;

    public void IPButton() {
        Object selectionIP = JOptionPane.showInputDialog (this,
                "Выберите адресс соединения",
                "Настройка подключения",
                JOptionPane.QUESTION_MESSAGE,
                icon, setIP, setIP[0]);

        try {
            if (selectionIP.toString ( ).equals ("LocalHost: 127.0.0.1")) {
                Constant.IP = "127.0.0.1";
            } else if (selectionIP.toString ( ).equals ("Компьютер Ромы: 192.168.137.1")) {
                Constant.IP = "192.168.137.1";
            } else if (selectionIP.toString ( ).equals ("Компьютер Ромы2: 5.3.210.100")) {
                Constant.IP = "5.3.210.100";
            } else {
                Constant.IP = JOptionPane.showInputDialog (this,
                        "Введите IP-адресс подключения",
                        "Настройка подключения",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (NullPointerException e) {
            //если пользователь закроек окно, программа завершится.
            System.exit (0);
        }
    }
}
