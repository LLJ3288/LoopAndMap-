package com.tts;
import java.util.Scanner;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Jones Car Emporium");
        System.out.println("What kind of vehicle are you looking for today?");

        String carModel = input.nextLine();

        HashMap<String, String> car = new HashMap<>();


        car.put("Toyota", "Camry");
        car.put("Nissan", "Altima");
        car.put("Honda", "Accord");
        car.put("Chevy", "Tahoe");
        car.put("Dodge", "Charger");

        if (car.containsKey(carModel)) {
            System.out.println("I can show you one of these from our selection right over here!!");
        } else {
            System.out.println("Sorry, we don't have one of those in stock.");
        }
    }
    }
