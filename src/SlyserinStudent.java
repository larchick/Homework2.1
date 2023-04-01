public class SlyserinStudent extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlyserinStudent(String fullName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, powerOfMagic, transgressionDistance);
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

    @Override
    public String toString() {
        return getFullName() + " SlyserinStudent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", fullName=" + getFullName() +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }
    private int getAbilitiesSum(){
        return cunning+determination+ambition+resourcefulness+lustForPower;
    }

    public void compare (SlyserinStudent student){
        int student1Sum = this.getAbilitiesSum();

        int student2Sum = student.getAbilitiesSum();
        if (student1Sum >= student2Sum){
            System.out.println("Студент " +this.getFullName() +" лучше, чем студент " +student.getFullName());
        } else if (student1Sum > student2Sum){
            System.out.println("Студент " +student.getFullName() +" лучше, чем студент " +this.getFullName());
        }else {
            System.out.println("Студент " +this.getFullName() +" и студент " +student.getFullName() + " одинаково хороши");
        }
    }
}
