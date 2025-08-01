package Model;

public class Dog extends Animal{
    private String breed;
    private String size;

    public Dog() {
    }

    public Dog(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
               String favouriteRecreationalActivity, String breed, String size) {
        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, favouriteRecreationalActivity);
        this.breed = breed;
        this.size = size;
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

    @Override
    public String toString() {
        return "Dog:  " + "\n\n" +
                super.toString() +
                "breed  =  " + breed + '\n' +
                "size  =  " + size + "\n\n";
    }
}
