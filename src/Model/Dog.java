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

    public void feedWithFood(AnimalFood food) {
        if (food == null || !food.isAvailableInStock()) {
            return;
        }

        if (food instanceof WetFood) {
            int newHungerLevel = Math.max(0, getHungerLevel() - 4);
            setHungerLevel(newHungerLevel);

            int newMoodLevel = Math.min(10, getMoodLevel() + 2);
            setMoodLevel(newMoodLevel);

            this.weight += 0.3;
            setScareLevel(Math.max(0, getScareLevel() - 1));
        } else if (food instanceof DogFood) {
            DogFood dogFood = (DogFood) food;
            int hungerReduction = dogFood.getCalories() / 100;
            int newHungerLevel = Math.max(0, getHungerLevel() - hungerReduction);
            setHungerLevel(newHungerLevel);

            double weightGain = dogFood.getCalories() * 0.001;
            this.weight += weightGain;
        }
    }
}
