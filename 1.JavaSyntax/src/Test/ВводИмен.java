package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ромчи on 27.01.2017.
 */
public class ВводИмен
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String slovo = reader.readLine();
        if (slovo.equals("да"))
            System.out.println("1 варик ");
        if (slovo.equals("Да"))
            System.out.println("1 варик ");
        if (slovo.equals("ДА"))
        System.out.println("1 варик ");
        if (slovo.equals("Нет"))
        System.out.println("2 варик ");
        if (slovo.equals("нет"))
            System.out.println("2 варик ");
        if (slovo.equals("НЕТ"))
            System.out.println("2 варик ");
    }
}
