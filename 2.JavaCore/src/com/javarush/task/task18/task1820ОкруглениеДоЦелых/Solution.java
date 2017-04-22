package com.javarush.task.task18.task1820ОкруглениеДоЦелых;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 — 3
3.50 — 4
3.51 — 4
-3.49 — -3
-3.50 — -3
-3.51 — -4

Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inStream = new FileInputStream(reader.readLine());
        BufferedWriter outStream = new BufferedWriter(new FileWriter(reader.readLine()));

        //предполагаем, что округлять мы будем по разному, по этому используем bigDecimal, а не math.round(math проще)

        String tranfer = "";
        while (inStream.available() > 0) {
            char data = ((char) inStream.read());
            tranfer = tranfer + String.valueOf(data);
        }

        String[] str = tranfer.split(" ");
        for (int i = 0; i < str.length; i++) {
            double numberLong = Double.parseDouble(str[i]);
            BigDecimal bigDecimal = new BigDecimal(numberLong);

            int res = bigDecimal.compareTo(BigDecimal.ZERO);

            double numberNew = 0;
            if (res >= 0)
                numberNew = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_UP).doubleValue();
            else
                numberNew = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_DOWN).doubleValue();
            int nu = (int) numberNew;

            outStream.write(nu + " ");
        }

        outStream.close();
        reader.close();
        inStream.close();
    }

    /*
ROUND_CEILING: В большую сторону

 0.333  ->   0.34
-0.333  ->  -0.33

ROUND_DOWN: Отбрасывание разряда

 0.333  ->   0.33
-0.333  ->  -0.33

ROUND_FLOOR: В меньшую сторону

 0.333  ->   0.33
-0.333  ->  -0.34

ROUND_HALF_UP: Округление вверх, если число после запятой >= .5

0.5  ->  1.0
0.4  ->  0.0

ROUND_HALF_DOWN: Округление вверх, если число после запятой > .5

0.5  ->  0.0
0.6  ->  1.0*/
}

































