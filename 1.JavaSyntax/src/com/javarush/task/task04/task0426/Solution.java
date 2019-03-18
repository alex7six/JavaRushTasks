package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        int b1 = Integer.parseInt(a1);

        if (b1 == 0)
            System.out.println("ноль");
        else if (b1 < 0)
        {
            if ((double) b1 / 2 == (int) b1 / 2)
                System.out.println("отрицательное четное число");
            else
                System.out.println("отрицательное нечетное число");
        }
        else
        {
            if ((double) b1 / 2 == (int) b1 / 2)
                System.out.println("положительное четное число");
            else
                System.out.println("положительное нечетное число");
        }
    }
}
