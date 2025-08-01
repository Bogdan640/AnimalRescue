package Model;

public abstract class RecreationalActivity {
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


    public abstract void getInstructions() ;


    @Override
    public String toString() {
        return "RecreationalActivity:  " + "\n\n" +
                "name  =  " + name + "\n\n";
    }
}