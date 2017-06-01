package Test.Window;

import javax.swing.*;
import java.awt.event.*;
/** Код был взят с:
 * http://java-online.ru/swing-joptionpane.xhtml*/

public class JOptionPaneTest extends JFrame
{
    private static final long serialVersionUID = 1L;

    private        JPanel  contents       = null;
    private        JButton btnMessage1    = null;
    private        JButton btnMessage2    = null;
    private        JButton btnMessage3    = null;

    private        JButton btnConfirm1    = null;
    private        JButton btnConfirm2    = null;
    private        JButton btnConfirm3    = null;

    private        JButton btnInput1      = null;
    private        JButton btnInput2      = null;
    private        JButton btnInput3      = null;

    private      ImageIcon  icon          = null;
    private final  String   TITLE_message = "Окно сообщения";
    private final  String   TITLE_confirm = "Окно подтверждения";
    private        String[] drink         = {"Сок",
            "Минералка",
            "Лимонад"  ,
            "Пиво"};
    public JOptionPaneTest()
    {
        super("Пример использования JOptionPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Локализация кнопок
        UIManager.put("OptionPane.yesButtonText"   , "Да"    );
        UIManager.put("OptionPane.noButtonText"    , "Нет"   );
        UIManager.put("OptionPane.cancelButtonText", "Отмена");

        contents = new JPanel();
        // Иконка для отображения в окне сообщений
        icon = new ImageIcon("images/warning.png");

        // Кнопка формирования окна по 2-м параметрам
        btnMessage1 = new JButton("MessageDialog 2");
        // Кнопка формирования окна по 4-м параметрам
        btnMessage2 = new JButton("MessageDialog 4");
        btnMessage3 = new JButton("MessageDialog 5");

        // Кнопки вывода сообщений подтверждения
        btnConfirm1 = new JButton("ConfirmDialog 4+2");
        btnConfirm2 = new JButton("ConfirmDialog 5");
        btnConfirm3 = new JButton("ConfirmDialog 6");

        btnInput1 = new JButton("InputDialog 2+3");
        btnInput2 = new JButton("InputDialog 4");
        btnInput3 = new JButton("InputDialog 7");

        addMessageListeners();
        addConfirmListeners();
        addInputListeners  ();

        // Размещение кнопок в интерфейсе
        contents.add(btnMessage1);
        contents.add(btnMessage2);
        contents.add(btnMessage3);

        contents.add(btnConfirm1);
        contents.add(btnConfirm2);
        contents.add(btnConfirm3);

        contents.add(btnInput1);
        contents.add(btnInput2);
        contents.add(btnInput3);

        setContentPane(contents);
        // Вывод окна на экран
        setSize(500, 140);
        setVisible(true);
    }


    private void addMessageListeners()
    {
        btnMessage1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        "<html><h2>Текст</h2><i>в виде разметки HTML</i>");
            }
        });
        btnMessage2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        new String[] {"Сообщение в виде массива строк :",
                                " - первая строка",
                                " - вторая строка"},
                        TITLE_message, JOptionPane.ERROR_MESSAGE);
            }
        });
        btnMessage3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Включение в интерфейс иконки
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        "Использование изображения в окне сообщений", TITLE_message,
                        JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }


    private void addConfirmListeners()
    {
        btnConfirm1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Окно подтверждения c 4-мя параметрами
                int result = JOptionPane.showConfirmDialog(
                        JOptionPaneTest.this,
                        "Вам это нужно?",
                        TITLE_confirm,
                        JOptionPane.YES_NO_CANCEL_OPTION);
                // Окна подтверждения c 2-мя параметрами
                if ( result == JOptionPane.YES_OPTION )
                    JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                            "Вы не отказываетесь?");
                else if ( result == JOptionPane.NO_OPTION )
                    JOptionPane.showConfirmDialog( JOptionPaneTest.this,
                            "Вы отказались?");
            }
        });
        btnConfirm2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                        "Вы не отказываетесь?",
                        TITLE_confirm,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
            }});
        btnConfirm3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(
                        JOptionPaneTest.this, "Вам нравится значок?",
                        TITLE_confirm,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE, icon);
            }});
    }



    private void addInputListeners()
    {
        btnInput1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Диалоговое окно ввода данных : родитель, HTML сообщение
                String result = JOptionPane.showInputDialog(
                        JOptionPaneTest.this,
                        "<html><h2>Добро пожаловать");
                JOptionPane.showInputDialog(
                        JOptionPaneTest.this,
                        "Вы ответили", result);
            }
        });
        btnInput2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Диалоговое окно ввода данных : родитель, сообщение в виде
                // массива строк, тип диалогового окна (иконки)
                JOptionPane.showInputDialog(JOptionPaneTest.this,
                        new String[] {"Неверно введен пароль!",
                                "Повторите пароль :"},
                        "Авторизация",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        btnInput3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Диалоговое окно ввода данных
                Object result = JOptionPane.showInputDialog(
                        JOptionPaneTest.this,
                        "Выберите любимый напиток :",
                        "Выбор напитка",
                        JOptionPane.QUESTION_MESSAGE,
                        icon, drink, drink[0]);
                // Диалоговое окно вывода сообщения
                JOptionPane.showMessageDialog(JOptionPaneTest.this, result);
            }
        });
    }


    public static void main(String[] args) {
        new JOptionPaneTest();
    }
}
