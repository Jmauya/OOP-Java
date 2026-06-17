public class ArrayPopulation {
    
    public static void main(String[] args) {
        int size = 10000;

        String[] inefficientArray = populateArrayInefficient(size, "DataCamp");
        String[] efficientArray = populateArrayEfficient(size, "DataCamp");

        System.out.println("Arrays have same length: " + (inefficientArray.length == efficientArray.length));
    }

    public static String[] populateArrayInefficient(int size, String value) {
        String[] array = new String[size];
        
        for (int i = 0; i < size; i++) {
            String stringValue = new String(value);
            array[i] = stringValue;
        }
        
        return array;
    }

    public static String[] populateArrayEfficient(int size, String value) {
        String[] array = new String[size];
        
        for (int i = 0; i < size; i++) {
            // Reuse the same String object
            array[i] = value;
        }
        
        // Return the final array
        return array;
    }
}
