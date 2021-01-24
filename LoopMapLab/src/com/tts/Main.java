package com.tts;
import java.util.*;
import java.util.ArrayList;
import java.io.Console;
import java.util.Scanner;



public class Main {

    private static Scanner sc;

    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you please enter your name?");
            String someString = scanner.next();
            System.out.printf("Hello %s!\n", someString);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of an array of numbers that you wish to add and hit enter: Hint, try 5 numbers:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        double sum = 0;
        double product = 1;
        double smallNum = 0;
        double largeNum = 0;                    //added

        System.out.println("Please enter the 5 numbers of the array on its own line and hit enter for each entry:");


        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
            product = product * array[i];

        }

        for (int i = 0; i > array.length; i++) {
            System.out.println("You entered: " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {                //added....good
            if (largeNum < array[i]) {                          //added.....good
                largeNum = array[i];                            //added....good
            }                                                   //added...good

            for (int j = 0; j > array.length; j++)
            if (smallNum > array[j]) {
                smallNum = array[j];
               }
            }


            System.out.println("");
            System.out.println("The sum of the array numbers that you entered is " + sum);
            System.out.println("");
            System.out.println("The product of the array numbers that you entered is: " + product);
            System.out.println("");
            System.out.println("The largest number that you entered is: " + largeNum);
            System.out.println("");
            System.out.println("The smallest number that you entered is: " + smallNum);


        }
    }














































