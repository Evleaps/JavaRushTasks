package Test.РаботаСдатами;

import java.util.Date;

public class НаступилоЛиУжеНекотороеВремя
{
    public static void main(String[] args) throws Exception
{
    Date startTime = new Date();

    long endTime = startTime.getTime() + 5000;   //    +5 секунд
    Date endDate = new Date(endTime);

    Thread.sleep(3000);              // ждем 3 секунды

    Date currentTime = new Date();
    if (currentTime.after(endDate))//проверяем что время currentTime после endDate
    {
        System.out.println("End time!");
    }
}
}
