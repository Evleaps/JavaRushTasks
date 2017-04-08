package com.javarush.task.task15НаследованиеSingletonКонструкторы.task15ПакетСПреобразованиемТиповИЛегкимиКонструкторами.task1507;

/* 
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, Object value, int mew, int mew1) {
        System.out.println("1");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, int mew, int mew1, int mew2) {
        System.out.println("2");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, int mew, int mew1, int mew2, int mew3) {
        System.out.println("3");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, int mew, int mew1, int mew2, int mew3, int mew4) {
        System.out.println("4");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, int mew, int mew2, int mew3, int mew4, int mew5, int mew6) {
        System.out.println("5");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, int mew, int mew1, int mew2, int mew3, int mew4, int mew5, int mew6) {
        System.out.println("6");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, int mew, int mew1, int mew2, int mew3, int mew4, int mew5, int mew6, int mew7) {
        System.out.println("7");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, int mew, boolean mew1) {
        System.out.println("8");
        printMatrix(m, n, (Object) value);
    }


}
