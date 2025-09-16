package tutorial7;
class BankAccount {
    private String accountNumber;
    private double balance;
    private final double MIN_BALANCE = 0.0;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if(initialBalance >= MIN_BALANCE) {
            this.balance = initialBalance;
        } else {
            this.balance = MIN_BALANCE;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(1500);
    }
}