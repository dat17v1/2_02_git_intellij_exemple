package dk.clbo;

public class Member extends Person {
    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType()
    {
        // TODO: return right value
        return null;
    }

    public int monthlyFee(){
        // TODO: Implement body of this method
        return 0;

    }

    @Override
    public String toString() {
        return
                "isBasic=" + isBasic +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'';
    }
}
