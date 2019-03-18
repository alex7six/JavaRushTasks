package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s1 = "Мама", s2 = "Мыла", s3 = "Раму";
        System.out.println(mix1(s1, s2, s3));
        System.out.println(mix1(s1, s3, s2));
        System.out.println(mix1(s2, s1, s3));
        System.out.println(mix1(s2, s3, s1));
        System.out.println(mix1(s3, s2, s1));
        System.out.println(mix1(s3, s1, s2));


    }

    public static String mix1(String s1, String s2, String s3)
    {
        return s1 + s2 + s3;
    }

}
