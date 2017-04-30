package com.javarush.task.task19.task1914ПольскаяНотация;

/* 
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + — *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов — нет.

Пример вывода:
3 + 6 = 9


Требования:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Stack;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream originalStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(originalStream);

        String operator = null;
        Stack<Integer> stackOperand = new Stack<>();

        String[] nu = outputStream.toString().split(" ");
        for (String s : nu) {
            if (s.matches("[+-]?\\d+")) { //если число - true
                stackOperand.push(Integer.valueOf(s));
            } else {
                if (s.equals("=")) break;
                else operator = s;
            }
        }

        int operand2 = stackOperand.pop();
        int operand1 = stackOperand.pop();

        if (operator.equals("+"))
            stackOperand.push(operand1 +  operand2);
        else {
            if (operator.equals("-"))
                stackOperand.push(operand1 -  operand2);
            else {
                if (operator.equals("*"))
                    stackOperand.push(operand1 *  operand2);
            }
        }

        System.out.println(outputStream.toString().replaceAll("\\p{Cntrl}", "") + stackOperand.peek().toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

