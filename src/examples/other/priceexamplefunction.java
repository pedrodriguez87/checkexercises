package examples.other;

public class priceexamplefunction {

    public static void calc(double price) {

        double finalPrice1 = 1; // calc(1000);
        double finalPrice2 = 2; //calc(990);

        double maxPrice = maximum(finalPrice1, finalPrice2);

        System.out.println(finalPrice1);
        System.out.println(finalPrice2);
        System.out.println(maxPrice);


    }

    /**
     * Returns the maximum of a and b
     */
    public static double maximum(double a, double b) {

        double result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;


    }
}
