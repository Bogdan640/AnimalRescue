package Model;

import java.util.List;

public class Shelter {
    private String name;
    private String address;
    private int capacity;
    private List<Animal> animals;

    public Shelter() {}

    public Shelter(String name, String address, int capacity, List<Animal> animals) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
       return "Shelter:  " + "\n\n" +
              "name  =  " + name + '\n' +
              "address  =  " + address + '\n' +
              "capacity  =  " + capacity + '\n' +
              "animals  =  " + animals + "\n\n";
    }
}