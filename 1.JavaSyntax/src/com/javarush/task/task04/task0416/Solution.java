package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите число:");

        double t = sc.nextDouble();

//        if (t < 0 || t > 60)
//            System.out.println("Input illegal digit");
//        else
//        {

            int m = (int) t;
            while (m > 4)
            {
                m = m - 5;
            }

            if (m >= 0 && m < 3)
                System.out.println("зеленый");
            else if (m >= 3 && m < 4)
                System.out.println("желтый");
            else
                System.out.println("красный");

        //}

    }
}