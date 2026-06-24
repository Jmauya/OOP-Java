public class LastDigitWithTests {
    public static void main(String[] args) {
        launchTestsAndPrint(LastDigitTest.class);
    }
}

class LastDigitTest {
    // Use the correct annotation to mark this as a JUnit test
    @Test
    void testLastDigit() {
        int number = 2025;
        // What is the expected output?
        int expected = 5;

        int actual = LastDigit.lastDigit(number);

        // Use the correct JUnit assertion for the scenario
        assertEquals(expected, actual);
    }
}
