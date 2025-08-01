package Model;

public class RecreationalActivity {
    private String name;

    public RecreationalActivity() {
    }

    public RecreationalActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void getInstructions() {
        System.out.println("Instructions for " + this.name + ":");
        System.out.println("1. Enjoy");
    }


    @Override
    public String toString() {
        return "RecreationalActivity:  " + "\n\n" +
                "name  =  " + name + "\n\n";
    }
}