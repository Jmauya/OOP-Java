public class Main {
    public static void main(String[] args) {
        TransactionProcessor processor = new TransactionProcessor();
        
        String[] transactions = {
            "TXN001", "TXN002", "TXN003", "TXN001", 
            "TXN004", "TXN005", "TXN003", "TXN006"
        };

        boolean hasDuplicates = processor.hasDuplicateTransactions(transactions);
        if (hasDuplicates) {
            System.out.println("Duplicate transactions detected!");
        } else {
            System.out.println("All transactions are unique.");
        }
    }
}

class TransactionProcessor { 
    public boolean hasDuplicateTransactions(String[] transactionIds) {
        // Initialize an empty HashSet
        HashSet<String> seen = new HashSet<>();
        
        for (String transactionId : transactionIds) {
            if (seen.contains(transactionId)) {
                return true;
            } else {
                // First time seeing this transaction, add it to the set
                seen.add(transactionId);
            }
        }
        
        // Return true/false if no duplicates found
        return false;
    }
}
