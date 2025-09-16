package tutorial5;

abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accNo, double bal) {
        this.accountNumber = accNo;
        this.balance = bal;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }
    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }
    double calculateInterest() {
        return 0;
    }
}

class LoanAccount extends BankAccount {
    LoanAccount(String accNo, double bal) {
        super(accNo, bal);
    }
    double calculateInterest() {
        return balance * 0.08;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount s1 = new SavingsAccount("S1001", 10000);
        BankAccount l1 = new LoanAccount("L2001", 50000);

        System.out.println("Savings Interest: " + s1.calculateInterest());
        System.out.println("Loan Interest: " + l1.calculateInterest());
    }
}
