package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        for (int k = 1; k <= 10; k++)
        {

            for (int n = 1; n <= 10; n++)
            {
                System.out.print(k*n);
                System.out.print(" ");
            }
            System.out.println();


        }
    }
}
