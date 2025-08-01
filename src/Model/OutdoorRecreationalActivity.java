package Model;

public class OutdoorRecreationalActivity extends RecreationalActivity {
    private String location;

    public OutdoorRecreationalActivity() {
    }

    public OutdoorRecreationalActivity(String name, String location) {
        super(name);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void getInstructions() {
        System.out.println("Step 1. Don't let the animals to touch kids, they are dirty");
        System.out.println("Step 2. Enjoy");
    }

    @Override
    public String toString() {
        return "OutdoorRecreationalActivity:  " + "\n\n" +
                super.toString() +
                "location  =  " + location + "\n\n";
    }
}
