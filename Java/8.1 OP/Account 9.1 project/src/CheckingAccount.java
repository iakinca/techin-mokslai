public class CheckingAccount extends Account {
    private final double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(String accountName, int id, double balance, double overdraftLimit) {
        super(accountName, id, balance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }


    @Override
    public String toString() {
        return "CheckingAccount{" +
                super.toString() +
                "\nOverdraft Limit: " + overdraftLimit +
                '}';
    }
}
