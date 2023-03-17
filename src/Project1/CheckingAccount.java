package Project1;

class CheckingAccount extends Account {
    private final double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, String ownerName, double overdraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdrawWithOverdraft(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
//            updateAccount();
            return true;
        } else {
            return false;
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}