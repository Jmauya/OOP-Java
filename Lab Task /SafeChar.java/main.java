package oop;

public class Main {
    public static void main(String[] args) {

        // Test SafeChar
        SafeChar sc = new SafeChar();
        String text = "Hello";

        System.out.println(sc.getCharAt(text, 1));   // Output: e
        System.out.println(sc.getCharAt(text, 10));  // Output: Warning: Index out of bounds!

        System.out.println();

        // Test SafeCalculator
        SafeCalculator calc = new SafeCalculator();
        System.out.println(calc.safeStringToInt("123"));  // Output: Number is: 123
        System.out.println(calc.safeStringToInt("MU"));   // Output: Warning: Not a valid number!
        System.out.println(calc.safeStringToInt(""));     // Output: Warning: Not a valid number!
    }
}
