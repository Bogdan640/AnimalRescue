package Model;

public abstract class Veterinarian {
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

    public void vaccinate(Animal animal) {
        if (animal == null) {
            return;
        }

        animal.setMoodLevel(Math.max(1, animal.getMoodLevel() - 3));
        animal.setHealthLevel(Math.min(10, animal.getHealthLevel() + 2));
        System.out.println(animal.getName());
    }

    public void deparasitize(Animal animal) {
        if (animal == null) {
            return;
        }

        animal.setMoodLevel(Math.max(1, animal.getMoodLevel() - 2));
        animal.setHealthLevel(Math.min(10, animal.getHealthLevel() + 1));
        System.out.println(animal.getName());
    }


    public abstract void performCheckup() ;

    @Override
    public String toString() {
        return "Veterinarian:  " + "\n\n" +
                "name  =  " + name + '\n' +
                "specialization  =  " + specialization + "\n\n";
    }
}
