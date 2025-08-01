package Model;

public class SeniorVeterinarian extends Veterinarian{
    private int yearsOfExperience;

    public SeniorVeterinarian() {
    }

    public SeniorVeterinarian(String name, String specialization, int yearsOfExperience) {
        super(name, specialization);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void performCheckup() {
        System.out.println("Performing advanced checkup for animals...");
    }

    @Override
    public String toString() {
        return "SeniorVeterinarian:  " + "\n\n" +
                super.toString() +
                "yearsOfExperience  =  " + yearsOfExperience + "\n\n";
    }
}
