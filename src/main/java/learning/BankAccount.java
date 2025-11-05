package learning;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount; // add money to the balance
            System.out.println("Successfully deposited $" + amount + ". New balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        } else {
            balance -= amount; // subtract the amount from the balance
            System.out.println("Successfully withdrew $" + amount + ". New balance: $" + balance);
        }
    }

    public void displayAccountInfo() {
        System.out.printf("Account Holder: %s | Current Balance: $%.2f%n", accountHolderName, balance);
    }
}

