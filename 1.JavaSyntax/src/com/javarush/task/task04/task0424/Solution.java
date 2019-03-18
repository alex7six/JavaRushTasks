package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
        String a3 = bufferedReader.readLine();
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);
        int b3 = Integer.parseInt(a3);

        int por = 0;

        if (b2 != b1 && b1 == b3)
            por = 2;
        else if (b3 != b2 && b2 == b1)
            por = 3;
        else if (b1 != b2 && b2 == b3)
            por = 1;

        if (por != 0)
        System.out.println(por);

    }
}
