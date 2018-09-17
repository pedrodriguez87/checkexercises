public class pruebasfunciones {

    public static void main(String[] args) {

        String result;

        String a = "El perro";
        String b = "perro";
        String c = "gato";

        if (a.contains(b)){
            a.contains(b = c);
            result = a;
            System.out.println(result);



        }


        a = b;
        System.out.println(a);

        countLetter("carro", 'r');


    }

    private static int countLetter(String text, char letter) {

        // You can use text.charAt(INDEX) to get the letter at that INDEX

        int counter = 0;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                counter++;
                System.out.print(counter);


            }

        }
        return counter;
    }


}
