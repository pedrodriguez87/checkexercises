package examples.other;

import java.util.*;

public class ExercisePriceslist {

    public static void main(String[] args) {

        List<Double> prices;
        prices = new ArrayList<>();

        prices.add(30.0); // index 0
        prices.add(20.0); // index 1
        prices.add(50.0); // index 2



        int size = prices.size();
        System.out.println("Size: " + size);

        double sum = 0;
        int index = 0;

        while (index < size ) {
            double price = prices.get(index);
            sum = sum + price;
            index++;
        }

        System.out.println("Sum: " + sum);



    }

}
