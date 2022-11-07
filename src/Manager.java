import java.lang.reflect.Array;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Worker> supervises = new ArrayList<Worker>();

    public Manager(String name, double wage) {
        super(name, wage);
    }

    public void addSupervisedEmployee(Worker employee) {
        supervises.add(employee);
    }

    public ArrayList<Worker> getSupervises() {
        return supervises;
    }
}
