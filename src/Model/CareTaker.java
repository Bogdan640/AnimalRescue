package Model;

public class CareTaker extends Employee{

    private String shift;

    public CareTaker() {
    }

    public CareTaker(String name, double salary, String shift) {
        super(name, salary);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }



    @Override
    public void performDuties() {
        System.out.println("Taking care of the animals...");
    }

    @Override
    public String toString() {
        return "CareTaker:  " + "\n\n" +
                super.toString() +
                "shift  =  " + shift + "\n\n";
    }


}
