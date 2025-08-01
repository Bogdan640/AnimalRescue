import Model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal animal = new Animal("Cutu", 5, 8, 2, 7,
                "pizza", "sleeping");
        System.out.println(animal);

        Adopter adopter = new Adopter("Bogdan", 43);
        System.out.println(adopter);

        AnimalFood animalFood = new AnimalFood("bobițe", 20, 40,
                LocalDate.of(2026, 2, 25), true);
        System.out.println(animalFood);

        RecreationalActivity activity = new RecreationalActivity("Sleeping");
        System.out.println(activity);

        Veterinarian veterinarian = new Veterinarian("Angelescu Ramona", "rhinoplasty");
        System.out.println(veterinarian);

        Game game = new Game(adopter, animal, veterinarian);
        System.out.println(game);

    }
}