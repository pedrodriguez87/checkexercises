package examples.other;

public class Exercise1<resultado> {


    public static void main(String[] args) {

        int total = sumUpto(5);
        int total10 = sumUpto(10);
        int total20 = sumUpto(10000);
        int totaldosnumeros = difference(12, 7);
        int minimodedosnumeros = minimum(5, 2);
        int resultadofactorial = factorial (5);

        System.out.println("The result is... " + total);
        System.out.println("total10 = " + total10);
        System.out.println("total20 = " + total20);
        System.out.println(totaldosnumeros);
        System.out.println(minimodedosnumeros);
        System.out.println(resultadofactorial);
    }

    public static int difference(int a, int b) {

        int resultado;

        resultado = a - b;
        return resultado;
    }

    public static int minimum(int c, int d) {

        int result;

        if (c < d) {
            result = c;
        } else {
            result = d;

        }
        return result;
    }

   public static int factorial  (int number) {

       int counter = 1;
       int result = 1;

       while (counter <= number) {
           result = result * counter;
           counter++;
       }
       return result;
   }

        /**
         * Returns the sum of the numbers from 1 to the given number
         */
        public static int sumUpto ( int number){

            int result = 0;
            int counter = 1;

            // same excercise using WHILE
            // while (counter <= number){
            // result = result + counter;
            //counter = counter + 1;
            //}


            for (int i = 1; i <= number; i++) {
                result = result + i;
                // TODO: complete the function


            }

            return result;

        }

}
