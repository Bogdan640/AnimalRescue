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

    @Override
    public String toString() {
        return "RecreationalActivity:  " + "\n\n" +
                "name  =  " + name + "\n\n";
    }
}