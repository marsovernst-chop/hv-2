package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(metod(15,15));
        System.out.println(metod(20,-10));
        System.out.println(metod(45,28));
        System.out.println(metod(18,-20));
        System.out.println(metod(60,17));

    }

    public static String metod(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age > 0 && age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }
}
