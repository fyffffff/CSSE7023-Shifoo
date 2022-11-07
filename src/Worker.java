public class Worker extends Employee{
    private Manager manager;

    public Worker(String name, double wage, Manager manager) {
        super(name, wage);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

}