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
        System.out.println("aa=" + (a * a));
        System.out.println("a10=" + (a * 10));
    }
}

class targil3 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(" " + (a));
        System.out.println(" " + (a + 1));
        System.out.println(" " + (a - 2));
    }
}

class targil {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(a - 10 * a);
    }
}

class exempel2_8 {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
}

class exempel2_9 {
    public static void main(String[] args) {
        int x = 9;
        System.out.println("Значение x равно " + x);
        System.out.println("Квадрат x равен " + (x * x));
    }
}

class exempel2_10 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println("Значение переменной х равно " + x + " Значение переменной у равно " + y);
        System.out.println("Поизведение переменных х и у равна " + (x * y));
        System.out.println("Сумма переменных х и у равна " + (x + y));
    }
}

class exempel2_11 {
    public static void main(String[] args) {
        String name = "Дарина Катык";
        String number = "+79788750317";
        System.out.println("****************");
        System.out.println("* " + name + " *");
        System.out.println("* " + number + " *");
        System.out.println("****************");
    }
}

class exempel2_12 {
    public static void main(String[] args) {
        System.out.println("******");
        System.out.println(" ****");
        System.out.println("  **");
        System.out.println(" ****");
        System.out.println("******");
    }
}

class exempel2_13 {
    public static void main(String[] args) {
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

class exempel2_14 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(a + 10);
    }
}

class expel2_15 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(a * 10);
    }
}

// 29.09.2022 книга глава 5 ст 125, задачи 2.16 ст. 12

/*
class SeeWar {

    public class SimpleDotComTestDrive{
        public static void main (String[] args){
            SimpleDotCom dot = new SimpleDotCom();
            int[] location = {2, 3, 4};
            dot.setLocationCells(location);

            String  userGuess = "2";
            String result = dot.checkYourself(userGuess);

            String testResult = "Неудача";
            if(result.equals("Попал")){
                testResult = "Пройден";
            }
            System.out.println(testResult);
        }
    }
    public class SimpleDotCom{
        int [] locationCells;
        int numOfHits = 0;

        public void  setLocationCells(int[] locs) {
            locationCells = locs;
        }

        public String checkYourself(String stringGuess) {
            int guess = Integer.parseInt(stringGuess);
            String result = "Мимо";

            for (int cell : locationCells){
                if(guess == cell){
                    result = "Попал";
                    numOfHits++;
                    break;
                }
            }
            if(numOfHits == locationCells.length){
                result = "Потопил";
            }
            System.out.println(result);
            return result;

        }
        public static  void main (String[] args){
            int numOfGuesses = 0;
            GameHelper helper = new GameHelper();


            SimpleDotCom theDotCom = new SimpleDotCom();

            int randomNum = (int) (Math.random()*5);

            int[] location = {randomNum, randomNum+1, randomNum+2};
            theDotCom.setLocationCells(location);
            boolean isAlive = true;

            while (isAlive == true) {
                String guess = helper.getUserInputs("Введите число");
                String result = theDotCom.checkYourself(guess);
                numOfGuesses++;
                if (result.equals("Потопил")) {
                    isAlive = false;
                    System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
                }
            }


        }
    }
}
 */

// страница 142 нужно добавить код про helper

class example2_16 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println(x + 6);
        System.out.println(x - 12);
    }
}

class example2_17 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println(x * x);
    }
}

class example2_18 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println(x * x + "&" + x * x * x);
    }
}

class example2_19 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        System.out.println((x - 1) + " " + x + " " + (x + 1));
    }
}

class example2_20 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        if (x > 0) {
            int y = Math.abs(x) * -1;
            System.out.println(x);
            System.out.println(y);
        } else if (x < 0) {
            int y = Math.abs(x);
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(x);
            System.out.println(x);
        }
    }
}

class example2_21 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = x + 1;
        int z = y + 1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class example2_22 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(x - y);
        System.out.println(y - x);
    }
}

class example2_23 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println(x * x);
        System.out.println(y * y);
        System.out.println((x * x) + (y * y));
    }
}

class example2_24 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println(x * x);
        System.out.println(y * y);
        System.out.println((x * x) + (y * y));
    }
}

class example2_25 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = reader.nextInt();
        int z = reader.nextInt();

        System.out.println("Объем параллелепипеда = " + (x * y * z));
        System.out.println("Площадь каждой грани параллелепипеда = " + (x * y) + " " + (z * y) + " " + (z * x));
        System.out.println("Общая площадь параллелепипеда = " + ((x * y) * 2 + (z * y) * 2 + (x * z) * 2));
        System.out.println("Общий периметр параллелепипеда = " + ((x * 4) + (4 * y) + (4 * z)));
    }
}

