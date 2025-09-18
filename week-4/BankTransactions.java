package tutorial4;

class Account {
    int accountNumber;
    double[] transactions;
    Account(int accountNumber, double[] transactions) {
        this.accountNumber = accountNumber;
        this.transactions = transactions;
    }
    double getLargestDeposit() {
        double max = transactions[0];
        for (double t : transactions) {
            if (t > max) {
                max = t;
            }
        }
        return max;
    }
}
public class BankTransactions {
    public static void main(String[] args) {
        Account[] accounts = {
            new Account(101, new double[]{1000, 2000, 1500, 3000}),
            new Account(102, new double[]{5000, 2000, 1000, 7000}),
            new Account(103, new double[]{2500, 1000, 4000, 3500})
        };
        Account best = accounts[0];
        for (Account a : accounts) {
            if (a.getLargestDeposit() > best.getLargestDeposit()) {
                best = a;
            }
        }
        System.out.println("Account " + best.accountNumber + 
                           " has the largest single deposit: " + best.getLargestDeposit());
    }
}
