public class WeatherMetadataExample {
    public static void main(String[] args) {
        StringColumn days = StringColumn.create("Day", 
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
            
        DoubleColumn temperatures = DoubleColumn.create("Temperature", 
            22.5, 24.0, 23.2, 21.5, 20.8, 25.1, 26.3);
            
        DoubleColumn precipitation = DoubleColumn.create("Precipitation", 
            0.0, 2.5, 5.2, 0.0, 0.0, 1.3, 0.0);
        
        Table weatherData = Table.create("WeatherData")
            .addColumns(days, temperatures, precipitation);
        
        // Print the table dimensions
        System.out.println(____.____());
        
        // Display the column names
        System.out.println(____.____());
        
        // Print the table structure
        System.out.println(____.____());
        
        // Preview the first three rows
        System.out.println(____.____(____));

    }
}
