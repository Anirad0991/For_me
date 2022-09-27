package org.example;

public class Main {
    public static void main(String[] args) {
//        int beerNum = 99;
//        String word = "бутылок (бутылки)";
//
//        while (beerNum >= 1) {
//            if (beerNum == 1) {
//                word = "бутылка";
//            }
//
//            System.out.println(beerNum + " " + word + " пива на стене");
//            System.out.println(beerNum + " " + word + " пива.");
//            System.out.println("Возьми одну");
//            System.out.println("Пусти по кругу");
//            beerNum = beerNum - 1;
//            if (beerNum > 0) {
//                System.out.println(beerNum + " " + word + " пива на стене");
//            }else {
//                System.out.println("Нет бутылок пива на стене");
//            }
//        }


        class Dog {
            int size;
            String breed;
            String name;

            void bark() {
                System.out.println("Гав! Ваф!");
            }
        }

        class DogRestDrive {
            public static void main (String[] args) {
                Dog d = new  Dog();
                d.size = 40;
                d.bark();
                System.out.println(d.size);
            }
        }

    }

}



