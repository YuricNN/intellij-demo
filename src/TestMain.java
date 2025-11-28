public class TestMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ali Can", 1500.0);
        BankAccount account2 = new BankAccount("Veli Demir", 5000.0);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        System.out.println("--- Deposit & Withdraw ---");

        account1.deposit(500.0);
        System.out.println(account1.getOwnerName() + " Balance after deposit: " + String.format("%.2f", account1.getBalance()));

        // Başarılı çekim
        boolean success1 = account2.withdraw(1000.0);
        System.out.println(account2.getOwnerName() + " withdraw 1000.0 success: " + success1 + ", New Balance: " + String.format("%.2f", account2.getBalance()));

        // Limit aşımı (MAX_WITHDRAW_LIMIT)
        boolean success2 = account2.withdraw(2500.0);
        System.out.println(account2.getOwnerName() + " withdraw 2500.0 success: " + success2 + ", Current Balance: " + String.format("%.2f", account2.getBalance()));

        // Yetersiz bakiye (MIN_BALANCE)
        boolean success3 = account1.withdraw(3000.0);
        System.out.println(account1.getOwnerName() + " withdraw 3000.0 success: " + success3 + ", Current Balance: " + String.format("%.2f", account1.getBalance()));
    }
}