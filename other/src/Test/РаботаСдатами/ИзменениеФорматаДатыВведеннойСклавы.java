package Test.РаботаСдатами;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class ИзменениеФорматаДатыВведеннойСклавы {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy"); //обозначил формат ввода
        Date date = format.parse(reader.readLine());//создал дату, format.передать(считываем с клавы)
        SimpleDateFormat outFormat = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);//нов формат
        String result = outFormat.format(date).toUpperCase();//т.к.текст то стринг, поднимаем регистр toUpperCase()
        System.out.println(result);//вывод
    }
}
