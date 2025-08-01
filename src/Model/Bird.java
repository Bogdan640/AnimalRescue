package Model;

public class Bird extends Animal {
    private String species;
    private float wingSpan;

    public Bird() {
    }

    public Bird(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
                String favouriteRecreationalActivity, String species, float wingSpan) {
        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, favouriteRecreationalActivity);
        this.species = species;
        this.wingSpan = wingSpan;
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

    @Override
    public String toString() {
        return "Bird:  " + "\n\n" +
                super.toString() +
                "species  =  " + species + '\n' +
                "wingSpan  =  " + wingSpan + "\n\n";
    }
}
