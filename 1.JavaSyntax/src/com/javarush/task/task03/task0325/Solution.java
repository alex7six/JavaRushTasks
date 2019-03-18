package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String Salary = bufferedReader.readLine();
        int sSalary = Integer.parseInt(Salary);

        System.out.println("Я буду зарабатывать $" + sSalary + " в час");

    }
}
