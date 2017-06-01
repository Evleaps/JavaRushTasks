package Test.РаботаСдатами;


import java.util.Date;

public class СколькоПрошлоВремениСНачалаДня
{
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }
}
