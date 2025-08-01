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


        Animal animal2 = new Animal();
        animal2.setName("Cuțu");
        animal2.setAge(5);
        animal2.setHealthLevel(8);
        animal2.setHungerLevel(2);
        animal2.setMoodLevel(7);
        animal2.setFavouriteFood("pizza");
        animal2.setFavouriteRecreationalActivity("sleeping");
        System.out.println(animal2);

        Adopter adopter2 = new Adopter();
        adopter2.setName("Bogdan");
        adopter2.setAvailableMoney(43);
        System.out.println(adopter2);

        AnimalFood animalFood2 = new AnimalFood();
        animalFood2.setName("bobițe");
        animalFood2.setPrice(20);
        animalFood2.setQuantity(40);
        animalFood2.setExpirationDate(LocalDate.of(2026, 2, 25));
        animalFood2.setAvailableInStock(true);
        System.out.println(animalFood2);

        RecreationalActivity activity2 = new RecreationalActivity();
        activity2.setName("Sleeping");
        System.out.println(activity2);

        Veterinarian veterinarian2 = new Veterinarian();
        veterinarian2.setName("Angelescu Ramona");
        veterinarian2.setSpecialization("rhinoplasty");
        System.out.println(veterinarian2);

        Game game2 = new Game();
        game2.setAdopter(adopter2);
        game2.setDog(animal2);
        game2.setVeterinarian(veterinarian2);
        System.out.println(game2);

        Employee employee = new Employee();
        employee.setName("Ion");
        employee.setPosition("Manager");
        employee.setSalary(6000);
        System.out.println(employee);


        Kennel kennel = new Kennel();
        kennel.setCapacity(2);
        kennel.setType("Wooden kennel");
        kennel.setSectionLocation("A3");
        System.out.println(kennel);

        Shelter shelter = new Shelter();
        shelter.setName("creative_name");
        shelter.setAddress("Street Mihalcea, nr. 2");
        shelter.setCapacity(100);
        System.out.println(shelter);

        Toy toy = new Toy();
        toy.setName("Rope");
        toy.setPrice(50);
        toy.setType("Pulling");
        System.out.println(toy);


    }
}