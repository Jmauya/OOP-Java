public class DataExploration {
    public static void main(String[] args) {

        // Start with the high earners table from previous exercises
        Table employees = Table.read().csv("employees.csv");

        // Remove outliers (salary < $40K or > $250K)
        Selection outliers = employees.intColumn("Salary").isLessThan(40000)
            .or(employees.intColumn("Salary").isGreaterThan(250000));
        Table cleanedData = employees.dropWhere(outliers);

        // Count rows removed after filtering
        System.out.println("Employees after removing outliers: "
                + (employees.rowCount() - cleanedData.rowCount()));

        // Map salaries to Junior, Mid, and Senior grades
        StringColumn salaryGroup = cleanedData.intColumn("Salary").map(
            salary -> {
                if (salary < 100000) return "Junior";
                else if (salary < 200000) return "Mid";
                else if (salary >= 200000) return "Senior";
                else return "Error";
            },
            StringColumn::create).setName("SalaryGrade");

        cleanedData = cleanedData.addColumns(salaryGroup);

        // Filter for Mid/Senior grades under age 30
        Selection highPotential = cleanedData.stringColumn("SalaryGrade")
            .isEqualTo("Mid")
            .or(cleanedData.stringColumn("SalaryGrade").isEqualTo("Senior"))
            .and(cleanedData.intColumn("Age").isLessThan(30));

        Table highPotentialEmployees = cleanedData.where(highPotential);

        System.out.println(highPotentialEmployees.rowCount());
        System.out.println(highPotentialEmployees.first(5));
    }
}
