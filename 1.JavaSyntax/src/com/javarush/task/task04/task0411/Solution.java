package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        String timeOfYear;
        if(month >= 1 && month <= 2 || month == 12)
            timeOfYear = "зима";
        else if(month >= 3 && month <= 5)
            timeOfYear = "весна";
        else if(month >= 6 && month <= 8)
            timeOfYear = "лето";
        else
            timeOfYear = "осень";

        System.out.println(timeOfYear);
    }
}