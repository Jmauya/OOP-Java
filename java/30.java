import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        String filePath = "sample_market_data.csv";
        
        // Create a reader using chained constructors
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read and print the header line
            String header = reader.readLine();
            System.out.println("Header: " + header);
            
            // Read and print the first data row
            String dataRow = reader.readLine();
            System.out.println("First data row: " + dataRow);
            
            System.out.println("Successfully read from file using BufferedReader");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
