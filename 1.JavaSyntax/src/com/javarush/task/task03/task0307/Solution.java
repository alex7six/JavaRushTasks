package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        for (int k = 1; k <= 5; k++)
        {
            Zerg zerg = new Zerg();
            zerg.name = "adasd" + k;
        //    System.out.println(zerg.name);
        }
        for (int k = 1; k <= 3; k++)
        {
            Protoss zerg = new Protoss();
            zerg.name = "adsd" + k;
            //  System.out.println(zerg.name);
        }
        for (int k = 1; k <= 4; k++)
        {
            Terran zerg = new Terran();
            zerg.name = "asd" + k;
         //   System.out.println(zerg.name);
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
