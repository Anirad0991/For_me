package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   int x = 5;
   int y = 9;
   int z = x + y;
        System.out.println(z);
   double a = 7.5;
   double b = a * 2;
   double c = a * 3;
        System.out.println(b);
        System.out.println(c);
   int d = 2;
   int e = 8;
   int v = d * 10 + e;
        System.out.println(v);
   int l = 74;
   int i = l / 3;
        System.out.println(i);

        String new1 = "Hello world!";
        System.out.println(new1);

        String new2 = "H-e-l-l-o-,-f-r-i-e-n-d!";
        System.out.println(new2);

        String new3 = "+++";
        String new4 = "!!!!";
        String new5 = "??";
        System.out.println(new3);
        System.out.println(new4);
        System.out.println(new5);

        System.out.print(new3);
        System.out.print(new4);
        System.out.print(new5);
    }
}
class targil2 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println("aa="+(a*a));
        System.out.println("a10="+(a*10));
    }
}

