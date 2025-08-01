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

    public void performSwimming(OutdoorRecreationalActivity activity) {
        if (activity == null) {
            return;
        }

        if (activity.getLocation() != null && activity.getLocation().toLowerCase().contains("water")) {
            int newMoodLevel = Math.min(10, getMoodLevel() + 4);
            setMoodLevel(newMoodLevel);

            int newHealthLevel = Math.min(10, getHealthLevel() + 2);
            setHealthLevel(newHealthLevel);
        } else {
            int newMoodLevel = Math.min(10, getMoodLevel() + 1);
            setMoodLevel(newMoodLevel);
        }

        int newHungerLevel = Math.min(10, getHungerLevel() + 1);
        setHungerLevel(newHungerLevel);
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
