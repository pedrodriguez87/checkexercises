package examples.classes.calculator;

public class Calculator {

    // Properties
    double value;


    // Constructor

    public Calculator (double value){
        this.value = value;
    }

    // Methods

    public void add (double value){
        this.value += value;
    }
    public void substract (double value){
        this.value -= value;
    }

    public void square (){
        this.value *= value;
    }

    public void power (double exponent){

        double result = 1;

        int counter = 1;
        while ( counter <= exponent){
            System.out.println(counter);
            result = result * this.value;
            counter++;
        }

        this.value = result;
    }

    public void cube(){
        this.value = this.value * this.value * this.value;
    }
}
