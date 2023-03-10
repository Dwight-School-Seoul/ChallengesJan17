package GymClubs;

public class SingleClubMember extends Members {
    private int club;

    public SingleClubMember(char memberType, int memberID, String name, double fees, int club) {
        super(memberType, memberID, name, fees);
        this.club = club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    public String toString() {
        return super.toString() + " " + club;
    }
}