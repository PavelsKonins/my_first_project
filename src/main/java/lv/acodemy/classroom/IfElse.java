package lv.acodemy.classroom;

public class IfElse {
    public static void main(String[] args) {

        // IF
        /*
        if(condition) {
        code to be executed
        }
        */

//        boolean x = 5 > 2;
//        System.out.println(x);
//        if(x) {
//            System.out.println("Yes, 5 is more than 2");

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Numbers:" + number + " is even");
        } else {
            System.out.println("Numbers: " + number + " is NOT even numbers");
        }


        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer month: June, July, August");

        }
        // IF-ELSE-IF

        /*
        if(condition) {
        code to be executed
        } else if(condition) {
        code to be executed
        } else {
        code to be executed
        }

         */

//        int age = 17;
//        if (age <= 17) {
//            System.out.println("You are not allowed to buy here!");
//        } else if (age <= 0) {
//            System.out.println("Who are you?");
//        } else {
//            System.out.println("Welcome to our shop!");
//        }

        //IF John = Hello John!
        //IF Zina = You are not welcome!
        //All others = Text

        String name = "Zina";
        if (name.equals("John")){
            System.out.println("Hello Jonh!");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome!");
        } else {
            System.out.println("Very interesting name!");
        }

        // switch case;
        // || OR
        // && AND

        int currentMonth = 6;
        switch (currentMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autumn");
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + currentMonth);
        }

        // IF student1 = "John" and student2 = "Max"
        // Print: they will work together
        // &&

        String student1 = "John";
        String student2 = "ASA";
        if (student1.equals("John") && student2.equals("Max")){
            System.out.println("They will works together");
        }

        var myName = "Pavels";
        System.out.println(myName);
        var myAge = 10;
        System.out.println(myAge);
    }
}


