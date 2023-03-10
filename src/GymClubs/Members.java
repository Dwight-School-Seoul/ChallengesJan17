package GymClubs;

public class Members {
            /*
            In this program, we will be working on a basic membership management program for a fitness centre. This fitness centre has three outlets:

                    1. Club Mercury
                    2. Club Neptune
                    3. Club Jupiter.

                    It also has two types of members: Single Club Members and Multi Club Members.
                            A single club member has access to only one of the three clubs.
                            A multi club member, on the other hand, has access to all three clubs.

                    The membership fee of a member depends on whether he/she is a single club or a multi club member.
                            For single club members, the fees also depend on which club he/she has access to.

                    Finally, multi club members are awarded membership points for joining the club.
                    Upon sign up, they are awarded 100 points which they can use to redeem gifts and drinks from a store.

            The program will not handle the redemption process. It will only add 100 points to the multi club member’s account.
            */

        private char memberType;
        private int memberID;
        private String name;
        private double fees;

        public Members(char memberType, int memberID, String name, double fees) {
            this.memberType = memberType;
            this.memberID = memberID;
            this.name = name;
            this.fees = fees;
        }

        public void setMemberType(char memberType) {
            this.memberType = memberType;
        }

        public void setMemberID(int memberID) {
            this.memberID = memberID;
        }


        public void setName(String name) {
            this.name = name;
        }


        public void setFees(double fees) {
            this.fees = fees;
        }

        public String toString() {
            return memberType + " " + memberID + " " + name + " " + fees;
        }


}

