package Model;

public class PermanentAdopter extends Adopter{
    private String address;

    public PermanentAdopter() {
    }

    public PermanentAdopter(String name, double availableMoney, String address) {
        super(name, availableMoney);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void isSureAboutAdoption() {
        System.out.println("Yes");
    }

    @Override
    public String toString() {
        return "PermanentAdopter:  " + "\n\n" +
                super.toString() +
                "address  =  " + address + "\n\n";
    }
}
