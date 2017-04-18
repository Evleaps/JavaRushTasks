package Test;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class СортировкаПоКоличествуВхождений {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 12, 3, 4, 4, 3, 89, 1};
        List<Integer> list = Arrays.asList(array);


        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            int repeat = 0;
            for (int j = 0; j < list.size(); j++) {
                if (array[i].equals(array[i]))
                    count++;
            }


        }
    }
}