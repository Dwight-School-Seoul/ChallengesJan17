package Project1;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, String ownerName, double overdraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdrawWithOverdraft(double amount) {
        if (getBalance() + overdraftLimit < amount) {
            System.out.println("Overdraft limit exceeded");
            return;
        }
        withdraw(amount);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
