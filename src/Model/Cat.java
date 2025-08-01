package Model;

public class Cat extends Animal {
    private String breed;
    private String size;
    private double weight;

    public Cat() {
    }

    public Cat(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
               String favouriteRecreationalActivity, String breed, String size) {
        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, favouriteRecreationalActivity);
        this.breed = breed;
        this.size = size;
        this.weight = 3.5;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receivePets(CareTaker careTaker) {
        if (careTaker == null) {
            return;
        }

        int newMoodLevel = Math.min(10, getMoodLevel() + 3);
        setMoodLevel(newMoodLevel);

        int newHealthLevel = Math.min(10, getHealthLevel() + 1);
        setHealthLevel(newHealthLevel);
    }

    @Override
    public void sound() {
        System.out.println("*Meoowww");
    }

    @Override
    public String toString() {
        return "Cat:  " + "\n\n" +
                super.toString() +
                "breed  =  " + breed + '\n' +
                "size  =  " + size + '\n' +
                "weight  =  " + String.format("%.1f", weight) + " kg\n\n";
    }
}
