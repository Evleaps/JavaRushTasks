package Test.РаботаСдатами;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ТекущаяДата
{
    public static void main(String[] args) throws Exception
    {
        Date today = new Date();
        System.out.println("Current date: " + today);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        System.out.println(format.format(today));
    }
}
