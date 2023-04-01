public class Gryffindor extends HogwartsStudent{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String fullName, int powerOfMagic, int transgressonDistance, int nobility, int honor, int courage) {
        super(fullName, powerOfMagic, transgressonDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", fullName=" + getfullName() +
                ", powerOfMagic=" + getpowerOfMagic() +
                ", transgressonDistance=" + gettransgressonDistance() +
                '}';
    }
}
