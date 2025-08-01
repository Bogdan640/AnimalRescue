package Model;

public class Duck extends Bird {
    private int speed;

    public Duck() {
    }
    public Duck(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
                String favouriteRecreationalActivity, String species, float wingSpan, int speed) {
        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, favouriteRecreationalActivity, species, wingSpan);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void sound() {
        System.out.println("*Quack Quack*");
    }

    @Override
    public String toString() {
        return "Duck:  " + "\n\n" +
                super.toString() +
                "speed  =  " + speed + " km/h\n\n";
    }


}
