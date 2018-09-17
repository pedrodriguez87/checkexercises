package examples.other;

public class Strings {

    public static void main(String[] args) {

        String name = "the iPhone X";
        System.out.println("Product: " + name);

        int length = name.length();
        System.out.println("Length of string: " + length);

        char letter = name.charAt(0); // gets second letter
        System.out.println("First letter: " + letter);

        String brand = name.substring(4, 10);
        System.out.println("Brand: " + brand);
        System.out.println("length of brand: " + brand.length());

        boolean exists = name.contains("android");
        System.out.println("Exists? " + exists);

        int index = name.indexOf("android");
        System.out.println("Index: " + index);

        String message = "The brand is " + brand;
        System.out.println(message);

        double price = 1000;
        message = message + " and the price is " + price;
        System.out.println(message);

        String underline = "";

        int i = 1;

        while (i <= message.length()){
            underline = underline + "-";
            i++;

        }
        System.out.println(underline);


    }

}
