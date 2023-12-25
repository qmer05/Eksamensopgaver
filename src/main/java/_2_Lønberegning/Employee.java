package _2_Lønberegning;

public abstract class Employee {
    private String name;
    private String address;

    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public abstract int calculateSalary();

}
