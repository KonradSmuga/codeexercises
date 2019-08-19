package pl.sda.javawwa20.mockitolesson;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (Integer number: numbers) {
                if(number %2 ==0){
                    oddNumbers.add(number);
                }
        }

        return oddNumbers;

    }
}
