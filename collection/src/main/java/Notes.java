import java.util.ArrayList;

public class Notes {


    public double average(ArrayList<Double> notes) {
        

        double average = 0;
        for (Double note : notes) {

            average += note / notes.size();
        }
        return average;
    }
}
