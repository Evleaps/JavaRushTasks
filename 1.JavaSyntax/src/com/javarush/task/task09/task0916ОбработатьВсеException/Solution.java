package com.javarush.task.task09.task0916ОбработатьВсеException;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..catch
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj) {
        try {

        obj.method1();
        obj.method2();
        obj.method3();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
