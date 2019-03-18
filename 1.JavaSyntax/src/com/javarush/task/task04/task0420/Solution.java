package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int m1, m2, m3;
        String text3, text1;

        // m3
        if (b1 >= b2 && b1 >= b3)
        {m3 = b1;
        text3 = "b1";}
        else if (b2 >= b1 && b2 >= b3)
        {m3 = b2;
        text3 = "b2";}
        else
        {m3 = b3;
        text3 = "b3";}

        // m1
        if (b1 <= b2 && b1 <= b3)
        {m1 = b1;
        text1 = "b1";}
        else if (b2 <= b1 && b2 <= b3)
        {m1 = b2;
        text1 = "b2";}
        else
        {m1 = b3;
        text1 = "b3";}

        // m2
        if (text3 == "b1" && text1 == "b2" || text3 == "b2" && text1 == "b1")
            m2 = b3;
        else if (text3 == "b3" && text1 == "b2" || text3 == "b2" && text1 == "b3")
            m2 = b1;
        else
            m2 = b2;

        System.out.println(m3 + " " + m2 + " " + m1);

    }
}