class example2_26 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int age = reader.nextInt();
        int year = reader.nextInt();

        if (year > age) {
            System.out.println("Твой возраст " + (year - age));
        } else {
            System.out.println("Ты еще не родился)))");
        }
    }
}

class example2_27 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double milliGrams = reader.nextInt();

        System.out.println(milliGrams / 1000);

    }
}

class example2_28 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double kab = reader.nextInt();
        double metr = kab * 185.2;
        double kilometr = metr / 1000;
        if (kab >= 0) {
            System.out.println("Метров " + metr);
            System.out.println("Километров " + kilometr);
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
}

class example2_29 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        double hour = reader.nextDouble();
        double sekunda = hour * 3600;
        if (hour >= 0) {
            System.out.println(sekunda);
        } else {
            System.out.println("Отрицательного времени не существует");
        }
    }
}

class example2_30 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        int hour = reader.nextInt();
        int min = reader.nextInt();

        if (hour <= 23 & hour >= 0 || min <= 59 & min >= 0) { // условие для того что-бы получаь только корректное время, если оно не корректное будем уходить в ошибку
            int secFromMid = hour * 3600 + min * 60; // вычесляю сколько секунд прошло от полуночи до полученного времени
            int minFromMid = secFromMid / 60; // вычесляю сколько минут прошло от полуночи до полученного времени

            int secToMid = 86440 - secFromMid; // вычесляю сколько секунд сталось до полуночи от полученного времени
            int minToMid = 1440 - minFromMid; // вычесляю сколько минут сталось до полуночи от полученного времени

            System.out.println("Секунд прошло с полуночи " + secFromMid + ". Минут прошло с полуночи " + minFromMid);
            System.out.println("Секунд до полуночи " + secToMid + ". Минут до полуночи " + minToMid);
        }else {
            System.out.println("Значение не попадает в диапазон часов и минут");
        }
    }
}

// Задачи 2.31, использование библиотеки java

class example2_31 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double m = reader.nextDouble(); // масса
        double v =reader.nextDouble(); // скорость
        double a = 2;
        v = Math.pow(v, a); // возводим в квадрат скорость
        double e = m * v / 2; // формула кинетической энергии тела
        System.out.println(e);
    }
}

class example2_32 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double x = reader.nextDouble();
        x = 1 / x; // формула поиска обратного числа
        System.out.println(x);
    }
}
class example2_33 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
       double a = reader.nextDouble(); // основание первое
       double b = reader.nextDouble(); // основание второе
       double h = reader.nextDouble(); // высота трапеции

        double s = ( (a + b) / 2) * h; // площадь трапеции с двумя основаниями и высотой
        double s1 = 0.5 * (a + b) * h;
        System.out.println(s);
        System.out.println(s1);
    }
}
class example2_34 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
    String firstWord = "Привет,";
    String name = reader.nextLine(); // считываем строку с помощью сканера

        System.out.println(firstWord + " " + name);
    }
}

class example2_35 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName = reader.nextLine(); // считываем строку с помощью сканера
        String lastName = reader.nextLine(); // считываем строку с помощью сканера
        String word = "Вас зовут ";

        System.out.println(word + firstName + " " + lastName);
    }
}

class example2_36 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String lastName = reader.nextLine(); // считываем строку с помощью сканера
        String city = reader.nextLine();
        String sentens = "Пассажир " + lastName + " вылетает в " + city;

        System.out.println(sentens);
    }
}

class example2_37 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName = reader.nextLine(); // считываем строку с помощью сканера
        String lastName = reader.nextLine(); // считываем строку с помощью сканера

        System.out.println(firstName + " " + lastName);
        System.out.println(lastName + " " + firstName);
    }
}

class example2_38 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName = reader.nextLine(); // считываем строку с помощью сканера
        String middleName = reader.nextLine();
        String lastName = reader.nextLine(); // считываем строку с помощью сканера

        String init = firstName.substring(0, 1); // метод строковой переменной который возвращает по индексу нужный символ, можно только начальный и тогда вернется все
        String init1 = middleName.substring(0, 1);
        String init2 = lastName.substring(0, 1);
            System.out.println(init + init1 + init2);

    }
}

class example2_39 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName = reader.nextLine(); // считываем строку с помощью сканера
        String middleName = reader.nextLine();
        String lastName = reader.nextLine(); // считываем строку с помощью сканера

        String init = firstName.substring(0, 1); // метод строковой переменной который возвращает по индексу нужный символ, можно только начальный и тогда вернется все
        String init1 = middleName.substring(0, 1);
        String sentens = init + "." + init1 + ". " + lastName;
        System.out.println(sentens);
    }
}

//Наследование и полиморфизм ст 189. Задачи переходи к третьему разделу, иди писать следующий класс пользуйся публичными переменными не копипасти все методы

























