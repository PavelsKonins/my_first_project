package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 36;
        System.out.println(myCurrentAge);

        //short data type
        short selaryPerMonth = 15000;
        System.out.println(selaryPerMonth);

        //char short data type
        char firstNameLetter = 80; // 'P'
        System.out.println(firstNameLetter);

        //int data type
        int dateOfBirth = 270974;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 1884000;
        System.out.println(populationOfLatvia);

        //float data type
        float lapTime = 30.301f;
        System.out.println(lapTime);

        //double data type
        double wight = 71.05;
        System.out.println(wight);

        //boolen is; has;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean isAutum = false;

        //String
        String name = "Pavelok";
        String surName = "Koninss";

        //Concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
        // System.out.println("Pavelok Konins36")

        System.out.printf("My full name is: %s. I am %d years old. \n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old. \n", fullName, myCurrentAge);

        // %s - string
        // %d - digits
        // \n %n - next row

        //*
        int a = 100;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        // / division
        c = a / b;
        System.out.println(c);

        double result = (double) a / b;
        System.out.println(result);

        // %
        int number = 10 % 3;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        











    }
}
