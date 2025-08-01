package Model;

import java.time.LocalDate;

public class CannedFood extends AnimalFood {

    private String canSize;
    private String flavour;

    public CannedFood() {}

    public CannedFood(String canSize, String flavour) {
        this.canSize = canSize;
        this.flavour = flavour;
    }

    public CannedFood(String name, double price, int quantity, LocalDate expirationDate, boolean availableInStock, String canSize, String flavour) {
        super(name, price, quantity, expirationDate, availableInStock);
        this.canSize = canSize;
        this.flavour = flavour;
    }

    public String getCanSize() {
        return canSize;
    }
    public void setCanSize(String canSize) {
        this.canSize = canSize;
    }
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;

    }
    @Override
    public String toString() {
        return "CannedFood:  " + "\n\n" +
                super.toString() +
                "canSize  =  " + canSize + '\n' +
                "flavour  =  " + flavour + "\n\n";
    }
}
