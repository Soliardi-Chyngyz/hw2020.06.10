package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Permissive {

    public static void main(String[] args) {
        /*Scanner dataBase = new Scanner(System.in);
        System.out.println("Вводите через Enter ваше имя, Возраст, Температуру воздуха:");
        String name = dataBase.nextLine();
        int age = dataBase.nextInt();
        int temperature = dataBase.nextInt(); !!я бы хотел выводить на консоль ввод данных и результат, не подскажите?*/
        System.out.println(basa(23,30));
        System.out.println(basa(10,28));
        System.out.println(basa(30,50));
        System.out.println(basa(50,20));
        System.out.println(basa(18,0));

        int a = generateRandomAge();

    }

    public static String basa(/*String name какой тип вместо void я должен прописать для строчных и целых чисел?*/int age, int temperature) {
        boolean permision = true;


        if (age >= 20  && age <= 45 && temperature >= -20 && temperature <= 30){
            return "You be allowed to walk away";
        } else if (age <= 20 && temperature >=0 && temperature <= 28){
            return "You be allowed to walk away";
        } else if(age >= 45 && temperature >= -10 && temperature <= 25){
            return "You be allowed to walk away";
        } else {
            return "Stay at home!";
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
