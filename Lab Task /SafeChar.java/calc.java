package oop;

public class SafeCalculator {

    // Method to safely convert string to integer using try-catch
    public String safeStringToInt(String input) {
        try {
            int num = Integer.parseInt(input);
            return "Number is: " + num;
        } catch (NumberFormatException e) {
            return "Warning: Not a valid number!";
        }
    }
}
