package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1527ПарсерСсылок;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) — для чисел (дробные числа разделяются точкой)
alert(String value) — для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double 3.14

Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Программа должна выводить данные на экран в соответствии с условием.
3. Программа должна вызывать метод alert с параметром double в случае,
если значение параметра obj может быть корректно преобразовано в число типа double.
4. Программа должна вызывать метод alert с параметром String в случае, если значение
параметра obj НЕ может быть корректно преобразовано в число типа double.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //ввод строки
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        reader.close();

//создали массив слов разбив строку на части от ? и до &
        String[] params = URL.split("\\?")[1].split("&");
        //тут мы выводим на экран все, но исключаем то, что до знака "="
        for (String param : params) {
            System.out.print(param.split("=")[0] + " ");
        }
        System.out.println();

        //если мы встретили obj то разбить элемент на части ну и далее тру кетч
        for (String param : params) {
            if ("obj".equals(param.split("=")[0])) {
                try {
                    alert(Double.parseDouble(param.split("=")[1]));
                } catch (NumberFormatException e) {
                    alert(param.split("=")[1]);
                }
            }
        }
    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
