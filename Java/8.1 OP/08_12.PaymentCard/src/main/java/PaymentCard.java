public class PaymentCard {
<<<<<<< HEAD
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
=======

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
        if (balance >= 150) {
            balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
>>>>>>> f748e616018d5fb70ca8207c7d8b970b0596c948
    }
}
