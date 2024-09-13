public class BankAccount {
    String accountNumber;
    double balance;

    // No-argument constructor
    public BankAccount() {
        accountNumber = "000000";
        balance = 0.0;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.displayAccountInfo();  // Output: Account Number: 000000, Balance: $0.0
    }
}
