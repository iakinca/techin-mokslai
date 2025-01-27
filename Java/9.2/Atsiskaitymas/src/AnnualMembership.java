public class AnnualMembership extends Membership {

    public AnnualMembership(int membershipId, int memberId) {
        super(membershipId, memberId);
    }

    @Override
    public double getCost() {
        return 300.0;
    }

    @Override
    public String toString() {
        return "AnnualMembership, Cost: " + getCost() + ", Duration: 12 months";
    }
}
