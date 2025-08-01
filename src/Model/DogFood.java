package Model;

import java.time.LocalDate;

public class DogFood extends AnimalFood {
    private String ageGroup;
    private int calories;

    public DogFood() {
    }

    public DogFood(String name, double price, int quantity, LocalDate expirationDate,
                   boolean availableInStock, String ageGroup, int calories) {
        super(name, price, quantity, expirationDate, availableInStock);
        this.ageGroup = ageGroup;
        this.calories = calories;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void description() {
        System.out.println("*This is specialized dog food for " + ageGroup + "*");
    }

    @Override
    public String toString() {
        return "DogFood: " + "\n\n" +
                super.toString() +
                "ageGroup = " + ageGroup + '\n' +
                "calories = " + calories + "\n\n";
    }
}
