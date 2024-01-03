package _8_Stop_madspild;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FoodWaste fw = new FoodWaste();

        System.out.println(fw.checkDate(0, LocalDate.of(2024,1,10)));
        System.out.println(fw.checkDate(1, LocalDate.of(2024, 1, 8)));
        System.out.println(fw.checkDate(2, LocalDate.of(2024, 1, 22)));
        System.out.println(fw.checkDate(3, LocalDate.of(2024, 1, 3)));
        System.out.println(fw.checkDate(4, LocalDate.of(2024, 1, 10)));
    }
}
