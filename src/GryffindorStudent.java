public class GryffindorStudent extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;


    public GryffindorStudent(String fullName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(fullName, powerOfMagic, transgressionDistance);
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

    @Override
    public String toString() {
        return getFullName() + " GryffindorStudent{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", fullName=" + getFullName() +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }
    private int getAbilitiesSum(){
        return nobility + honor+ courage;
    }

    public void compare (GryffindorStudent student){
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
