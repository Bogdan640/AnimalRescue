import Model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

//        Animal animal = new Animal("Cuțu", 5, 8, 2, 7,
//                "pizza", "sleeping");
//        System.out.println(animal);
//
//        Adopter adopter = new Adopter("Bogdan", 43);
//        System.out.println(adopter);
//
//        AnimalFood animalFood = new AnimalFood("bobițe", 20, 40,
//                LocalDate.of(2026, 2, 25), true);
//        System.out.println(animalFood);
//
//        RecreationalActivity activity = new RecreationalActivity("Sleeping");
//        System.out.println(activity);
//
//        Veterinarian veterinarian = new Veterinarian("Angelescu Ramona", "rhinoplasty");
//        System.out.println(veterinarian);
//
//        Game game = new Game(adopter, animal, veterinarian);
//        System.out.println(game);
//
//
        Animal animal2 = new Animal();
        animal2.setName("Cuțu");
        animal2.setAge(5);
        animal2.setHealthLevel(8);
        animal2.setHungerLevel(2);
        animal2.setMoodLevel(7);
        animal2.setFavouriteFood("pizza");
        animal2.setFavouriteRecreationalActivity("sleeping");
        System.out.println(animal2);
//
//        Adopter adopter2 = new Adopter();
//        adopter2.setName("Bogdan");
//        adopter2.setAvailableMoney(43);
//        System.out.println(adopter2);
//
//        AnimalFood animalFood2 = new AnimalFood();
//        animalFood2.setName("bobițe");
//        animalFood2.setPrice(20);
//        animalFood2.setQuantity(40);
//        animalFood2.setExpirationDate(LocalDate.of(2026, 2, 25));
//        animalFood2.setAvailableInStock(true);
//        System.out.println(animalFood2);
//
//        RecreationalActivity activity2 = new RecreationalActivity();
//        activity2.setName("Sleeping");
//        System.out.println(activity2);
//
//        Veterinarian veterinarian2 = new Veterinarian();
//        veterinarian2.setName("Angelescu Ramona");
//        veterinarian2.setSpecialization("rhinoplasty");
//        System.out.println(veterinarian2);
//
//        Game game2 = new Game();
//        game2.setAdopter(adopter2);
//        game2.setDog(animal2);
//        game2.setVeterinarian(veterinarian2);
//        System.out.println(game2);
//
//        Employee employee = new Employee();
//        employee.setName("Ion");
//        employee.setSalary(6000);
//        System.out.println(employee);
//
//
//        Kennel kennel = new Kennel();
//        kennel.setCapacity(2);
//        kennel.setType("Wooden kennel");
//        kennel.setSectionLocation("A3");
//        System.out.println(kennel);
//
//        Shelter shelter = new Shelter();
//        shelter.setName("creative_name");
//        shelter.setAddress("Street Mihalcea, nr. 2");
//        shelter.setCapacity(100);
//        System.out.println(shelter);
//
//        Toy toy = new Toy();
//        toy.setName("Rope");
//        toy.setPrice(50);
//        toy.setType("Pulling");
//        System.out.println(toy);

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


        animal2.sound();
        cat2.sound();
        dog2.sound();
        bird2.sound();
        duck2.sound();


    }
}