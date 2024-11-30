package encapsulation;

class BankAccount {
    // Private variable for account balance
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter method to access the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Setter method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class BankAccountTest {
	
    public static void main(String[] args) {
    	
        // Create a new bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000);

        // Deposit some money
        account.deposit(500);
        System.out.println("Current Balance: " + account.getBalance()); // Output: 1500

        // Withdraw some money
        account.withdraw(300);
        System.out.println("Current Balance: " + account.getBalance()); // Output: 1200

        // Attempt to withdraw more money than available
        account.withdraw(1500); // Output: Invalid withdrawal amount.
    }
}
