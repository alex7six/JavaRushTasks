package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int age = Integer.parseInt(sAge);

        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
