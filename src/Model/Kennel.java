package Model;

public class Kennel {

    private String type;
    private String sectionLocation;
    private int capacity;

    public Kennel() {
    }

    public Kennel( String location, int capacity) {

        this.sectionLocation = location;
        this.capacity = capacity;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSectionLocation() {
        return sectionLocation;
    }

    public void setSectionLocation(String sectionLocation) {
        this.sectionLocation = sectionLocation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Kennel:  " + "\n\n" +
                "type  =  " + type + '\n' +
                "sectionLocation  =  " + sectionLocation + '\n' +
                "capacity  =  " + capacity + "\n\n";
    }
}
