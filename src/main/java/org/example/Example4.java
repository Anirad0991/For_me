package org.example;

import java.util.Scanner;

/*
public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(getTwoNumberReverse(x));

    }

    public static int getTwoNumberReverse(int a) { // двухзначное число в обратном порядке
            int c = a / 10; // делим двухзначное число на 10 и получаем первую цифру
            int b = a % 10; // делим на 10 по модулю и получаем остаток
            String st = b + "" + c;
            a = Integer.parseInt(st);
            return a;
    }
}
*/

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

class Example4_7 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); //
        int a = (mod % 10 ) * 10; // вторую цифруу преобразуем в десятки
        int b = mod / 10; // первую цифру преобразуем в единицы
        System.out.println(a + b + 8 ); // выводим сумму плюс 8

    }
}

class Example4_8 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = mod / 100; // делаем единицы из сотен
            int b = ((mod % 100 ) / 10) * 10; //делим без остатка на 100 и остаток на 10, делаем из неё двухзначную
            int c = (mod % 10) * 100; // делаем сотни из единиц
            System.out.println(a +  b + c - 20); // от суммы отнимаем 20
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_9 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        int mod = in.nextInt();
        int a = mod / 10 ; // первая цифра числа
        int b = mod % 10; // вторая цифра числа
        System.out.println(a + b); // выводим на экран ес числа, вес числа эт сумма его цифр

    }
}

class Example4_10 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = mod / 100; // делим без остатка на 100 получаем первую цифру
            int b = (mod % 100 ) / 10; //делим без остатка на 100 и остаток на 10
            int c = mod % 10; // модулем выясняем последнюю цифру
            System.out.println(a + b + c); // выводим результат через пробел
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_11 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        int mod = in.nextInt();
        int a = mod / 10; // первая цифра числа десятки
        int b = mod % 10; // вторая цифра числа
        System.out.println(a - b); // выводим на экран длину числа, длинна числа десятки минус единицы

    }
}

class Example4_12 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = mod / 100; // делим без остатка на 100 получаем первую цифру
            int b = (mod % 100 ) / 10; //делим без остатка на 100 и остаток на 10
            int c = mod % 10; // модулем выясняем последнюю цифру
            System.out.println((a - c) * b); // выводим результат через пробел
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_13_1 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args){ // вспомогательный метод для вычисления четное число или не четное
        int a = in.nextInt();
        if((a%2)==0){
            System.out.println("Число " + a + " четное ");
        }else{
            System.out.println("Число " + a + " нечетное ");
        }

    }
}

class Example4_13 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        int mod = in.nextInt();
        if (mod > 0) {
            int a = mod / 10; // первая цифра числа десятки
            int b = mod % 10; // вторая цифра числа
            int c = 0; //четность числа

            if ((a % 2) == 0) { // первое число четное или нет
                c = c + 1;
            }

            if ((b % 2) == 0) { // второе число четное или нет
                c = c + 1;
            }

            System.out.println("Степень четности числа " + mod + " равна " + c); // выводим на экран четность числа, четность числа это количество четных цифр в числе
        }else {
            System.out.println("Вы вводите отрицательное число");
        }
    }
}

class Example4_14 {
    public static Scanner in = new Scanner(System.in); //
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = mod / 100; // делим без остатка на 100 получаем первую цифру
            int b = (mod % 100 ) / 10; //делим без остатка на 100 и остаток на 10 получаем вторую цифру
            int c = mod % 10; // модулем выясняем последнюю цифру
            int d = 0; //четность числа

            if ((a % 2) == 0) { // первое число четное или нет
                d = d + 1;
            }
            if ((b % 2) == 0) { // первое число четное или нет
                d = d + 1;
            }
            if ((c % 2) == 0) { // первое число четное или нет
                d = d + 1;
            }

