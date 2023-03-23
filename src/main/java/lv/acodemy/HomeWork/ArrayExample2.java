package lv.acodemy.HomeWork;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbers[4]);

        int apples = numbers[6];
        System.out.println("I have " + apples + " apples");
        System.out.println("Number arrays contains of: " + numbers.length + " numbers");

        numbers[0] = 90 ;
        numbers[9] = 69;
        System.out.println(Arrays.toString(numbers));

        int[] euribor =  new int[10];
        euribor[0] = 3;
        euribor[1] = 5;

        System.out.println(Arrays.toString(euribor));

        String[] names = {"Petro", "Kalvin", "Laima", "Kristo", "Gonzales"};
        String laima = names[2];
        System.out.println(laima);
        System.out.println("My name not " + names[2]);

        names[2] = "PEDRITO";

        System.out.println(Arrays.toString(names));
















    }
}
