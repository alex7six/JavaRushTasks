package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код

        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10;
        int digit = number - hundreds * 100 - tens * 10;


        return hundreds + tens + digit;

    }
}