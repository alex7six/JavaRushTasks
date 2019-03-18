package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if (number == number2 && number2 == number3)
        {
            System.out.println(number + " " + number2 + " " + number3);
        }
        else if (number == number2)
        {
            System.out.println(number + " " + number2 );
        }
        else if (number == number3)
        {
            System.out.println(number + " " + number3 );
        }
        else if (number2 == number3)
        {
            System.out.println(number2 + " " + number3 );
        }

    }
}