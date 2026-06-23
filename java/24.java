public class DepartmentAnalysis {
    public static void main(String[] args) {
        try {
            Table highEarners = Table.read().csv("top_10_earners.csv");

            // Summarize Salary with mean, count, and max
            Table salarySummary = highEarners.summarize("Salary",
                mean, count, max).apply();

            System.out.println("Salary Summary:");
            System.out.println(salarySummary);

            // Filter for employees aged 40+
            Table seniorEmployees = highEarners.where(
                highEarners.intColumn("Age").isGreaterThanOrEqualTo(40));

            // Sort by Department, then Salary descending
            Table sortedSeniors = seniorEmployees.sortOn("Department")
                                                 .sortDescendingOn("Salary");

            System.out.println("\nSenior Employees (40+) by Department:");
            System.out.println(sortedSeniors);

        } catch (Exception e) {
            System.err.println("Error reading CSV files: " + e.getMessage());
        }
    }
}
