package Test.КлиентЧата.GUI;

import javax.swing.*;
import static Test.КлиентЧата.Logic.Constant.LOGIN;

public class SelectionLogin extends JFrame {
    private static String[]   setIP   = {LOGIN, "Войти под другим именем"};
    private static ImageIcon  icon    = null;

    public void Login() {
        if (LOGIN != null) SelectionLogin ();
        else {
            LOGIN = JOptionPane.showInputDialog (this,
                    "Введите свое имя:",
                    "Настройка подключения",
                    JOptionPane.QUESTION_MESSAGE);
        }

    }

    private void SelectionLogin() {
        Object selectionLogin = JOptionPane.showInputDialog (this,
                "Ваше имя?",
                "Настройка подключения",
                JOptionPane.QUESTION_MESSAGE,
                icon,setIP,setIP[0]);

         if (selectionLogin.toString().equals("Войти под другим именем")){
             LOGIN = JOptionPane.showInputDialog (this,
                     "Введите свое имя:",
                     "Настройка подключения",
                     JOptionPane.QUESTION_MESSAGE);
        }
    }
}
