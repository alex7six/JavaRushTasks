package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        int b1 = Integer.parseInt(a1);
        int dlina = a1.length();
        String  chet = "нечетное";
        String razmer = "однозначное";
        if (dlina == 2)
            razmer = "двузначное";
        if (dlina == 3)
            razmer = "трехзначное";


        if (b1 > 0 && b1 < 1000) {
            if ((double) b1 / 2 == (int) b1 / 2)
                chet = "четное";

            System.out.println(chet + " " + razmer + " число");

        }
    }
}
