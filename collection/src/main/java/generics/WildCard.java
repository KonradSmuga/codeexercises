package generics;

import java.util.List;

public class WildCard {

    public double process(List<? extends Number> list){
        double sum = 0;
        for(Number elements: list){
            sum += (Double) elements;
        }
        return sum;



    }
}
