package _5_To_slags_spillere;

import java.util.Comparator;
import java.util.Random;

public class ComputerPlayer implements Player {
    private int maxValue;

    public ComputerPlayer(int maxValue){
        this.maxValue = maxValue;
    }

    public int makeAGuess() {
        Random rd = new Random();
        return rd.nextInt(1, maxValue);
    }

    public int getMaxValue(){
        return maxValue;
    }
}
