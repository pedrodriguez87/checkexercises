package examples.other;

public class Review {
    public static void main(String[] args) {

        int age = 20;
        boolean available = true;
        String name = "tv";
        double price = 100;

        boolean cheap = price > 500;
        int quantity = 5;
        double totalPrice = price * quantity;

        double discount;

        if (price < 1000) {
            discount = 10;

        } else if (price > 100) {
            discount = 5;
        } else if (price > 50) {
            discount = 2;
        } else {
            discount = 1;
        }

        int counter = 1; // initialization

        while (counter < 10){ // condition
            System.out.println(counter); // task
            counter = counter + 1; // increment
        }

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }


    }
}
