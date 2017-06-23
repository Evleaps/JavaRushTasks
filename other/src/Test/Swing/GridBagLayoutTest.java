package Test.Swing;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutTest {

    /**
     * Метод определения интерфейса панели
     * @param container
     */
    public static void createPanelUI(Container container)
    {
        JButton button;

        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // По умолчанию натуральная высота, максимальная ширина
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy   = 0  ;  // нулевая ячейка таблицы по вертикали

        button = new JButton("Школа");

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;      // нулевая ячейка таблицы по горизонтали
        container.add(button, constraints);

        button = new JButton("Институт");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;      // первая ячейка таблицы по горизонтали
        container.add(button, constraints);

        button = new JButton("Академия");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;      // вторая ячейка таблицы по горизонтали
        container.add(button, constraints);

        button = new JButton("Высокая кнопка размером в 2 ячейки");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady     = 45;   // кнопка высокая
        constraints.weightx   = 0.0;
        constraints.gridwidth = 2;    // размер кнопки в две ячейки
        constraints.gridx     = 0;    // нулевая ячейка по горизонтали
        constraints.gridy     = 1;    // первая ячейка по вертикали
        container.add(button, constraints);

        button = new JButton("Семья");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady     = 0;    // установить первоначальный размер кнопки
        constraints.weighty   = 1.0;  // установить отступ
        // установить кнопку в конец окна
        constraints.anchor    = GridBagConstraints.PAGE_END;
        constraints.insets    = new Insets(5, 0, 0, 0);  // граница ячейки по Y
        constraints.gridwidth = 2;    // размер кнопки в 2 ячейки
        constraints.gridx     = 1;    // первая ячейка таблицы по горизонтали
        constraints.gridy     = 2;    // вторая ячейка по вертикали
        container.add(button, constraints);
}
    public static void main(String[] args)
    {
        // Создание окна
        JFrame frame = new JFrame("GridBagLayoutTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Определить панель содержания
        createPanelUI(frame.getContentPane());

        // Показать окно
        frame.pack();
        frame.setVisible(true);
    }
}
