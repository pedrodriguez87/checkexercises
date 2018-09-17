package btsreview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class examples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int, double, String, char, boolean

        double price;
        price = 20; // Memory(@0) = 20

        System.out.println("Give me the quantity:");
        int quantity;
        quantity = Integer.parseInt(input.nextLine());

        double total;
        total = price * quantity;

        System.out.println("Price is " + price);
        System.out.println("Total is " + total);


        int a = 10;
        int b = 20;

        int c = a + b;
        System.out.println(c);

        List<String> cars = new ArrayList<>();

        cars.add("renault");
        cars.add("peugeot");
        cars.add("fiat");
        cars.add("ferrari");

        String name = cars.get(0);

        for (int i = 0; i < cars.size(); i++) {
            if (name.length() <= 9);
            System.out.println(name);
        }




        //WHILE LOOP
        int counter = 1;
        while (counter <= 5){
            System.out.println(counter);
            counter = counter + 1;
        } // jumps to top of while
        System.out.println("end of while");

        //FOR LOOP
        //initializacion; condition; increment
        for ( int i = 1; i <= 5; i = i + 1){
            System.out.println(i);
        }
        System.out.println("end of for");


        // 1. M(0) = 1
        // 2. if M(0) > 5: jump to 6
        // 3. print M(0)
        // 4. M(0) = M(0) + 1
        // 5. jump to 2
        // 6. print "end"


    }

}



