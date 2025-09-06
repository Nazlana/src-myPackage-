package myPackage;
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else { 
            System.out.println("Initial balance cannot be negative!");
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL deposited.");
        } else {
            System.out.println("Cannot deposit a negative amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println(amount + " TL withdrawn.");
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    // Read-only access to balance
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankTest {
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount("TR123456", 1000);

	        System.out.println("Account Number: " + account.getAccountNumber());
	        System.out.println("Starting Balance: " + account.getBalance());

	        account.deposit(500);     // +500
	        account.withdraw(200);    // -200
	        account.withdraw(2000);   // will give error

	        System.out.println("Current Balance: " + account.getBalance());
	    }
}
