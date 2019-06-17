import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
//        Logger logger = LoggerFactory.getLogger(Main.class);
//        BasicConfigurator.configure();
//
        ArrayForLoops arrayForLoops = new ArrayForLoops(10);
//
        int[] array1 = arrayForLoops.createArrays(10, 30);
////        int[] array2 = arrayForLoops.createArrays(10, 40);
////
//      int[]  common = arrayForLoops.findCommonElements(array1, array2);
//      //wyświetlenie tablicy (zawsze w pętli)
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array number 1: " + array1[i]);
        }
//        System.out.println("---------------------------");
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println("array number 2: " + array2[i]);
//        }
//
//        for (int i = 0; i < common.length; i++) {
//            System.out.println(common[i]);
//        }
//
//
//
//
//        int biggestNumber = arrayForLoops.findBiggestNumber(array1);
//        logger.info(String.valueOf("biggest number " + biggestNumber));

//        arrayForLoops.printingLines();
        double average = arrayForLoops.average(array1);

        int number = 2;
        arrayForLoops.numberContains(2, array1);
    }
}
