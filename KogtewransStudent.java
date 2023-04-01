public class KogtewransStudent extends HogwartsStudent{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public KogtewransStudent(String fullName, int powerOfMagic, int transgressonDistance, int smart, int wise, int witty, int creativity) {
        super(fullName, powerOfMagic, transgressonDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "KogtewransStudent{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", fullName=" + getfullName() +
                ", powerOfMagic=" + getpowerOfMagic() +
                ", transgressonDistance=" + gettransgressonDistance() +
                '}';
    }
}
