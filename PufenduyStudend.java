public class Pufenduy extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;

    public Pufenduy(String fullName, int powerOfMagic, int transgressonDistance, int hardworking, int loyal, int honest) {
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
        return "Pufenduy{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", fullName=" + getfullName() +
                ", powerOfMagic=" + getpowerOfMagic() +
                ", transgressonDistance=" + gettransgressonDistance() +
                '}';
    }

}
