package examples.other;

import java.util.*;

public class Example3 {

    public static void main(String[] args) {

        int age;
        age = 20;

        List<Integer> numbers;
        numbers = new ArrayList<>();

        numbers.add(200);
        numbers.add(6);
        numbers.add(9);
        numbers.add(10);

        numbers.set(1, 8);
        numbers.set(3, 5);


        int x= numbers.get(1);
        System.out.println("the value of x is..." + x);

        int s = numbers.size();
        System.out.println("s = " + s);

        int counter = 0;
        while ( counter < numbers.size()) {
            int number = numbers.get(counter);
            System.out.println("the counter is"  + counter + ", number = " + number);
            counter = counter + 1;

        }




    }
}
