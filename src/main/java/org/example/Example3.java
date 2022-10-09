package org.example;

import java.util.Scanner;

public class Example3 { // класс для перевода градусов по фарингейту в градусы по цельсию
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        double far = in.nextDouble();

        int cel = 5 * ((int) far - 32) / 9; // формула для перевода градусов по цельсию в градусы по фарнгейту, приводим значение доубл к инту
        System.out.println(cel);
    }
}

 class Example3_2 {
    public static Scanner in = new Scanner(System.in); // метод для перевода сантиметров в дюймы
    public static void main (String[] args){ // переводим сантиметры в дюймы 1см = 2,54 сантметрам
        double sant = in.nextDouble();

        double duim = sant / 2.54; // перевод сантиметров в дюймы
        System.out.println( sant + " сантиметров -- это дюймов " + duim );
    }
}

class Example3_3 {
    public static Scanner in = new Scanner(System.in); // метод для перевода дймов в сантимтры
    public static void main (String[] args){ // переводим сантиметры в дюймы 1см = 2,54 сантметрам
        double duim = in.nextDouble();

        double sant = duim * 2.54; // перевод сантиметров в дюймы
        System.out.println( duim + " дюймов -- это саниметров " + sant);
    }
}

// закончила с задачами на сторанице 19, книгу читай со страницы 189,я сегодня не осилила чтение
// читай книгу со страницы 222, задачи не трогала, продолжай третий раздел

class Example3_4 {
    public static Scanner in = new Scanner(System.in); // метод для пересчета валюты
    public static void main (String[] args){ //
        double valuta1 = in.nextDouble(); // принимаем сумму первой валюты
        double coefficient = in.nextDouble(); // банковский коэфициент

        double valuta2 = valuta1 * coefficient;// пересчет в валюту два
        System.out.println(valuta1 + " долларов равно " + valuta2 + " рублей");
    }
}
class Example3_5 {
    public static Scanner in = new Scanner(System.in); // метод площадь и периметр прямоугольного треугольника
    public static void main (String[] args){
        double a = in.nextDouble(); // катет
        double b = in.nextDouble(); // катет
        double c = in.nextDouble(); // гипотенуза

        double p = a + b + c; // периметр треугольника
        double s = (a * b) / 2 ; // площадь треугольникиа
        System.out.println("Периметр равен " + p + " Площадь равна " + s);
    }
}
class Example3_6 {
    public static Scanner in = new Scanner(System.in); // три следующие числа с шагом в две единицы
    public static void main (String[] args){
        int a = in.nextInt();
        int b = a + 2;
        int c = b + 2;
        int d = c + 2;

        System.out.println(b + ", " + c + ", " + d);

    }
}
class Example3_7 {
    public static Scanner in = new Scanner(System.in); // три предыдущих числа
    public static void main (String[] args){
        int a = in.nextInt();
        int b = a - 1;
        int c = b - 1;
        int d = c - 1;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class Example3_9 {
    public static Scanner in = new Scanner(System.in); // васины счастливые крышки
    public static void main (String[] args){
        int a = in.nextInt(); // крышки 10 б
        int b = in.nextInt();// крышки 100 б
        int c = in.nextInt();// крышки 1000 б

        int d, e, f;
        d = 10; // крышка стоит 10 баллов
        e = 100; // крышка стоит 100 баллов
        f = 1000; // крышка стоит 1000 баллов


        System.out.println("Общее количество баллов Васи равно " + ((a*d) + (b*e) + (c*f)));

    }
}
class Example3_10 {
    public static Scanner in = new Scanner(System.in); // Вася едет за границу
    public static void main (String[] args){
        double a = in.nextDouble(); // Васины деньги в рублях
        double b = in.nextDouble();// Дали родители в рублях
        double c = in.nextDouble();// курс евро
        System.out.println("Общее количество денег Васи равно " + ((a + b) / c));
    }
}