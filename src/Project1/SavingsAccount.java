package Project1;

class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(int accountNumber, double balance, String ownerName, double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }
}
