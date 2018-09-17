package examples.other;

/**
 * Basic exercises to practice variable declarations and assignments.
 */
public class BasicsExercises {

    public static void main(String[] args) {

        // 1. Declare a variable with type `int` and name `age`.
        int age;


        // 2. Assign the value 15 to the variable `age`.
        age = 15;


        // 3. Declare a variable with type `double` and name `weight`.
        //    In the same line, assign the value `42.5` to that variable.
        double weight = 42.5;

        // 4. Declare a variable `totalWeight` and assign the value of `weight` multiplied by 2.
        //    Decide what type you should choose for `totalWeight`.
        double totalweight = weight * 2;


        // 5. Declare a variable `year` and assign `2018` to it.
        int year = 2018;


        // 6. Declare the variables `price`, `quantity` and `totalPrice`.
        //    Assign any values to `price` and `quantity`, and calculate the value for `totalPrice`.
        int price = 10;
        int quantity = 20;
        int totalPrice = price + quantity;




        // 7. Apply a discount of 5% to `totalPrice` and assign the result to `finalPrice`.
        double discount;
        discount = 0.5;
        double finalPrice = totalPrice * (1 - discount);




        // 8. Subtract 10 from `finalPrice` (change its value).

        finalPrice = finalPrice - 10;



        // 9. Declare a variable `productName` (type String) and assign somme value, e.g. "iPhone Xs".
        String productName = "iPhone Xs";


        // 10. Declare a variable `message` and assign to it a message like "iPhone Xs costs 1500".
        //     That message should be created by joining the variables `productName` and `price`.
        String message = productName + " costs: " + price;
        System.out.println(message);



        // 11. Declare a `boolean` variable named `applyDiscount` and assign the value `true`.
        boolean applyDiscount = true;



        // 12. Declare a `boolean` variable adult, that should have the result of comparing `age >= 18`.
        boolean adult = (age >= 18);



        // 13. In a similar way, declare a variable `expensive`,
        //     which should have the result of comparing `price` and `1000`.
        boolean expensive = price > 1000;


        // 14. Declare a variable `age2` with some value.
        //     Declare a variable `sameAge`, and assign the result of comparing `age` and `age2`.
        int age2 = 15;
        boolean sameAge = age == age2;


        // 15. Declare two integer variables `kids` and `cookies`, with some values (e.g. `5` and `22`)
        //     Calculate how many cookies each kid can have.
        //     Calculate how many cookies are left.
        int kids = 5;
        int cookies = 22;

        int eachkid = cookies/kids;

        int cookiesleft;
        cookiesleft= cookies%kids;










    }
}