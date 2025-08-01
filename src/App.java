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

        // Employees
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

        System.out.println("Dog initial stats:");
        System.out.println("Hunger: " + dog2.getHungerLevel() + ", Mood: " + dog2.getMoodLevel() + ", Weight: " + dog2.getWeight());

        CannedFood meatFood = new CannedFood();
        meatFood.setName("Premium Meat");
        meatFood.setPrice(35);
        meatFood.setQuantity(20);
        meatFood.setExpirationDate(LocalDate.of(2025, 10, 15));
        meatFood.setAvailableInStock(true);
        meatFood.setCanSize("Large");
        meatFood.setFlavour("beef meat");

        dog2.feedWithFood(meatFood);
        System.out.println("After feeding: Hunger: " + dog2.getHungerLevel() + ", Mood: " + dog2.getMoodLevel() + ", Weight: " + dog2.getWeight());
        System.out.println();

        System.out.println("Cat initial stats:");
        System.out.println("Mood: " + cat2.getMoodLevel() + ", Health: " + cat2.getHealthLevel());

        cat2.receivePets(careTaker);
        System.out.println("After pets: Mood: " + cat2.getMoodLevel() + ", Health: " + cat2.getHealthLevel());
        System.out.println();

        System.out.println("Bird initial stats:");
        System.out.println("Hunger: " + bird2.getHungerLevel() + ", Health: " + bird2.getHealthLevel() + ", Weight: " + bird2.getWeight());

        DryFood seeds = new DryFood();
        seeds.setName("Mixed Seeds");
        seeds.setPrice(15);
        seeds.setQuantity(50);
        seeds.setExpirationDate(LocalDate.of(2026, 3, 20));
        seeds.setAvailableInStock(true);
        seeds.setBagSize("Small");
        seeds.setFlavour("Sunflower");

        bird2.eatSeeds(seeds);
        System.out.println("After eating seeds: Hunger: " + bird2.getHungerLevel() + ", Health: " + bird2.getHealthLevel() + ", Weight: " + bird2.getWeight());
        System.out.println();

        System.out.println("Duck initial stats:");
        System.out.println("Mood: " + duck2.getMoodLevel() + ", Health: " + duck2.getHealthLevel() + ", Hunger: " + duck2.getHungerLevel());

        OutdoorRecreationalActivity swimming = new OutdoorRecreationalActivity();
        swimming.setName("Swimming");
        swimming.setLocation("Lake with water");

        duck2.performSwimming(swimming);
        System.out.println("After water swimming: Mood: " + duck2.getMoodLevel() + ", Health: " + duck2.getHealthLevel() + ", Hunger: " + duck2.getHungerLevel());

        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(bird2);
        System.out.println(duck2);

        System.out.println(" THE STORY OF THE LITTLE GIRL AND THE PUPPY ");

        PermanentAdopter littleGirl = new PermanentAdopter();
        littleGirl.setName("Izabella");
        littleGirl.setAge(7);
        littleGirl.setAvailableMoney(1000.0);
        littleGirl.setAddress("With her dad, she doesn't know, she is a silly little girl");

        Dog sadDog = new Dog();
        sadDog.setName("Patrocle");
        sadDog.setAge(3);
        sadDog.setHealthLevel(3);
        sadDog.setHungerLevel(9);
        sadDog.setMoodLevel(2);
        sadDog.setScareLevel(8);
        sadDog.setFavouriteFood("salam");
        sadDog.setFavouriteRecreationalActivity("playing");
        sadDog.setBreed("Labrador Mix");
        sadDog.setSize("Medium");
        sadDog.setWeight(15);

        System.out.println("Initial little girl stats:");
        System.out.println(littleGirl);
        System.out.println("Initial dog stats:");
        System.out.println(sadDog);

        DogFood salam = new DogFood();
        salam.setName("Premium salam");
        salam.setPrice(95.0);
        salam.setQuantity(20);
        salam.setExpirationDate(LocalDate.of(2026, 2, 25));
        salam.setAvailableInStock(true);
        salam.setAgeGroup("Puppy");
        salam.setCalories(350);

        System.out.println("Before feeding with salam:");
        System.out.println("Weight: " + sadDog.getWeight() + " kg, Hunger: " + sadDog.getHungerLevel() + ", Mood: " + sadDog.getMoodLevel());

        for (int i = 0; i < 5; i++) {
            littleGirl.feed(sadDog, salam);
        }

        System.out.println("After several feedings with salam:");
        System.out.println(sadDog);

        sadDog.setMoodLevel(Math.min(10, sadDog.getMoodLevel() + 3));
        sadDog.setHealthLevel(Math.min(10, sadDog.getHealthLevel() + 2));
        sadDog.setScareLevel(Math.max(0, sadDog.getScareLevel() - 4));

        OutdoorRecreationalActivity playingWithShoe = new OutdoorRecreationalActivity();
        playingWithShoe.setName("Playing with an old shoe");
        playingWithShoe.setLocation("Garden");

        int playCount = 3;
        for (int play = 0; play < playCount; play++) {
            littleGirl.performRecreationalActivity(sadDog, playingWithShoe);
        }

        System.out.println("After playing sessions:");
        System.out.println(sadDog);

        Veterinarian vet = new SeniorVeterinarian();
        vet.setName("Dr. Ceapă");
        vet.setSpecialization("General");

        JuniorVeterinarian nurse = new JuniorVeterinarian();
        nurse.setName("Magdalena");
        nurse.setSpecialization("Animal care");
        nurse.setMentorName("Dr. Ceapă");

        System.out.println("Before veterinary visit:");
        System.out.println("Patrocle's scare level: " + sadDog.getScareLevel() + ", mood: " + sadDog.getMoodLevel());

        sadDog.setScareLevel(Math.min(10, sadDog.getScareLevel() + 5));
        System.out.println("Patrocle's scare level when doctor: " + sadDog.getScareLevel() + ", mood: " + sadDog.getMoodLevel());
        nurse.comfortAnimal(sadDog);
        vet.vaccinate(sadDog);
        vet.deparasitize(sadDog);

        sadDog.setScareLevel(Math.min(10, sadDog.getScareLevel() + 2));
        System.out.println("Patrocle's scare level after doctor: " + sadDog.getScareLevel() + ", mood: " + sadDog.getMoodLevel());

        System.out.println("Final stats after doctor visit: Scare level: " + sadDog.getScareLevel() +
                         "\nMood: " + sadDog.getMoodLevel() +
                         "\nHealth: " + sadDog.getHealthLevel() + "\n");

        WetFood wetFood = new WetFood();
        wetFood.setName("Premium Wet Food");
        wetFood.setPrice(45.0);
        wetFood.setQuantity(30);
        wetFood.setExpirationDate(LocalDate.of(2027, 7, 7));
        wetFood.setAvailableInStock(true);
        wetFood.setTexture("Puke");
        wetFood.setMoistureContent(85);

        for (int feed = 0; feed < 4; feed++) {
            littleGirl.feed(sadDog, wetFood);
        }

        System.out.println("After wet food: Weight: " + String.format("%.1f", sadDog.getWeight()) + " kg");

        DogFood dietFood = new DogFood();
        dietFood.setName("Diet Dog Food");
        dietFood.setPrice(50.0);
        dietFood.setQuantity(25);
        dietFood.setExpirationDate(LocalDate.of(2027, 12, 25));
        dietFood.setAvailableInStock(true);
        dietFood.setAgeGroup("Adult");
        dietFood.setCalories(100);

        OutdoorRecreationalActivity morningWalk = new OutdoorRecreationalActivity();
        morningWalk.setName("Morning Walk");
        morningWalk.setLocation("Street");
        OutdoorRecreationalActivity eveningWalk = new OutdoorRecreationalActivity();
        eveningWalk.setName("Evening Walk");
        eveningWalk.setLocation("Street");
        OutdoorRecreationalActivity ballGame = new OutdoorRecreationalActivity();
        ballGame.setName("Ball Game");
        ballGame.setLocation("Garden");

        for (int day =1; day <= 7; day++) {

            littleGirl.feed(sadDog, dietFood);
            littleGirl.performRecreationalActivity(sadDog, morningWalk);
            littleGirl.performRecreationalActivity(sadDog, ballGame);
            littleGirl.performRecreationalActivity(sadDog, eveningWalk);
            littleGirl.feed(sadDog, dietFood);
            System.out.println(sadDog);
            System.out.println("\nFinal stats:");
            System.out.println(sadDog);
        }
    }
}