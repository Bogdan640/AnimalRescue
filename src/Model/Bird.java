package Model;

public class Bird extends Animal {
    private String species;
    private float wingSpan;
    private double weight;

    public Bird() {
    }

    public Bird(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
                String favouriteRecreationalActivity, String species, float wingSpan) {
        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, favouriteRecreationalActivity);
        this.species = species;
        this.wingSpan = wingSpan;
        this.weight = 0.5;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eatSeeds(DryFood dryFood) {
        if (dryFood == null || !dryFood.isAvailableInStock()) {
            return;
        }

        int newHungerLevel = Math.max(0, getHungerLevel() - 3);
        setHungerLevel(newHungerLevel);

        int newHealthLevel = Math.min(10, getHealthLevel() + 1);
        setHealthLevel(newHealthLevel);

        this.weight += 0.02;
    }

    @Override
    public void sound() {
        System.out.println("*Gibberish bird sound*");
    }

    @Override
    public String toString() {
        return "Bird:  " + "\n\n" +
                super.toString() +
                "species  =  " + species + '\n' +
                "wingSpan  =  " + wingSpan + '\n' +
                "weight  =  " + String.format("%.2f", weight) + " kg\n\n";
    }
}
