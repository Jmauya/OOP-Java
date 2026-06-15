public class Main {
    public static void main(String[] args) {
        int arraySize = 10000;
        
        ArrayList<Integer> unsortedNumbers = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            unsortedNumbers.add(i);
        }
        int temp = unsortedNumbers.get(arraySize - 1);
        unsortedNumbers.set(arraySize - 1, unsortedNumbers.get(arraySize - 2));
        unsortedNumbers.set(arraySize - 2, temp);
        
        SortChecker checker = new SortChecker();
	    boolean result = checker.isSorted(unsortedNumbers);
        
        System.out.println("Unsorted array result: " + result);
    }
}

class SortChecker {
    public boolean isSorted(ArrayList<Integer> numbers) {
        // Iterate through all the numbers
        for (int i = 0; i < numbers.size(); i++) {
            // Iterate through all the numbers again
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    return false;
                }
            }
        }
        // Return if we have not returned false so far
        return true;
    }
}
