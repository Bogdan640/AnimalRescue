package Model;

public class JuniorVeterinarian extends Veterinarian{
    private String mentorName;

    public JuniorVeterinarian() {
    }

    public JuniorVeterinarian(String name, String specialization, String mentorName) {
        super(name, specialization);
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }


    @Override
    public void performCheckup() {
        System.out.println("Assisting in checkup under the guidance of " + mentorName + "...");
    }

    public void comfortAnimal(Animal animal) {
        if (animal == null) {
            return;
        }



        animal.setScareLevel(Math.max(0, animal.getScareLevel() - 2));
        animal.setMoodLevel(Math.min(10, animal.getMoodLevel() + 1));
    }

    @Override
    public String toString() {
        return "JuniorVeterinarian:  " + "\n\n" +
                super.toString() +
                "mentorName  =  " + mentorName + "\n\n";
    }
}