            System.out.println("Степень четности числа " + mod + " равна " + d); // выводим на экран четность числа, четность числа это количество четных цифр в числе
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_15 {
    public static Scanner in = new Scanner(System.in); //

    public static void main(String[] args) { //
        int mod = in.nextInt(); // принимаем четырех число
        if (mod > 0) {
            int x = mod / 1000;// выясняем первую цифру
            int a = (mod % 1000) / 100; // делим по модулю
            int b = (mod % 100) / 10; //
            int c = mod % 10; // модулем выясняем последнюю цифру
            int d = 0; //четность числа

            if ((x % 2) == 0) { // первое число четное или нет
                d++;
            }
            if ((a % 2) == 0) { // первое число четное или нет
                d++;
            }
            if ((b % 2) == 0) { // первое число четное или нет
                d++;
            }
            if ((c % 2) == 0) { // первое число четное или нет
                d++;
            }

            System.out.println("Степень четности числа " + mod + " равна " + d); // выводим на экран четность числа, четность числа это количество четных цифр в числе
        } else {
            System.out.println("Число не подходит под описание");
        }

        }
    }

    // книга на чтранице 72 подзагловок се объекты..., задачи 4_16, перечитай свои комментарии бери следующие два понятия
class Example4_16 {
        public static Scanner in = new Scanner(System.in); /* Назовем «перестановкой» операцию над числом, при которой его первая и последняя цифры меняются местами. Например, из числа 1234
получается число 4231. Напишите программу, которая принимает с
клавиатуры тр */
        public static void main (String[] args){ //
            int mod = in.nextInt(); // принимаем трехзначное число
            if (mod >=100 && mod <999) {
                int a = mod / 100; // делим без остатка на 100 получаем первую цифру
                int b = (mod % 100 ) / 10; //делим без остатка на 100 и остаток на 10
                int c = mod % 10; // модулем выясняем последнюю цифру
                System.out.println(c + "" + b + "" +a); // выводим результат через пробел
            } else {
                System.out.println("Число не подходит под описание");
            }
        }
    }

class Example4_17 {
    public static Scanner in = new Scanner(System.in); //

    public static void main(String[] args) { //
        int mod = in.nextInt(); // принимаем четырех число
        if (mod > 0) {
            int x = mod / 1000;// выясняем первую цифру
            int a = (mod % 1000) / 100; // делим по модулю
            int b = (mod % 100) / 10; //
            int c = mod % 10; // модулем выясняем последнюю цифру

            System.out.println(c + "" + a + "" + b + "" + x); // выводим на экран перестроинное число
        } else {
            System.out.println("Число не подходит под описание");
        }

    }
}

class Example4_18 {
    public static Scanner in = new Scanner(System.in); /*Назовем «линейным сдвигом числа влево» операцию, при которой его
цифры перемещаются на одну позицию влево (единицы - на место
десятков, десятки - на место сотен, сотни - на место тысяч и так далее) - при это
     */
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем четырех число
        if (mod > 0) {
            int x = mod / 1000;// выясняем первую цифру
            int a = (mod % 1000) / 100; // делим по модулю
            int b = (mod % 100) / 10; //
            int c = mod % 10; // модулем выясняем последнюю цифру
            String st = a + "" + b + "" + c + "" + 0;
            int y = Integer.parseInt(st);
            System.out.println(y); // выводим на экран перестроинное число
        } else {
            System.out.println("Число не подходит под описание");
        }
    }
}

class Example4_19 {
    public static Scanner in = new Scanner(System.in); /* Kbytqysq cldbu lkz nht[pyfxyjuj xbckf */
    public static void main (String[] args){ //
        int mod = in.nextInt(); // принимаем трехзначное число
        if (mod >=100 && mod <999) {
            int a = mod / 100; // делим без остатка на 100 получаем первую цифру
            int b = (mod % 100 ) / 10; //делим без остатка на 100 и остаток на 10
            int c = mod % 10; // модулем выясняем последнюю цифру
            String st = b + "" + c + "" + 0;
            int y = Integer.parseInt(st);
            System.out.println(y); // выводим на экран перестроинное число
        } else {
            System.out.println("Число не подходит под описание");
        }
    }
}



// книга страница 88, задачи ст 25, попробуй начать создавать класс и методы что-бы все переоформить и работать в рамках класса и методов, новые понятия из таблицы




















