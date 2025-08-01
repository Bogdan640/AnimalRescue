package Model;

public abstract class Adopter {
    private String name;
    private double availableMoney;
    private int age;

    public Adopter() {
    }

    public Adopter(String name, double availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
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

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public void feed(Animal animal, AnimalFood food) {
        if (animal == null || food == null || !food.isAvailableInStock()) {
            return;
        }

        if (food instanceof WetFood) {
            int newHungerLevel = Math.max(0, animal.getHungerLevel() - 4);
            animal.setHungerLevel(newHungerLevel);

            int newMoodLevel = Math.min(10, animal.getMoodLevel() + 2);
            animal.setMoodLevel(newMoodLevel);

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.setWeight(dog.getWeight() + 0.3);
                animal.setScareLevel(Math.max(0, animal.getScareLevel() - 1));
            }
        } else if (food instanceof DogFood) {
            DogFood dogFood = (DogFood) food;
            int hungerReduction = dogFood.getCalories() / 100;
            int newHungerLevel = Math.max(0, animal.getHungerLevel() - hungerReduction);
            animal.setHungerLevel(newHungerLevel);

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                double weightGain = dogFood.getCalories() * 0.001;
                dog.setWeight(dog.getWeight() + weightGain);
            }
        }
    }

    public void performRecreationalActivity(Animal animal, RecreationalActivity activity) {
        if (animal == null || activity == null) {
            return;
        }

        if (activity instanceof IndoorRecreationalActivity) {
            int newMoodLevel = Math.min(10, animal.getMoodLevel() + 2);
            animal.setMoodLevel(newMoodLevel);

            int newHungerLevel = Math.min(10, animal.getHungerLevel() + 1);
            animal.setHungerLevel(newHungerLevel);

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.setWeight(Math.max(1.0, dog.getWeight() - 0.05));
            }
        } else if (activity instanceof OutdoorRecreationalActivity) {
            int newMoodLevel = Math.min(10, animal.getMoodLevel() + 3);
            animal.setMoodLevel(newMoodLevel);

            int newHungerLevel = Math.min(10, animal.getHungerLevel() + 2);
            animal.setHungerLevel(newHungerLevel);

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.setWeight(Math.max(1.0, dog.getWeight() - 0.1));
            }
        }

        animal.setScareLevel(Math.max(0, animal.getScareLevel() - 2));
    }

    public abstract void isSureAboutAdoption();

    @Override
    public String toString() {
        return "Adopter:  " + "\n\n" +
                "name  =  " + name + '\n' +
                "availableMoney  =  " + availableMoney + "\n\n";
    }
}
