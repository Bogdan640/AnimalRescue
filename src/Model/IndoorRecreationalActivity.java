package Model;

public class IndoorRecreationalActivity extends RecreationalActivity{
    private String equipmentNeeded;

    public IndoorRecreationalActivity() {
    }

    public IndoorRecreationalActivity(String name, String equipmentNeeded) {
        super(name);
        this.equipmentNeeded = equipmentNeeded;
    }

    public String getEquipmentNeeded() {
        return equipmentNeeded;
    }

    public void setEquipmentNeeded(String equipmentNeeded) {
        this.equipmentNeeded = equipmentNeeded;
    }

    @Override
    public void getInstructions() {
        System.out.println("Step 1. Don't break the walls");
        System.out.println("Step 2. Enjoy");
    }

    @Override
    public String toString() {
        return "IndoorRecreationalActivity:  " + "\n\n" +
                super.toString() +
                "equipmentNeeded  =  " + equipmentNeeded + "\n\n";
    }
}
