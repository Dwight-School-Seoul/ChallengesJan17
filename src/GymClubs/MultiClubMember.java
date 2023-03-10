package GymClubs;

public class MultiClubMember extends Members {
    private int membershipPoints;

    public MultiClubMember(char memberType, int memberID, String name, double fees, int membershipPoints) {
        super(memberType, memberID, name, fees);
        this.membershipPoints = membershipPoints;
    }

    public void setMembershipPoints(int membershipPoints) {
        this.membershipPoints = membershipPoints;
    }

    public void addMembershipPoints(int points) {
        this.membershipPoints += points;
    }

    public String toString() {
        return super.toString() + " " + membershipPoints;
    }
}