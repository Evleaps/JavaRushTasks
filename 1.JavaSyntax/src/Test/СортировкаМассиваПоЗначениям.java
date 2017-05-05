package Test;

/*
1.Отобразить для каждого числа количество его повторов в массиве.
2.Числа должны быть отсортированы в порядке убывания количества вхождений.
3. Числа с одинаковым количеством вхождений должны быть отсортированы по убыванию.
4.Вывести на экран в формате "число - количествоПовторов"
*/

import java.util.*;

public class СортировкаМассиваПоЗначениям {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 12, 3, 4, 4, 3, 89, 1, 5, 5, 5, 7, 7, 7};

        //узнаем количество вхождений
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i]))
                map.put(array[i], map.get(array[i]) + 1);
            else map.put(array[i], 1);
        }

        //отсортируем массив по значениям
        List list = new ArrayList((map.entrySet()));
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        /*
        Вывод с сортировкой по значениям
        7-3
        5-3
        4-3
        3-2
        1-2
        89-1
        12-1
        2-1
        */
        for (Object loly : list) {
            String str = loly.toString();
            System.out.println(str.replace("=", "-"));
        }
    }
}