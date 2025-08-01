package Model;

public class Manager extends Employee {

    private String department;

    public Manager() {
    }

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager:  " + "\n\n" +
                super.toString() +
                "department  =  " + department + "\n\n";
    }
}
