public class Executive extends Employee{
    private double annualBonus;


    public Executive(String name, double wage, double annualBonus) {
        super(name, wage);
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    @Override
    public double getWage() {
        return super.getWage()+annualBonus/52;
    }
}
