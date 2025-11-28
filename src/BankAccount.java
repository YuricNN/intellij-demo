public class BankAccount {
    private final int accountNumber;
    private String ownerName;
    private double balance;
    private static int totalAccounts = 0;
    private static final double MIN_BALANCE = 0.0;
    private static final double MAX_WITHDRAW_LIMIT = 2000.0;

    public BankAccount(String ownerName, double initialDeposit) {
        this.accountNumber = (int) (Math.random() * 1000000);
        this.ownerName = ownerName;
        this.balance = initialDeposit;
        totalAccounts++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }

        if (amount > MAX_WITHDRAW_LIMIT) {
            return false;
        }

        if (this.balance - amount >= MIN_BALANCE) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getInfo() {
        return "Account Number: " + accountNumber +
                ", Owner Name: " + ownerName +
                ", Balance: " + String.format("%.2f", balance) +
                ", Total Accounts: " + totalAccounts;
    }
}