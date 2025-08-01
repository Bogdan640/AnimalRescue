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
    public String toString() {
        return "JuniorVeterinarian:  " + "\n\n" +
                super.toString() +
                "mentorName  =  " + mentorName + "\n\n";
    }
}
