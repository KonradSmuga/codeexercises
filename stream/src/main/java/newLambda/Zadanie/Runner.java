package newLambda.Zadanie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;


public class Runner {

    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Jan", 23));
        workerList.add(new Worker("Jan", 14));
        workerList.add(new Worker("Anna", 16));

        workerList.add(new Worker("Maga", 28));
        workerList.add(new Worker("Katarzyna ", 20));
        workerList.add(new Worker("Robert ", 19));

        Collections.sort(workerList);
        System.out.println(workerList);

        Collections.sort(workerList, new PatientLastNameComparator());
        System.out.println(workerList);

        workerList.parallelStream()
                .sorted(new PatientAgeComparator())
                .forEachOrdered(System.out::println);

        Collections.sort(workerList, new PatientAgeComparator());
        System.out.println(workerList);
    }


}


class PatientLastNameComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {

        return o1.getName().length() - o2.getName().length();
    }
}

class PatientAgeComparator implements Comparator<Worker> {


    @Override
    public int compare(Worker o1, Worker o2) {

        return o1.getAge() - o2.getAge();
    }

}

