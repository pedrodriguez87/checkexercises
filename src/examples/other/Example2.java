package examples.other;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());


        int counter = 1;

        while (counter < number) {

            System.out.println("counter is: " + counter);

            // counter = counter +1;
            // counter += 1;
            counter++;
        }
    }
}
