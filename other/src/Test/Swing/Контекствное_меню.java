package Test.Swing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Ромчи on 17.06.2017.
 */
public class Контекствное_меню extends JFrame {
    public static JPopupMenu popup;
    public static JLabel label;

    public static void main(String[] args) {
        new Контекствное_меню();
    }

    public Контекствное_меню() {
        label = new JLabel("КНИЖКА", new ImageIcon("1.gif"), JLabel.RIGHT);
        JPanel panel = new JPanel();
        panel.add(label);
        popup = new JPopupMenu();
        popup.add(new JMenuItem("Прочитать"));
        popup.add(new JMenuItem("Сжечь"));
        label.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent event) {
                if (SwingUtilities.isRightMouseButton(event))
                    popup.show(label, event.getX(), event.getY());
            }
        });
        setContentPane(panel);
        setSize(300,200);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo (null);
        setVisible(true);
    }
}
