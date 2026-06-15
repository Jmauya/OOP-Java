public class Main {
    public static void main(String[] args) {
        DataAnalyzer analyzer = new DataAnalyzer();

        int[] smallData = {5, 3, 9, 1, 7};
        int maxSmall = analyzer.findMaxValue(smallData);
        System.out.println("Maximum value in small dataset: " + maxSmall);

        int[] largeData = new int[1000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (int) (Math.random() * 10000);
        }

        int maxLarge = analyzer.findMaxValue(largeData);
        System.out.println("Maximum value in large dataset: " + maxLarge);
    }
}

class DataAnalyzer {
    public int findMaxValue(int[] data) {
        // Initialize the maximum value to the first element
        int max = data[0];

        for (int value : data) {
            // Update max if current element is greater
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}
