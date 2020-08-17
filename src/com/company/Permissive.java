package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Permissive {

    public static void main(String[] args) {
//        Scanner dataBase = new Scanner(System.in);
//        System.out.println("Вводите через Enter ваше имя, Возраст, Температуру воздуха:");
//        String name = dataBase.nextLine();
//        int age = dataBase.nextInt();
//        int temperature = dataBase.nextInt();
//        System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
        basa("Vasa", generateRandomAge(), 24);

    }


    public static String basa(String name, int age, int temperature) {
        if (age >= 20  && age <= 45 && temperature >= -20 && temperature <= 30){
            System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "You be allowed to walk away\n";
        } else if (age <= 20 && temperature >=0 && temperature <= 28){
            System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "You be allowed to walk away\n";
        } else if(age >= 45 && temperature >= -10 && temperature <= 25){
            System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "You be allowed to walk away\n";
        } else {
            System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "Stay at home!\n";
        }
    }
    public static int generateRandomAge(){
        int a = 1+(int)(Math.random()*101);
        if (a<16 || a>70){
            System.out.println("You couldn't leave home");
        } else {
            System.out.println("Yeah!, you be able to leave home");
        }
        return a;
    }
}
