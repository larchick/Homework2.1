public class RavenclawsStudent extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawsStudent(String fullName, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(fullName, powerOfMagic, transgressionDistance);
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
        return getFullName() + " Kogtewrans{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", fullName=" + getFullName() +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }

    private int getAbilitiesSum(){
        return smart+wise+witty+creativity;
    }

    public void compare (RavenclawsStudent student){
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
