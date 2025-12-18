// main class 
package oop;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setAccountNumber("AC12345");
        account.setBalance(5000);
        account.displayAccount();

        account.setBalance(-1000); // negative balance, should trigger warning
        account.displayAccount();
    }
}
package oop;

public class BankAccount {

    private String accountNumber;
    private double balance;

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Warning: Balance cannot be negative! Setting ignored.");
        }
    }

    // Method to display account info
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : $" + balance);
        System.out.println();
    }
}
