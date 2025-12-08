package oop;

public class SafeChar {

    // Method to safely get character at an index using try-catch
    public String getCharAt(String str, int index) {
        try {
            char ch = str.charAt(index);
            return String.valueOf(ch);
        } catch (IndexOutOfBoundsException e) {
            return "Warning: Index out of bounds!";
        }
    }
}
