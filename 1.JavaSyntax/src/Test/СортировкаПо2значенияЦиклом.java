package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*У Василия есть колода, состоящая из n карт. На каждой карте написано ровно одно целое число от 1 до 100. Все числа, написанные на картах, различны.
Василий решил отсортировать все карты в колоде. Для этого он по очереди берёт одну верхнюю карту из колоды и если число, написанное на ней,
минимальное среди всех оставшихся в колоде, он откладывает эту карту в сторону. В противном случае, Василий кладёт эту карту вниз колоды и
берёт сверху колоды следующую карту. Процесс заканчивается, когда в колоде не останется карт. Можно считать,
что Василий в любой момент времени знает минимальное число, записанное на оставшихся в колоде картах, но не знает, где она находится в колоде.
Перед вами стоит задача определить суммарное количество раз, которое Василий посмотрит верхнюю карту из колоды.

В первой строке следует целое положительное число n (1 ≤ n ≤ 100) — количество карт в колоде.

Во второй строке следует последовательность из n различных целых положительных чисел a1, a2, ..., an (1 ≤ ai ≤ 100),
где ai равно числу, написанному на i-й сверху карте из колоды.
*/

public class СортировкаПо2значенияЦиклом {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>();
        int sumNumber, integer;

        while (true) {
            sumNumber = scanner.nextInt();
            if (sumNumber < 1 || sumNumber > 100)
                System.out.println("Ошибка. Введите число от 1 до 100 включительно.");
            else break;
        }

        for (int i = 0; i < sumNumber; i++) {
            while (true) {
                integer = scanner.nextInt();
                if (integer < 1 || integer > 100)
                    System.out.println("Ошибка. Введите число от 1 до 100 включительно.");
                else {
                    list.add(integer);
                    sortedList.add(integer);
                    break;
                }
            }
        }
        Collections.sort(sortedList);
        sortList(list,sortedList);
    }

    public static void sortList(ArrayList<Integer> list, ArrayList<Integer> sortedList) {
        int i = 0;
        int minimum;
        int count = 0;
        while (!list.isEmpty()) {
            minimum = sortedList.get(i);

            if (list.get(0) < minimum) {
                list.remove(0);
                count++;
            }

            else if(list.get(0) > minimum){
                list.add(list.get(0));
                list.remove(0);
                count++;
            }

            else if (list.get(0) == minimum){
                list.remove(0);
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
}