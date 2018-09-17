package examples.files;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileExample {

    public static void main(String[] args) throws Exception {

        // Calculator calc = new Calculator(0);

        PrintWriter writer = new PrintWriter("example.txt");

        // calc.add(60);

        writer.print("one line ");
        writer.println("same line");
        writer.println("another line");
        writer.println("last line");

        writer.close();

        System.out.println("File written");
    }

}
