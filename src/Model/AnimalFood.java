package Model;

import java.time.LocalDate;

public abstract class AnimalFood {
    private String name;
    private double price;
    private int quantity;
    private LocalDate expirationDate;
    private boolean availableInStock;

    public AnimalFood() {
    }

    public AnimalFood(String name, double price, int quantity,
                      LocalDate expirationDate, boolean availableInStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.availableInStock = availableInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(boolean availableInStock) {
        this.availableInStock = availableInStock;
    }


    public abstract void description() ;


    @Override
    public String toString() {
        return "AnimalFood:  " + "\n\n" +
                "name  =  " + name + '\n' +
                "price  =  " + price + '\n' +
                "quantity  =  " + quantity + '\n' +
                "expirationDate  =  " + expirationDate + '\n' +
                "availableInStock  =  " + availableInStock + "\n\n";

    }
}