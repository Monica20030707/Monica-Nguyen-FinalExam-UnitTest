import java.io.*;


public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        int current=0;

        String[] numbersArray = numbers.split(",|\n");

        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        }
        else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    // If it is not a number, parseInt will throw an exception
                    current= Integer.parseInt(number.trim());
                    returnValue+= current;
                }
                if (current < 0) {
                    throw new IllegalArgumentException("Negatives not allowed.");
                }
                if (current >1000){
                    current = 0;
                }
            }
        }

        return returnValue;

    }
}
