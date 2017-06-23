package Test.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ромчи on 17.06.2017.
 */
public class ОкноЧата {

    /**
     * Метод определения интерфейса панели
     * @param container
     */
    public static void createPanelUI(Container container)
    {
        JButton button;
        JTextArea inputMessage;
        JTextArea userOnline;
        JScrollPane scroll;

        //container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // По умолчанию натуральная высота, максимальная ширина
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.weightx = 0.5;
        constraints.gridy   = 0  ;  // нулевая ячейка таблицы по вертикали*/

        userOnline = new JTextArea(0,0);
        constraints.gridx      = 0;    // первая ячейка таблицы по горизонтали
        constraints.gridy      = 0;    // первая ячейка таблицы по горизонтали
        constraints.gridheight = 1;
        constraints.gridwidth  = 1;
        constraints.weightx    = 0.0;
        constraints.weighty    = 20;
        constraints.ipadx      = 100; // установить первоначальный размер кнопки
        constraints.fill       = GridBagConstraints.VERTICAL;
        constraints.anchor     = GridBagConstraints.FIRST_LINE_START;
        constraints.insets     = new Insets(5, 5,0 , 0);  // граница ячейки по Y
        container.add(userOnline, constraints);

        inputMessage = new JTextArea();
        constraints.fill      = GridBagConstraints.HORIZONTAL;
        constraints.ipady     = 17; // установить первоначальный размер кнопки
        constraints.weighty   = 1.0;// установить отступ
        constraints.anchor    = GridBagConstraints.LAST_LINE_START;// установить кнопку в конец окна
        constraints.insets    = new Insets(5, 5, 0, 0);  // граница ячейки по Y
        constraints.gridy     = 1;

        scroll = new JScrollPane(inputMessage);
        container.add(scroll,constraints);


        button = new JButton("Отправить");
       // constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady     = 10;    // установить первоначальный размер кнопки
        constraints.ipadx     = 1;    // установить первоначальный размер кнопки
        constraints.weighty   = 1.0;  // установить отступ
        // установить кнопку в конец окна
        constraints.anchor    = GridBagConstraints.PAGE_END;
        constraints.insets    = new Insets(5, 0, 0, 0);  // граница ячейки по Y
        constraints.gridy     = 1;
        constraints.gridx     = 1;
        container.add(button, constraints);
    }

    public static void main(String[] args) {
        // Создание окна
        JFrame frame = new JFrame("GridBagLayoutTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Определить панель содержания
        createPanelUI(frame.getContentPane());

        // Показать окно
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}