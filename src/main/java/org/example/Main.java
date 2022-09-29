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

class targil3 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[]args) {
        int a = reader.nextInt();
        System.out.println(" "+(a));
        System.out.println(" "+(a+1));
        System.out.println(" "+(a-2));
    }
}

class  targil {
    static  Scanner reader = new Scanner(System.in);
    public  static void main(String[] args){
        int a = reader.nextInt();
        System.out.println(a-10*a);
    }
}

class exempel2_8 {
    public static void main(String[] args){
        int x = 6;
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
}

class exempel2_9 {
    public static void main(String[] args){
        int x = 9;
        System.out.println("Значение x равно " + x);
        System.out.println("Квадрат x равен " + (x * x));
    }
}

class exempel2_10 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        System.out.println("Значение переменной х равно " + x + " Значение переменной у равно " + y);
        System.out.println("Поизведение переменных х и у равна " + (x * y) );
        System.out.println("Сумма переменных х и у равна " + (x + y));
    }
}

class exempel2_11 {
    public static void main(String[] args){
        String name = "Дарина Катык";
        String number = "+79788750317";
        System.out.println("****************");
        System.out.println("* " + name + " *");
        System.out.println("* " + number + " *");
        System.out.println("****************");
    }
}

class exempel2_12 {
    public static void main(String[] args){
        System.out.println("******");
        System.out.println(" ****");
        System.out.println("  **");
        System.out.println(" ****");
        System.out.println("******");
    }
}

class exempel2_13 {
    public static void main(String[] args){
        int x = 5;
        int y = 9;
        int z = x + y;
        System.out.println("Переменная x равна " + x);
        System.out.println("Переменная y равна " + y);
        System.out.println("Переменная z является суммой переменнаых x и y. Переменная z равна " + z);
        x = 8;
        y = x / 3;
        System.out.println("Теперь переменная х равна " + x);
        System.out.println("Теперь переменная у равна третьей части от переменной х. Это равно " + y);
    }
}

class  exempel2_14 {
    static  Scanner reader = new Scanner(System.in);
    public  static void main(String[] args){
        int a = reader.nextInt();
        System.out.println(a+10);
    }
}
class  exempel2_15 {
    static  Scanner reader = new Scanner(System.in);
    public  static void main(String[] args){
        int a = reader.nextInt();
        System.out.println(a*10);
    }
}

// 29.09.2022 книга глава 5 ст 125, задачи 2.16 ст. 12