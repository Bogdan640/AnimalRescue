import Model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {


        Dog dog2 = new Dog();
        dog2.setName("Bobitză");
        dog2.setAge(3);
        dog2.setHealthLevel(9);
        dog2.setHungerLevel(1);
        dog2.setMoodLevel(8);
        dog2.setFavouriteFood("meat");
        dog2.setFavouriteRecreationalActivity("running");
        dog2.setBreed("Labrador");
        dog2.setSize("Large");
        System.out.println(dog2);

        Cat cat2 = new Cat();
        cat2.setName("Miau");
        cat2.setAge(2);
        cat2.setHealthLevel(10);
        cat2.setHungerLevel(1);
        cat2.setMoodLevel(9);
        cat2.setFavouriteFood("fish");
        cat2.setFavouriteRecreationalActivity("climbing");
        cat2.setBreed("orange");
        cat2.setSize("Fat");
        System.out.println(cat2);

        Bird bird2 = new Bird();
        bird2.setName("Giani");
        bird2.setAge(1);
        bird2.setHealthLevel(8);
        bird2.setHungerLevel(2);
        bird2.setMoodLevel(7);
        bird2.setFavouriteFood("seeds");
        bird2.setFavouriteRecreationalActivity("flying");
        bird2.setSpecies("Parrot");
        bird2.setWingSpan(30);
        System.out.println(bird2);

        Duck duck2 = new Duck();
        duck2.setName("Șobo");
        duck2.setAge(1);
        duck2.setHealthLevel(8);
        duck2.setHungerLevel(2);
        duck2.setMoodLevel(7);
        duck2.setFavouriteFood("worms");
        duck2.setFavouriteRecreationalActivity("swimming");
        duck2.setSpecies("White");
        duck2.setWingSpan(25);
        duck2.setSpeed(15);
        System.out.println(duck2);

        CannedFood cannedFood = new CannedFood();
        cannedFood.setName("Canned Meat");
        cannedFood.setPrice(30);
        cannedFood.setQuantity(50);
        cannedFood.setExpirationDate(LocalDate.of(2025, 12, 31));
        cannedFood.setAvailableInStock(true);
        cannedFood.setCanSize("Large");
        System.out.println(cannedFood);

        DryFood dryFood = new DryFood();
        dryFood.setName("Dry Kibble");
        dryFood.setPrice(25);
        dryFood.setQuantity(100);
        dryFood.setExpirationDate(LocalDate.of(2026, 1, 15));
        dryFood.setAvailableInStock(true);
        dryFood.setBagSize("Small");
        dryFood.setFlavour("Chicken");
        System.out.println(dryFood);

        IndoorRecreationalActivity indoorRecreationalActivity = new IndoorRecreationalActivity();
        indoorRecreationalActivity.setName("Massage");
        indoorRecreationalActivity.setEquipmentNeeded("Massage Table");
        System.out.println(indoorRecreationalActivity);

        OutdoorRecreationalActivity outdoorRecreationalActivity = new OutdoorRecreationalActivity();
        outdoorRecreationalActivity.setName("Running");
        outdoorRecreationalActivity.setLocation("Park");
        System.out.println(outdoorRecreationalActivity);

        Manager manager = new Manager();
        manager.setName("Maria");
        manager.setSalary(8000);
        manager.setDepartment("Dogs and Cats");
        System.out.println(manager);

        CareTaker careTaker = new CareTaker();
        careTaker.setName("Ionel");
        careTaker.setSalary(4000);
        careTaker.setShift("Morning");
        System.out.println(careTaker);



        cat2.sound();
        dog2.sound();
        bird2.sound();
        duck2.sound();


    }
}