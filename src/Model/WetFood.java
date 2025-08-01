package Model;

import java.time.LocalDate;

public class WetFood extends AnimalFood {
    private String texture;
    private int moistureContent;

    public WetFood() {
    }

    public WetFood(String name, double price, int quantity, LocalDate expirationDate,
                   boolean availableInStock, String texture, int moistureContent) {
        super(name, price, quantity, expirationDate, availableInStock);
        this.texture = texture;
        this.moistureContent = moistureContent;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public int getMoistureContent() {
        return moistureContent;
    }

    public void setMoistureContent(int moistureContent) {
        this.moistureContent = moistureContent;
    }

    @Override
    public void description() {
        System.out.println("*This is wet food with " + texture + " texture*");
    }

    @Override
    public String toString() {
        return "WetFood: " + "\n\n" +
                super.toString() +
                "texture = " + texture + '\n' +
                "moistureContent = " + moistureContent + "%\n\n";
    }
}
