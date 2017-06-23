package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Ромчи on 19.06.2017.
 */
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("0:0");
        list.add("0:1");
        list.add("0:1");
        list.add("0:3");

        String s = "EDIT:СЛОВО";

        list.set(1,s.split("EDIT:")[1]);

        for (String s1 : list) {
            System.out.println(s1);
        }

    }
}
