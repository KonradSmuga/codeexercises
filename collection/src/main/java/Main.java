
import NumberChasing.Numbers;
import compareObjects.Books;
import compareObjects.Employee;
import compareObjects.SalaryParameters;
import generics.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        List<String> listTwo = new ArrayList<>();
//
//        listTwo.add("Yellow");
//        listTwo.add("Black");
//        listTwo.add("Red");
//        Collections.sort(listTwo);
//        for (int i = listTwo.size() -1; i >= 0; i --){
//            System.out.println(listTwo.get(i));
//        }
//
//        System.out.println(listTwo.get(0));
//        System.out.println(listTwo.get(listTwo.size()-1));
//
//        Color color = new Color("Red");
//        Color color1 = new Color("Black");
//        Color color2 = new Color("Blue");
//
//        TreeSet<Color> colors = new TreeSet<>();
//        colors.add(color);
//        colors.add(color1);
//        colors.add(color2);
//
//        for(Color typeColor : colors){
//            System.out.println(typeColor);


//        Box<Integer> stringBox = new Box<>(5, "asd");
//        Box<Integer> integerBox = new Box<>(4, "as");
//
//        Pair<Integer, String> pairBox = new Pair<>(1, "as");
//        Pair<Integer, String> pairBox2 = new Pair<>(2, "ds");
//
//
//        PairCollection<Pair<Integer, String>> pairCollection = new PairCollection<>(pairBox);
//        Util.compare(pairBox, pairBox2);
//
//        Integer number1 = 6;
//
//
//        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int method = Box.method(intArr, number1);
//
//        System.out.println(method);
//
////        SmallBox<CharSequence> smallBox1 = new SmallBox<>(1, "asd");
////        LinkedList<Box> listBox = new LinkedList<>();
//        Box<String> an = new SmallBox<>(1, "an");


        ArrayList<Double> noes = new ArrayList<>(Arrays.asList(3.5, 6.2, 4.5, 3.0));
        Notes notes = new Notes();
        double average = notes.average(noes);

        System.out.println(average);
        Person person = new Person("Konrad", "Smuga", 901119);
        Person person1 = new Person("Konrad", "Smuga", 901119);

        if (person.equals(person1)) {
            System.out.println("te same ");
        }


        Employee worker3 = new Employee("Monica", "Smith", "99999888887");
        Employee worker4 = new Employee("Monica", "Smith", "99999888887");

        System.out.println("worker3 == worker4: " + (worker3.equals(worker4)));

        HashMap<Integer, String> theMap = new HashMap<Integer, String>();
        theMap.put(1, "One");
        theMap.put(2, "Two");
        theMap.put(7, "Seven");

        //Using entrySet() to retrieve and display content of the map
//        for (Map.Entry<Integer, String> entry : theMap.entrySet()) {
//            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
//
//            SalaryParameters salaryParameters = new SalaryParameters(4000.0, 3000.0, 2000.0, 1000.0);
//            SalaryParameters salaryParameters1 = new SalaryParameters(4000.0, 3000.0, 2000.0, 1000.0);
//            SalaryParameters salaryParameters2 = new SalaryParameters(4000.0, 3000.0, 2000.0, 1000.0);
//            SalaryParameters salaryParameters3 = new SalaryParameters(4000.0, 3000.0, 2000.0, 1000.0);
//
//            HashMap<Employee, SalaryParameters> myWorker = new HashMap<>();
//            myWorker.put(worker3, salaryParameters);
//

//        Books book1 = new Books("Lord of the rings", 1990);
//        Books book2 = new Books("Java concurrency in practice", 2001);
//        Books book3 = new Books("Java 8 ", 2014);
//        Books book4 = new Books("Moja ksiazka", 1990);
//        Books book5 = new Books("Moja ksiazka", 1990);
//
//        HashSet<Books> books = new HashSet<>();
//        books.add(book1);
//        books.add(book2);
//        books.add(book3);
//        books.add(book4);
//        books.add(book5);
//
//
//        Iterator<Books> booksIterator = books.iterator();
//
//        while (booksIterator.hasNext()) {
//            Books currentBooks = booksIterator.next();
//            System.out.println(currentBooks);
//
//        }
        Numbers numbers = new Numbers(1000, 0);
        numbers.numberChasing();


    }
}


