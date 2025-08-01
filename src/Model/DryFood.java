package Model;

import java.time.LocalDate;

public class DryFood extends AnimalFood{
    public String bagSize;
    public String flavour;

    public DryFood() {}

    public DryFood(String bagSize, String flavour) {
        this.bagSize = bagSize;
        this.flavour = flavour;
    }


    public DryFood(String name, double price, int quantity, LocalDate expirationDate, boolean availableInStock, String flavour, String bagSize) {
        super(name, price, quantity, expirationDate, availableInStock);
        this.flavour = flavour;
        this.bagSize = bagSize;
    }

    public String getBagSize() {
        return bagSize;
    }
    public void setBagSize(String bagSize) {
        this.bagSize = bagSize;

    }
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;

    }
    @Override
    public String toString() {
        return "DryFood:  " + "\n\n" +
                super.toString() +
                "bagSize  =  " + bagSize + '\n' +
                "flavour  =  " + flavour + "\n\n";
    }
}
