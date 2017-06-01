package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Минимум_из_многочисел
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(min(integerList));
    }

    public static int min(List<Integer> array) {

        int min = Integer.parseInt(String.valueOf(Collections.min(array)));

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        for (int i=0; i<a;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        //create and initialize a list here - создать и заполнить список тут
        return list;
    }
}