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
        return getFullName() + " PuffenduyStudent{" +
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
    private int getAbilitiesSum(){
        return hardworking+honest+loyal;
    }

    public void compare (HufflepuffStudent student){
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
