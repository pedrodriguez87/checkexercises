package examples.other;

public class Product {

    // Properties / Fields / Instance variables

    double price;
    String color;
    String name;
    String brand;
    boolean available;

    // Constructor
    public Product(String name, double price, String color) {

        // nothing

        this.name = name;
        this.price = price;
        this.color = color;
        this.available = true;

    }

    // methods or functions

    public void printProductDetails () {

        System.out.println(this.name + " costs: "
                + this.price + " , its: " + this.color + " , its available: " + this.available);
    }

    public void printName(){
        System.out.println(this.name);
    }

    public void printColor(){
        System.out.println(this.color);
    }

    /** Prints "its available" or "its not available" */

    public void printAvailability(){

        if (this.available){

            System.out.println("Its available");

        }else {
            System.out.println("Its not available");
        }


    }

    public void printExpensive(){

        if (this.price > 100){
            System.out.println("its expensive");

        }else{
            System.out.println("its cheap");
        }
    }

    public void printAffordable(double budget){
        if (budget >= this.price){
            System.out.println("You can afford " + this.name);
        } else {
            System.out.println("You can not afford " + this.name);
        }
    }


    public void applyDiscount(double discount)  {
        this.price -= discount;


    }


}
