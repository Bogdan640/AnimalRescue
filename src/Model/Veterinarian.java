package Model;

public class Veterinarian {
    private String name;
    private String specialization;

    public Veterinarian() {
    }

    public Veterinarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Veterinarian:  " + "\n\n" +
                "name  =  " + name + '\n' +
                "specialization  =  " + specialization + "\n\n";
    }
}
