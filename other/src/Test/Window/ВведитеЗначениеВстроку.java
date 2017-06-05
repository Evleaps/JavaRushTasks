package Test.Window;

import javax.swing.*;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Ромчи on 02.06.2017.
 */
public class ВведитеЗначениеВстроку {

    public static void main(String [] args) {

        String test1= JOptionPane.showInputDialog("Please input mark for test 1: ");

        String test2= JOptionPane.showInputDialog("Please input mark for test 2: ");

        String test3= JOptionPane.showInputDialog("Please input mark for test 3: ");

        int int1 = Integer.parseInt(test1);
        int int2 = Integer.parseInt(test2);
        int int3 = Integer.parseInt(test3);

        SortedSet<Integer> set = new TreeSet<>();
        set.add(int1);
        set.add(int2);
        set.add(int3);

        Integer [] intArray = set.toArray(new Integer[3]);
        JFrame frame = new JFrame();
        JOptionPane.showInternalMessageDialog(frame.getContentPane(), String.format("Result %f", (intArray[1] + intArray[2]) / 2.0));

    }

}