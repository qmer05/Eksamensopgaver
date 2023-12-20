package _2_Lønberegning;

public abstract class Employee {
    String name;
    String address;

    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }
    public abstract int calculateSalary();

}
