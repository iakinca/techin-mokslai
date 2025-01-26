public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public SavingsAccount(String accountName, int id, double balance) {
        super(accountName, id, balance);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                super.toString() +
                '}';
    }
}
