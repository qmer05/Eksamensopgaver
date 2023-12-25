package _2_Lønberegning;

public class MonthlyEmployee extends Employee {

    private int salary;

    public MonthlyEmployee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return salary;
    }

    public String toString() {
        return "Navn: " + getName() + " Adresse: " + getAddress() + " Løn: " + calculateSalary();
    }
}
