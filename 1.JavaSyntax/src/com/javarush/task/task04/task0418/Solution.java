package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);

        if (b1 > b2)
            System.out.println(b2);
        else
            System.out.println(b1);
    }
}