package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        secondsAfter15 =  ((int)(15.5 * 60) - 15 * 60) * 60 ;
        System.out.println(secondsAfter15);
    }
}