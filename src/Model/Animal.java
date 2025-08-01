package Model;

public abstract class Animal {


    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String favouriteFood;
    private String favouriteRecreationalActivity;

    public Animal() {
    }

    public Animal(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood,
                  String favouriteRecreationalActivity) {

        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.favouriteFood = favouriteFood;
        this.favouriteRecreationalActivity = favouriteRecreationalActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteRecreationalActivity() {
        return favouriteRecreationalActivity;
    }

    public void setFavouriteRecreationalActivity(String favouriteRecreationalActivity) {
        this.favouriteRecreationalActivity = favouriteRecreationalActivity;
    }



    public abstract void sound();









    @Override
    public String toString() {
        return "Animal: " + "\n\n" +
                "Name  =  " + name + '\n' +
                "Age  =  " + age + '\n' +
                "HealthLevel  =  " + healthLevel + '\n' +
                "HungerLevel  =  " + hungerLevel + '\n' +
                "MoodLevel  =  " + moodLevel + '\n' +
                "PreferredFoodName  =  " + favouriteFood + '\n' +
                "PreferredRecreationActivityName  =  " + favouriteRecreationalActivity + "\n\n";
    }
}