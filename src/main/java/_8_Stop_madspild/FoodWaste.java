package _8_Stop_madspild;

import java.time.LocalDate;
import java.util.ArrayList;

public class FoodWaste {
    ArrayList<Integer> limits;
    LocalDate todaysDate;

    public FoodWaste() {
        limits = new ArrayList<>();
        limits.add(3);
        limits.add(1);
        limits.add(14);
        limits.add(2);
        limits.add(5);

        todaysDate = LocalDate.of(2024, 1, 7);
    }

    public boolean checkDate(int category, LocalDate saleByDate) {
        int limitValue = limits.get(category);
        LocalDate stopFoodWasteDate = saleByDate.minusDays(limitValue);
        return stopFoodWasteDate.isBefore(todaysDate);
    }
}
