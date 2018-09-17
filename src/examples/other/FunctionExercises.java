package examples.other;

import java.util.*;

/**
 * Function exercises.
 *
 * The `main` function is below. It runs tests for the functions.
 */
public class FunctionExercises {

    // The first function is done for you.
    // Solve the following ones.
    // Run the program to test the functions (the tests are written for you).

    /** Adds two numbers */
    private static int sum(int a, int b) {

        int result = a + b;
        return result;
    }


    /** Finds the maximum of two numbers */
    private static int max(int a, int b) {

        int result;
        if (a > b){
            result = a;
        }else{
            result = b;
        }
        return result;
    }


    /** Finds the minimum of two numbers */
    private static int min(int a, int b) {

        int result;
        if (a < b){
            result = a;

        }else{
            result = b;

        }
        return result;
    }

    /** Finds the average of two numbers */
    private static double average(double a, double b) {

        double result = (a + b) / 2;
        return result;
    }

    /** Returns the longest text */
    private static String longest(String text1, String text2) {

        // You can use text1.length() to get the length of text1

        String result;
        if (text1.length() > text2.length()){
            result = text1;
        }else{
            result = text2;
        }
        return result;
    }

    /** Returns the number of times a letter appears in a text */
    private static int countLetter(String text, char letter) {

        // You can use text.charAt(0) to get the first letter of the text

        int result = 0;
        int index = 0;
        while (index < text.length()) {

            char currentletter = text.charAt(index);
            if (currentletter == letter){
                result = result+1;
            }

            index++;

        }

        return result;
    }

    /** Returns the text repeated the given times */
    private static String repeat(String text, int times) {

        // You can do `result += text` to append `text` to `result`

        String result = "";
        return result;
    }

    /** Returns the number of times the text appears in the list of texts */
    private static int countText(List<String> texts, String text) {

        // Use text1.equals(text2) to compare two texts.
        // In Java don't use `==` to compare examples.other.Strings.

        int result = 0;
        return result;
    }

    /** Returns a list of texts those length is at most the given maxLength */
    private static List<String> shortTexts(List<String> texts, int maxLength) {

        List<String> result = new ArrayList<>();
        return result;
    }


    // -----------------------------------

    /**
     * This program runs tests for the functions defined above.
     */
    public static void main(String[] args) {

        assertEquals( sum(1,1), 2 );
        assertEquals( sum(7,-3), 4 );

        assertEquals( max(4,2), 4 );
        assertEquals( max(3,7), 7 );
        assertEquals( max(-6,3), 3 );

        assertEquals( min(4,2), 2 );
        assertEquals( min(3,7), 3 );
        assertEquals( min(-6,3), -6 );

        assertEquals( average(2, 4), 3.0 );
        assertEquals( average(2, 3), 2.5 );
        assertEquals( average(2, 2), 2.0 );
        assertEquals( average(-2, 2), 0.0 );

        assertEquals( longest("dog", "horse"), "horse" );
        assertEquals( longest("big dog", "horse"), "big dog" );
        assertEquals( longest("", "hi"), "hi" );
        assertEquals( longest("something", ""), "something" );

        assertEquals( countLetter("pie", 'i'), 1 );
        assertEquals( countLetter("coconut", 'o'), 2 );
        assertEquals( countLetter("abracadabra", 'a'), 5 );
        assertEquals( countLetter("CAPITAL LETTERS", 'a'), 0 );
        assertEquals( countLetter("", 'a'), 0 );

        assertEquals( repeat("once", 1), "once" );
        assertEquals( repeat("three", 3), "threethreethree" );
        assertEquals( repeat("-", 10), "----------" );
        assertEquals( repeat("nothing", 0), "" );
        assertEquals( repeat("", 5), "" );

        assertEquals( countText(Arrays.asList("cat", "dog", "cat"), "cat"), 2 );
        assertEquals( countText(Arrays.asList("a", "a", "b", "a"), "a"), 3 );
        assertEquals( countText(Arrays.asList("white", "blue"), "red"), 0 );
        assertEquals( countText(Arrays.asList(), "nope"), 0 );
        assertEquals( countText(Arrays.asList("hey", "", ""), ""), 2 );

        assertEquals( shortTexts(Arrays.asList("aa", "bbbb", "c"), 2),
                Arrays.asList("aa", "c") );
        assertEquals( shortTexts(Arrays.asList("aa", "bbbb", "c"), 3),
                Arrays.asList("aa", "c") );
        assertEquals( shortTexts(Arrays.asList("aa", "bbbb", "c"), 4),
                Arrays.asList("aa", "bbbb", "c") );
        assertEquals( shortTexts(Arrays.asList("  ", "a", "bb", "", "c"), 1),
                Arrays.asList("a", "", "c") );
        assertEquals( shortTexts(Arrays.asList(), 5),
                Arrays.asList() );

        System.out.println("All tests OK!");
    }


    /**
     * Checks that the two values are equal and throws an error if not
     */
    private static void assertEquals(Object actual, Object expected) {

        if (!actual.equals(expected)) {
            throw new RuntimeException(
                    "Values are not equal!" + "\n"
                            + "Actual: " + actual + "\n"
                            + "Expected: " + expected + "\n"
            );
        }
    }
}