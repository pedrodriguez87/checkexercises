package examples.other;

public class ClassExample {

    public static void main(String[] args) {

        Product tv;
        tv = new Product("Samsung TV", 500, "black");

        Product phone = new Product("iphone", 1000, "red,");

        Product lamp = new Product( "desktop", 1000, "white");

        Product computer = new Product("macbook", 1500, "grey");

        Product computer2 = new Product(computer.name, computer.price, computer.color);

        computer2.price = 550;

        computer.printProductDetails();
        lamp.printProductDetails();
        computer2.printProductDetails();
        computer.printName();
        lamp.printColor();
        computer2.printAvailability();
        computer2.printExpensive();

        computer2.printAffordable(500);
        computer2.applyDiscount(50);
        computer2.printAffordable(500);


        /*
        System.out.println( tv.name + " costs: " + tv.price + " and is "
                + tv.color + ", available: " + tv.available);
        System.out.println(phone.name + " costs: "
                + phone.price + " and is " + phone.brand + ", available: " + phone.available);
         */
    }




}
