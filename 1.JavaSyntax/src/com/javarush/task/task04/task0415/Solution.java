package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите число:");

        int number = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

//        boolean result = true;

        if ((number + number2) <= number3 || (number + number3) <= number2 || (number3 + number2) <= number)
        {
            System.out.println("Треугольник не существует.");
        }
        else
            System.out.println("Треугольник существует.");

//        if (result)
//        {
//            System.out.println("Треугольник существует.");
//        }
//        else
//        {
//            System.out.println("Треугольник не существует.");
//        }
    }
}