package lv.acodemy.HomeWork;

public class FirstHomeWork {
    public static void main(String[] args) {

        String car = "Honda";
        byte doors = 5;
        short weels = 4;
        char emblemLetter = 72;
        int releaseYear = 2013;
        long horsPower = 180;
        double engine = 2.2d;

        System.out.println(

        );
        String myCar = "My car is" + " " + car + ", " + "have" + " " + weels + " " + "weels" + " " + "and" + " " + doors + " " + "doors." + " It have big" + " " + emblemLetter + " " + "emblem on front. Release year is " + " " + releaseYear + " " + "with engine" + " " + engine + " " + "diesel and it have" + " " + horsPower + " " + "horse power." ;
        System.out.println(myCar);


        byte floorsOfHouse = 9;

        short iLiveOnFloor = 3;

        char myDogsName = 83;

        int iAdoptedMyDogInYear = 2013;

        long howManyBallsDestroyedMyDog = 100500;

        double dogsWeight = 21.1;

        float tempOfDogsBody = 38.5f;

        String name = "Pavels";


        System.out.println(

        );

        System.out.printf("My name is %s. I live in house with %d floors, I live on %d floor. I have the dog, his name begins with %c.\n " +
                "We adopted him in %d. His wight is %f, his normal T is %f, he loves so much balls, he destroyed %d balls.", name, floorsOfHouse, iLiveOnFloor, myDogsName, iAdoptedMyDogInYear, 22.1, tempOfDogsBody, howManyBallsDestroyedMyDog);

        System.out.println(

        );

        int a = 19;
        int b = 44;
        int c = 11;
        int d = 9;
        double e = 13.13;
        double f = 3.14;

        System.out.println(

        );

        //adding

        System.out.println(a + b);
        System.out.println(c + e);

        //subtracting

        System.out.println(c - d);
        System.out.println(b - a);

        //multiplying

        System.out.println(a * c);
        System.out.println(b * e);

        //dividing

        System.out.println(e / f);
        System.out.println(f / e);

        // %

        System.out.println(a % d);
        System.out.println(c % b);

        //mixing types

        System.out.println((a + b) + (c * d) - (e / f) * (b - a));







    }

}
