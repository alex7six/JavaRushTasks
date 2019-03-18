package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        boolean visokosnyy;

        if ((int) t / 400 == (double) t / 400)
            visokosnyy = true;
        else if ((int) t / 100 == (double) t / 100)
            visokosnyy = false;
        else if ((int) t / 4 == (double) t / 4)
            visokosnyy = true;
        else
            visokosnyy = false;

        int x = 365;
        if (visokosnyy)
            x = 366;

        System.out.println("количество дней в году: " + x);

    }
}