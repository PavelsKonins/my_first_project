package lv.acodemy.HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariablesDataTypes2 {
    public static void main(String[] args) {

        byte myCurrentAge = 36;
        System.out.println(myCurrentAge);

        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        char firstNameLetter = 80;
        System.out.println(firstNameLetter);

        int dateOfBirth = 130686;
        System.out.println(dateOfBirth);

        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        float lapTime = 31.1f;
        System.out.println(lapTime);

        double weight = 75;
        System.out.println(weight);

        boolean isWinter = false;

        String name = "Pavels";
        String lastName = "Konins";

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + " " + myCurrentAge;
        System.out.println(fullNameWithAge);

        System.out.printf("My full name is: %s. I'm %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I'm %d years old.", fullName, myCurrentAge);

        int a = 100;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(a * b);
        System.out.println(10 * 20);

        c = a / b;
        System.out.println(c);

        double result = (double) a / b;
        System.out.println(result);

        int numbers = 10 % 4;
        System.out.println(numbers);

        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers1));

        for(int i = 0; i < numbers1.length; i++){
            if(numbers1[i] % 2 ==0){
                System.out.println("This is even number:" + numbers1[i]);
            }
        }











    }

}
