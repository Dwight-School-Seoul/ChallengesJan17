package OOP;

public class CarInsurancePolicy {
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy(int policyNumber, int numPayments, String residentCity) {
        this.policyNumber = policyNumber;
        this.numPayments = numPayments;
        this.residentCity = residentCity;
    }

    public CarInsurancePolicy(int policyNumber, int numPayments) {
        this(policyNumber, numPayments, null);
    }

    public CarInsurancePolicy(int policyNumber) {
        this(policyNumber, 0, null);
    }

    public void display() {
        System.out.printf("\nPolicy number: %s\n", policyNumber);
        System.out.printf("Number of payments: %s\n", numPayments);
        System.out.printf("Resident city: %s\n", residentCity);
    }


}
