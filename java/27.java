public class MissingValues {
    public static void main(String[] args) {
        // Configure "N/A" as missing
        JsonReadOptions options = JsonReadOptions
            .builder("employees_missing.json")
            .missingValueIndicator("N/A")
            .build();
        
        // Load employee data
        Table employees = new JsonReader().read(options);
        System.out.println("All employees:");
        System.out.println(employees);
        
        // Filter for missing department
        Table missingDept = employees.where(
            employees.stringColumn("department").isMissing()
        );
        
        System.out.println("\nEmployees with missing department:");
        System.out.println(missingDept);
    }
}
