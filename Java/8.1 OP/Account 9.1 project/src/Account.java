import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 0.0;
    private final Date dateCreated;
    private String accountName;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
    public Account(String accountName, int id, double balance) {
        this(id, balance);
        this.accountName = accountName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100.0;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {

        return balance * getMonthlyInterestRate();

    }

    public void withdraw(double amount) {
        balance -= amount;
        Transaction transaction = new Transaction('W', amount, balance, "Withdraw transaction " + amount);
        transactions.add(transaction);
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction transaction = new Transaction('D', amount, balance, "Deposit transaction " + amount);
        transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "\nName: " + accountName + "\nBalance: " + balance + "\nMonthly Interest: " + getMonthlyInterest() + "\nDate: " + dateCreated + "\nTransactions: " + transactions;
    }
}



