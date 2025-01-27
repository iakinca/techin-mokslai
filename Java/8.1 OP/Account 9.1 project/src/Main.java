
public class Main {
    public static void main(String[] args) {

        Account account = new Account("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account);

        CheckingAccount checkingAccount = new CheckingAccount("Ilona", 7777, 50.0, 20.0);
        checkingAccount.setAnnualInterestRate(1.5);
        checkingAccount.deposit(30);
        checkingAccount.withdraw(40);
        checkingAccount.withdraw(70);

        System.out.println(checkingAccount);

        SavingsAccount savingsAccount = new SavingsAccount("Michail", 4444, 80.0);
        savingsAccount.setAnnualInterestRate(3.5);
        savingsAccount.deposit(50);
        savingsAccount.withdraw(60);

        System.out.println(savingsAccount);
    }
}
