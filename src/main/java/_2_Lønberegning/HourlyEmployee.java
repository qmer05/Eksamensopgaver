package _2_Lønberegning;

public class HourlyEmployee extends Employee{

    private int numberOfHours;
    private int payPerHour;

    public HourlyEmployee(String name, String address, int numberOfHours, int payPerHour){
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.payPerHour = payPerHour;
    }

    @Override
    public int calculateSalary() {
        return numberOfHours * payPerHour;
    }
    public String toString(){
        return "Navn: " + name + " Adresse: " + address + " Løn: " + calculateSalary();
    }
}
