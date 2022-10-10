package org.example;

import java.util.Scanner;

class Example4_1 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем двухзначное число
        if (mod >=10 && mod <100) {
            int a = mod / 10; // делим двухзначное число на 10 и получаем первую цифру
            int b = mod % 10; // делим на 10 по модулю и получаем остаток
            System.out.println(a + " " + b); // выводим результат через пробел
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_2 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = mod / 100; // делим без остатка на 100 получаем первую цифру
            int b = (mod % 100 )/ 10; //делим без остатка на 100 и остаток на 10
            int c = mod % 10; // модулем выясняем последнюю цифру
            System.out.println(a + " " + b + " " + c); // выводим результат через пробел
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_3 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем двухзначное число
        if (mod >=10 && mod <100) {
            int a = mod / 10; // делим двухзначное число на 10 и получаем первую цифру
            int b = mod % 10; // делим на 10 по модулю и получаем остаток
            System.out.println(b + " " + a); // выводим результат через пробел
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_4 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = mod / 100; // делим без остатка на 100 получаем первую цифру
            int b = (mod % 100 )/ 10; //делим без остатка на 100 и остаток на 10
            int c = mod % 10; // модулем выясняем последнюю цифру
            System.out.println(c + " " + b + " " + a); // выводим результат через пробел
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_5 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем двухзначное число
        if (mod >=10 && mod <100) {
            int a = (mod / 10) * 10; //выясняем какая первая цифра, а потом делаем из неё двухзначную
            int b = mod % 10; //выясняем остаток от введенной цифры
            System.out.println(a + "+" + b); // выводим в полном виде
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_6 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = (mod / 100) * 100; // делим без остатка на 100 получаем первую цифру и делаем из неё трехзначную
            int b = ((mod % 100 ) / 10) * 10; //делим без остатка на 100 и остаток на 10, делаем из неё двухзначную
            int c = mod % 10; // модулем выясняем последнюю цифру
            System.out.println(a + "+" + b + "+" + c); // выводим результат через пробел
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

// страница 60 в фил-соф java, задача 4.7 в задачнике, возьми следующий набор значений в таблице Валеры