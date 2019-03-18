package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sDigit = bufferedReader.readLine();
        int digit = Integer.parseInt(sDigit);

        if (digit > 0)
        {
            digit = digit * 2;
        }
        else if (digit < 0)
        {
            digit = digit + 1;
        }

        System.out.println(digit);

    }

}