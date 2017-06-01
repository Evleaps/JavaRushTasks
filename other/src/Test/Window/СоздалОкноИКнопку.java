package Test.Window;

import javax.swing.*;
import java.awt.*;
// Примеры отсюда http://math.sgu.ru/sites/chairs/prinf/materials/java/lesson8.htm

/**
 На экран должно выходить окно, в окне должно быть несколько кнопок*/
public class СоздалОкноИКнопку {
    public static void main(String[] args) {
        //создал окно, библиотека swing
        JFrame myWindow = new JFrame("Window");
        //это стандартная кнопка закрыть, крестик. В параметр передать int
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //панель позволяет создавать кнопки button
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());//FlowLayout выводит кнопки по порядку, если в окно не влезло, перемещает
        panel.add(new Button("Тык"));
        panel.add(new Button("Тык - не просто кнопка!      вававававалоыавплдыварплвыарплоывапдлоывраплдрывалдп"));
        panel.add(new Button("Сюда тык"));
        panel.add(new Button("или сюда тык"));
        myWindow.setContentPane(panel);
        myWindow.setSize(300, 400);
        myWindow.setVisible(true);
    }
}

