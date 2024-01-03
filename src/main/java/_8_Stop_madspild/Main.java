package _8_Stop_madspild;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FoodWaste fw = new FoodWaste();

        LocalDate saleByDateKat1 = LocalDate.of(2024, 1, 10);
        LocalDate saleByDateKat2 = LocalDate.of(2024, 1, 8);
        LocalDate saleByDateKat3 = LocalDate.of(2024, 1, 22);
        LocalDate saleByDateKat4 = LocalDate.of(2024, 1, 3);
        LocalDate saleByDateKat5 = LocalDate.of(2024, 1, 10);

        System.out.println(fw.checkDate(0, saleByDateKat1));
        System.out.println(fw.checkDate(1, saleByDateKat2));
        System.out.println(fw.checkDate(2, saleByDateKat3));
        System.out.println(fw.checkDate(3, saleByDateKat4));
        System.out.println(fw.checkDate(4, saleByDateKat5));
    }
}
