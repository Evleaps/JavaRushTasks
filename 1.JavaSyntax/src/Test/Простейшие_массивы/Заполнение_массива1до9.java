package Test.Простейшие_массивы;

/**
 * Created by Ромчи on 01.02.2017.
 */
public class Заполнение_массива1до9
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = 9 - i;
        }
    }
}
