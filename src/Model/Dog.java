package Model;

public class Dog extends Animal{
    private String breed;
    private String size;
    private double weight;

    public Dog() {
    }

    public Dog(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
               String favouriteRecreationalActivity, String breed, String size) {
        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, favouriteRecreationalActivity);
        this.breed = breed;
        this.size = size;
        this.weight = 5.0;
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

    public void feedWithFood(CannedFood cannedFood) {
        if (cannedFood == null || !cannedFood.isAvailableInStock()) {
            return;
        }

        int newHungerLevel = Math.max(0, getHungerLevel() - 4);
        setHungerLevel(newHungerLevel);

        int newMoodLevel = Math.min(10, getMoodLevel() + 2);
        setMoodLevel(newMoodLevel);

        if ("Large".equals(cannedFood.getCanSize())) {
            this.weight += 0.2;
        } else {
            this.weight += 0.1;
        }

        if (cannedFood.getFlavour() != null &&
            cannedFood.getFlavour().toLowerCase().contains(getFavouriteFood().toLowerCase())) {
            setMoodLevel(Math.min(10, getMoodLevel() + 1));
        }
    }

    @Override
    public void sound() {
        System.out.println("*Woof Woof*");
    }

    @Override
    public String toString() {
        return "Dog:  " + "\n\n" +
                super.toString() +
                "breed  =  " + breed + '\n' +
                "size  =  " + size + '\n' +
                "weight  =  " + String.format("%.1f", weight) + " kg\n\n";
    }
}
