package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner dataBase = new Scanner(System.in);
        System.out.println("Вводите через Enter ваше имя, Возраст, Температуру воздуха:");
        String name = dataBase.nextLine();
        int age = dataBase.nextInt();
        int temperature = dataBase.nextInt(); !!я бы хотел выводить на консоль ввод данных и результат, не подскажите?*/
        boolean b = basa(23, 30);
        boolean c = basa(10,44);
        boolean d = basa(20,20);
        boolean e = basa(30,60);
        boolean f = basa(14,15);

        int a = generateRandomAge();

    }

    public static boolean basa(/*String name какой тип вместо void я должен прописать для строчных и целых чисел?*/int age, int temperature) {
        if (age >= 20  && age <= 45 && temperature >= -20 && temperature <= 30){
            System.out.println("You be allowed to walk away");
            return true;
        } else if (age <= 20 && temperature >=0 && temperature <= 28){
            System.out.println("You be allowed to walk away");
            return true;
        } else if(age >= 45 && temperature >= -10 && temperature <= 25){
            System.out.println("You be allowed to walk away");
            return true;
        } else {
            System.out.println("Stay at home!");
            return false;
        }
    }
    public static int generateRandomAge(){
        int a = 1+(int)(Math.random()*101);
        if (a<16 || a>70){
            System.out.println("You couldn't leave a home");
        } else {
            System.out.println("Yeah, you be able to leave home");
        }
        return a;
//        у меня вопрос как просмотреть какое число сгенерировал этот метод generateRandomAge?
    }
}
