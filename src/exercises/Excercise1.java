package exercises;

import java.util.*;




/**
 * Declare 3 variables for prices, and assign values
 * Declare another variable and put the total sum of the prices
 * In another variable, assign a value for some discount (e.g. 15)
 * If the total amount of the prices is 100 or grater, apply the discount to the total amount.
 * Print the total
 */
public class Excercise1 {

    public static void main(String[] args) {



        double price1= 30;
        double price2= 20;
        double price3= 50;

        double total = price1 + price2 + price3;
        System.out.println("total: " + total);

        double average = total / 3;
        System.out.println("Average: " + average);

        double discount= 0.15;

        if (total >= 100) {

            total = total * (1-discount);

        }
        System.out.println("total after discount: " +total);

    }

}
