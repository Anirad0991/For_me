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