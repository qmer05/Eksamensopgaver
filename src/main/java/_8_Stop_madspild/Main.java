package _8_Stop_madspild;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        FoodWaste fw = new FoodWaste();

        LocalDate salebyDate = LocalDate.of(2024,1,10);

        System.out.println(fw.checkDate(0, salebyDate));

        // VIRKER IKKE!!!!!!!


    }
}
