package Test.КлиентСервер.КлиентЧата.GUI;

import javax.swing.*;
import static Test.КлиентСервер.КлиентЧата.GUI.Constant.LOGIN;

public class SelectionLogin extends JFrame {
    private static String[]   setIP   = {LOGIN, "Войти под другим именем"};
    private static ImageIcon  icon    = null;
    private static String     unverifiedName   = null;

    /**В будущем БД будет сохранять пользователя после входа*/
    public void Login(String activeLogin) {
        if (LOGIN != null) SelectionLogin (activeLogin);
        else {
            addName (activeLogin);
        }
    }

    private void SelectionLogin(String activeLogin) {
        Object selectionLogin = JOptionPane.showInputDialog (this,
                "Ваш Логин?",
                "Настройка подключения",
                JOptionPane.QUESTION_MESSAGE,
                icon,setIP,setIP[0]);

        if (selectionLogin.toString().equals("Войти под другим именем")){
            addName (activeLogin);
        }
    }

    private void addName(String activeLogin) {
        while (true) {
            unverifiedName = JOptionPane.showInputDialog (this,
                    "Введите свое имя:",
                    "Настройка подключения",
                    JOptionPane.QUESTION_MESSAGE);

            String[] allLogin = activeLogin.split ("\n");
            boolean flag = false;
            for (String s : allLogin) {
                if (s.equals (unverifiedName)) {
                    flag = true;
                }
            }

            if (flag == true)
                JOptionPane.showMessageDialog (this,"Логин занят другим пользователем!");
            else {
                LOGIN = unverifiedName;
                break;
            }
        }
    }
}
