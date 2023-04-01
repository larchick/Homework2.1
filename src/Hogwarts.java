abstract public class Hogwarts{
    private String fullName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    private int getAbilitiesSum(){
        return powerOfMagic + transgressionDistance;
    }
    public void compare (Hogwarts student){
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
