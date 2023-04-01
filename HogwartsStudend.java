public class Hogwarts {
    private String fullName;
    private int powerOfMagic;
    private int transgrassionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgrassionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgrassionDistance = transgrassionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgrassionDistance() {
        return transgrassionDistance;
    }
}
