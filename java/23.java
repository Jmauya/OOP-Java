public class DataExploration {
    public static void main(String[] args) {

        Table employees = Table.read().csv("employees.csv");

        // Remove employees with salaries below $40,000
        Selection lowSalaries = employees.intColumn("Salary").isLessThan(40000);
        Table cleanedEmployees = employees.dropWhere(lowSalaries);

        // Remove the JobTitle column
        Table streamlined = cleanedEmployees.removeColumns("JobTitle");

        DoubleColumn performanceBonus = streamlined.intColumn("Salary").asDoubleColumn()
            .map(salary -> salary * 0.05);
        performanceBonus.setName("PerformanceBonus");

        // Add the PerformanceBonus column
        Table enhancedEmployees = streamlined.addColumns(performanceBonus);

        System.out.println("Total employees after cleaning: " + enhancedEmployees.rowCount());
        System.out.println("\nFirst 5 rows of enhanced dataset:");
        System.out.println(enhancedEmployees.first(5));
    }
}
