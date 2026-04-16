package Exercise1;

public class Exercise1 {

    public static void main(String[] args) {
//        primitiveDataTypes();
//        stringDataTypes();
//        section02();

        int newValue;
        int counter = 1;
//
//        counter = counter + 1;
//        counter++;

        newValue = ++counter;
        System.out.println(newValue);
    }

    public static void section02() {

        /******************* Section 2 ********************/
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("Section 2: Selecting DataTypes");
        System.out.println("**********************************************");
        System.out.println();
        System.out.println();

        // From this point forward you will need to choose
        // the variable name for each of your variables
        // as well as the DataType that will be used for
        // each variable.


        // 5. Declare a variable to store the name of your
        // favorite superhero.
        String superHero = "Batman";

        // Hint: You cannot use the same variable name
        // as a variable that you have used before.


        // 6. Declare a variable to hold the value of
        // value of a test score. The test has 100
        // questions and each question is worth 1 point.
        // (You can choose the score)
        int testScore = 0;


        // 7. Declare a variable that holds the current
        // population in the United States.
        // (search what the population is today)

        int US_population = 348554331;
        System.out.println(String.format("US population: %,d", US_population));

        // 8. Declare a variable that holds the current
        // population in China.
        // (search what the population is today)
        long China_population = 1483611715;
        System.out.println(String.format("China population: %,d", China_population));

        // 9. Declare a variable that holds the current
        // population in the world.
        // (search what the population is today)
        long World_population = 8286041709L;
        System.out.println(String.format("World population: %,d\n\n", World_population));

        // 10. Declare a variable that specifies whether
        // or not your mouse is wireless.
        boolean wirelessMouse = true;
        System.out.println("Is your mouse wireless?\n " + wirelessMouse + "\n\n");

        // 11. Search what the Latitude and Longitude of your
        // home town are. Then declare 2 variables
        // to store the Latitude and Longitude.
        double hometown_Latitude = 21.3605556;
        double hometown_Longitude = -157.9688889;
        System.out.println("Hometown Latitude: " + hometown_Latitude);
        System.out.println("Hometown Longitude: " + hometown_Longitude + "\n\n");

        // 12. Create a variable that holds the current
        // Microsoft stock price.
        double stockPrice_Microsoft = 373.15;
        System.out.println("Stock Price Microsoft Price: " + stockPrice_Microsoft + "\n\n");

       long total = China_population + US_population;
       System.out.println(String.format("Total population: %,d", total));

    }

}