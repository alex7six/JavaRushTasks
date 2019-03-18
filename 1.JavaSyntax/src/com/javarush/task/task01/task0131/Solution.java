package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код
        int metr = centimetre / 100;
        return metr;
    }
}