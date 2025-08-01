package Model;

public class Cat extends Animal {
    private String breed;
    private String size;

    public Cat() {
    }

    public Cat(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
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
    public void sound(){
        System.out.println("*Meoowww");
    }


    @Override
    public String toString() {
        return "Cat:  " + "\n\n" +
                super.toString() +
                "breed  =  " + breed + '\n' +
                "size  =  " + size + "\n\n";
    }
}
