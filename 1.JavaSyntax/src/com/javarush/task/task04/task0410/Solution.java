package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //напишите тут ваш код
        boolean result = false;

        if(a <= 100 && a >= 50)
            result = true;

        if (result)
            System.out.println("Число " + a + " содержится в интервале.");
        else
            System.out.println("Число " + a + " не содержится в интервале.");
    }
}