package Test.РаботаСдатами;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
Самое важное использовать самые вместительные примитивы, ибо факториал очень быстро пееполнит long,
 а само число Эйлера имеет бесконечное число знаков после запятой
 найди на плюсах класс или примитив без каких либо ограничений
 */
public class OksankaClass {
    public static void main(String[] args) throws InterruptedException {
        int eps = 100; //точность вычислений
        long n = 0;
        BigDecimal e = BigDecimal.ZERO; //число Эйлера равно 0

       /**Оксан, тут мы в бесконечном цикле находим Эйлера. т.е. Эйлер равен (предыдущее значение Эйлера) + 1/факториал от n
        * mc это параметр округления, в данном случае до 10 знаков. Например при делении 1/6 будет 0,1666666667
        * ЗАДАНИЕ говорит, найти n операций сложения для достижения точности esp, т.е. я превратил число в строку и
        * в if(если длина числа после точки больше esp) то ... и останавливаем цикл
        * иначе, цикл снова в работу, берем Эйлера и прибавляем к нему очередое выражение.
        * Заметь, в цикле мы прибавляем n+1, см формулу нахождения в задании, от 0 стремится к бесконечности*/
        while (true) {
            MathContext mc = new MathContext(10, RoundingMode.HALF_UP);//округление до 10
            e = e.add(BigDecimal.ONE.divide(factorialNotRecursion(n),mc));//находим Эйлера, factorialNotRecursion этот метод придется тоже написать
            n++;//+1
            String checkForLenght = e.toString();//преобразуем в строку
            System.out.println(checkForLenght);//вывод на экран, для наглядности

            try {
                if (checkForLenght.split("\\.")[1].length() >= eps) {//если нужная нам точность соблюдена,
                    System.out.println("Число Эйлера с заданной точностью в " + eps + " символов требует " + n + " членов суммы.");
                    break;//останавливаем программу
                }
            } catch (ArrayIndexOutOfBoundsException err) {}//блок try..catch отлавливает возможные ошибки
        }
//так как наше число может получиться с большей точностью, чем нужно, мы обрежем до eps знаков после запятой
        BigDecimal eylar = e.setScale(eps, RoundingMode.UP);
        System.out.println("Число Эйлера = " + eylar);//выведем на экран
}

/** нахождение факториала, погугли на плюсы с самым вместительным примитивом\классом*/
    public static BigDecimal factorialNotRecursion(long n) {
        BigDecimal reg = BigDecimal.ONE;
        if (n == 0) return reg;
        for (int i = 1; i <= n; i++) reg = reg.multiply(BigDecimal.valueOf(i));
        return reg;
    }
}
