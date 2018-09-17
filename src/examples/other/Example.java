package examples.other;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double price;

        price = Integer.parseInt(input.nextLine());
        name = input.nextLine();

        System.out.println("the product :" + name + " costs :" + price + " euros");


    }

}