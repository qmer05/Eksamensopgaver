package _2_Lønberegning;

public class CommissionEmployee extends Employee {
    private int baseSalary;
    private int sale;
    private int commissionPercentage;

    public CommissionEmployee(String name, String adress, int baseSalary, int sale, int commissionPercentage){
        super(name, adress);
        this.baseSalary = baseSalary;
        this.sale = sale;
        this.commissionPercentage = commissionPercentage;
    }
    @Override
    public int calculateSalary() {
        return baseSalary + (sale * commissionPercentage / 100);
    }
    public String toString(){
        return "Navn: " + getName() + " Adresse: " + getAddress() + " Løn: " + calculateSalary();
    }
}
