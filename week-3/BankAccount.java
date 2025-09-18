package tutorial3;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 123456;
        acc.accountHolder = "John Doe";
        acc.balance = 15000;

        acc.displayBalance();
    }
}
