public abstract class Employee {
    private String name;
    private double wage;

    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return this.name;
    }

    public double getWage() {
        return this.wage;
    }
}
