public class NestedEmployees {
    public static void main(String[] args) {

        // Set table name for first JSON
        JsonReadOptions opts1 = JsonReadOptions
                .builder("employees.json")
                .tableName("Main")
                .build();
        Table main = new JsonReader().read(opts1);

        // Complete builder chain for second JSON
        JsonReadOptions opts2 = JsonReadOptions
                .builder("employees_extra.json")
                .tableName("Extra")
                .build();
        Table extra = new JsonReader().read(opts2);

        System.out.println("Main columns: " + main.columnNames());
        System.out.println("Extra columns: " + extra.columnNames());

        // Join tables on id column
        Table joined = main.joinOn("id").inner(extra);

        System.out.println("\nJoined table (inner join on id):");
        System.out.println(joined.print());
    }
}
