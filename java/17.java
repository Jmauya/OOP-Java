public class Main {
    public static void main(String[] args) {
        ConnectionAnalyzer analyzer = new ConnectionAnalyzer();
        
        String[] users = {"Alice", "Bob", "Charlie", "Diana"};
        
        String[][] allPairs = analyzer.generateAllPairs(users);        
        System.out.println("All possible connections:");
        for (String[] pair : allPairs) {
            System.out.println(pair[0] + " - " + pair[1]);
        }
    }
}

class ConnectionAnalyzer {
    public String[][] generateAllPairs(String[] elements) {
        int n = elements.length;
        
        int numPairs = n * (n - 1) / 2;
        String[][] pairs = new String[numPairs][2];
        
        int pairIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Add the first user to our pair
                pairs[pairIndex][0] = elements[i];
                // Add the second user to our pair
                pairs[pairIndex][1] = elements[j];
                pairIndex++;
            }
        }
        
        // Return the result
        return pairs;
    }
}
