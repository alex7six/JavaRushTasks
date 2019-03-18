package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
        String a3 = bufferedReader.readLine();
        String a4 = bufferedReader.readLine();
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);
        int b3 = Integer.parseInt(a3);
        int b4 = Integer.parseInt(a4);

        int max = b1;

        if (b2 > max)
            max = b2;
        if (b3 > max)
            max = b3;
        if (b4 > max)
            max = b4;

        System.out.println(max);

    }
}
