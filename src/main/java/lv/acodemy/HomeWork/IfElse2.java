package lv.acodemy.HomeWork;

public class IfElse2 {
    public static void main(String[] args) {

//     boolean x = 5 > 2;
//        System.out.println(x);
//        if(x) {
//            System.out.println("Yes, 5 to is more than 2");
//        }

        int number = 27;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even number");
        } else {
            System.out.println("Number: " + number + " is not even number");
        }


        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer month: June, July, August");
        }


//        int age = 17;
//        if (age <= 17) {
//            System.out.println("You are not allowed to buy here alco");
//        } else if (age < 0) {
//            System.out.println("Who are you?");
//        } else {
//            System.out.println("You are allowed buy and drink alco )))");
//        }

        int age = 0;
        if (age <= 0) {
            System.out.println("How old are you?");
        } else if (age < 17) {
            System.out.println("You are not allowed to buy here alco");
        } else {
            System.out.println("You are allowed buy and drink alco )))");
        }

        String name = "John";
        if (name.equals("John")) {
            System.out.println("Hello John!");
        } else if (name.equals("Zina")){
            System.out.println("You are not welcome!");
        } else {
            System.out.println("......");
        }

        int currentMonth = 12;
        switch (currentMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is autumn");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is spring");

                throw new IllegalStateException("Unexpected value:" + currentMonth);
            default:
                throw new IllegalStateException("Unexpected value:" + currentMonth);
        }

        String student1 = "John";
        String student2 = "Max";

        if (student1.equals("John") && student2.equals("Max")) {
            System.out.println("They are working together!");
        }



    }
}