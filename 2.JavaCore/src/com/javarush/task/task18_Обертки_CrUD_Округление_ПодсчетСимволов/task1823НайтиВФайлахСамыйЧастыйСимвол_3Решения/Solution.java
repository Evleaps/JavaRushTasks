package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1823НайтиВФайлахСамыйЧастыйСимвол_3Решения;

import java.io.*;
import java.util.*;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово «exit«.!
Передайте имя файла в нить ReadThread.!
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String — это имя файла, параметр Integer — это искомый байт.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем, нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        while (true) {
            file = reader.readLine();
            if (file.equals("exit")) break;
            new ReadThread(file).start();
        }

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String filename;

        public ReadThread(String fileName) throws FileNotFoundException {
            this.filename = fileName;
            //implement constructor body
        }

        @Override
        public void run() {
            try {
                FileInputStream inStream = new FileInputStream(filename);
                HashMap<Integer, Integer> map = new HashMap<>();

                while (inStream.available() > 0) {
                    int symbol = inStream.read();
                    if (map.containsKey(symbol))
                        map.put(symbol, map.get(symbol) + 1);
                    else
                        map.put(symbol, 1);
                }

                int maxSymbol = 0;
                int maxCount = 0;

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (maxCount < entry.getValue()) {
                        maxCount = entry.getValue();
                        maxSymbol = entry.getKey();
                    }
                }

                resultMap.put(filename,maxSymbol);
                inStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
ЕЩЕ ОДИН НЕ ПЛОХОЙ СПОСОБ

public void run() {
            try {
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileName));
                int nextByte;
                //найдем все символы в диапазоне кода от 0 до 256
                int[] bytesCount = new int[256];
                while ((nextByte = in.read()) != -1) {
                    if (nextByte < -1) throw new RuntimeException();
                    //если встретился такой символ, то счетчик +1
                    bytesCount[nextByte]++;
                }
                //а теперь просто найдем максимум
                int maxI = 0;
                for (int i = 1; i < bytesCount.length; i++)
                    if (bytesCount[i] > bytesCount[maxI])
                        maxI = i;
                synchronized (Solution.class) {
                    resultMap.put(fileName, maxI);
                }
                //System.out.println(maxI);
                in.close();



    И ЕЩЕ, ИЗНАЧАЛЬНО Я ПИСАЛ ТАК
@Override
        public void run() {
            try {
                FileInputStream inStream = new FileInputStream(filename);
                HashMap<Character, Integer> map = new HashMap<>();

                while (inStream.available() > 0) {
                    Character symbol = (char) inStream.read();
                    if (map.containsKey(symbol))
                        map.put(symbol, map.get(symbol) + 1);
                    else
                        map.put(symbol, 1);
                }
            //сортировка по значениям по убыванию
                List list = new ArrayList(map.entrySet());
                Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue() - o1.getValue();//по убыванию
                    }
                });
          //говнокод получился из-за моего желания решить через обычную карту с Character
                String s1 = list.get(0).toString().split("=")[1] + "";
                int nu = Integer.parseInt(s1); - это для себя, узнаем сколько повторений было

                //преобразовал букву из строки в код
                String s2 = list.get(0).toString().split("=")[0] + "";
                char ch = s2.charAt(0);

                int letter = (int) ch;
                resultMap.put(filename, letter);

                inStream.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
