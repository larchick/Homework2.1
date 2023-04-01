public class SlyserinStudent extends HogwartsStudent{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlyserinStudent(String fullName, int powerOfMagic, int transgressonDistance,int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, powerOfMagic, transgressonDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public String toString() {
        return "SlyserinStudent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", fullName=" + getfullName() +
                ", powerOfMagic=" + getpowerOfMagic() +
                ", transgressonDistance=" + gettransgressonDistance() +
                '}';
    }
}
