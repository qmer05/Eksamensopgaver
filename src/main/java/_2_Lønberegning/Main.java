package _2_Lønberegning;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args){

        Employee monthlyEmployee = new MonthlyEmployee("Børge","Middelfartvej 20",23000);
        Employee hourlyEmployee = new HourlyEmployee("Kurt","Roskildevej 120",160,250);
        Employee commissionEmployee = new CommissionEmployee("Bent","Bogensevej 200",15000,20000,20);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(monthlyEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionEmployee);

        for (Employee e : employees){
            System.out.println(e.calculateSalary());
        }

        for (Employee e : employees){
            System.out.println(e);
        }

    }
}
