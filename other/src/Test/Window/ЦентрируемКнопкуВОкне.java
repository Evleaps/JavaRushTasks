package Test.Window;

import javax.swing.*;
import java.awt.*;
//http://math.sgu.ru/sites/chairs/prinf/materials/java/lesson8.htm

public class ЦентрируемКнопкуВОкне {
   public static void main(String[] args) {
    //создал окно, библиотека swing
    JFrame myWindow = new JFrame("Window");
    //это стандартная кнопка закрыть, крестик. В параметр передать int
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //панель позволяет создавать кнопки button
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());//FlowLayout выводит кнопки по порядку, если в окно не влезло, перемещает
   /* panel.add(new Button("Тык"),BorderLayout.NORTH);
    panel.add(new Button("Тык - не просто кнопка!"),BorderLayout.SOUTH);
    panel.add(new Button("Сюда тык"),BorderLayout.WEST);
    panel.add(new Button("или сюда тык"),BorderLayout.EAST);*/

    myWindow.getContentPane().add(new Button("Тык"),BorderLayout.NORTH);
    myWindow.getContentPane().add(new Button("Тык - не просто кнопка!"),BorderLayout.SOUTH);
    myWindow.getContentPane().add(new Button("Сюда тык"),BorderLayout.WEST);
    myWindow.getContentPane().add(new Button("или сюда тык"),BorderLayout.EAST);
    myWindow.getContentPane().add(new Button("ЛЮБЛЮ ТЫКАТЬ"),BorderLayout.CENTER);

    myWindow.setSize(300, 400);
    myWindow.setVisible(true);
}
}