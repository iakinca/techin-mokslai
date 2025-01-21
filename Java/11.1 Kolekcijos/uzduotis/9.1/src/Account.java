public class Account extends CheckingAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;


    public Account(int id, double balance) {
this.id = id;
this.balance = balance;
this.annualInterestRate = 0;
this.dateCreated = new Date



    }
}
