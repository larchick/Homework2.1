public class HufflepuffStudent extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String fullName, int powerOfMagic, int transgressonDistance, int hardworking, int loyal, int honest) {
        super(fullName, powerOfMagic, transgressonDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "PuffenduyStudent{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", fullName=" + getFullName() +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", fullName=" + getFullName() +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }
}
