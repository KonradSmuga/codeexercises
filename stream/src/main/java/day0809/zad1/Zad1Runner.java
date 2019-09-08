package day0809.zad1;




import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zad1Runner {

    public static void main(String[] args) {

        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Jan", 23, 2300));
        workerList.add(new Worker("Jan", 14, 4000));
        workerList.add(new Worker("Anna", 16, 600));

        workerList.add(new Worker("Maga", 28, 3000));
        workerList.add(new Worker("Katarzyna ", 20, 2000));
        workerList.add(new Worker("Robert ", 19, 1500));

        ArrayList<Measurable> measurables = new ArrayList<>(workerList);
                double average = average(measurables);
    }

    public static double average(ArrayList<Measurable> measurables){
        return measurables.stream()
                .mapToDouble(e -> e.getMeasure())
                .average().getAsDouble();

    }
}
