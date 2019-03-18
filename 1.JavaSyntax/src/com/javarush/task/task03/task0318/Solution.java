package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String eayrs = bufferedReader.readLine();
        int goda = Integer.parseInt(eayrs);
        String name = bufferedReader.readLine();

        System.out.println(name + " захватит мир через " + goda + " лет. Му-ха-ха!");
    }
}
