import java.util.Random;

public class ArrayForLoops {
    private int arraySize;
    Random random = new Random();


    public ArrayForLoops(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] createArrays(int lowerBound, int upperBound) {

        int[] array1 = new int[arraySize];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = random.nextInt(10);
        }
        return array1;
    }

    public int findBiggestNumber(int[] arrayWithRandom) {

        int biggestNumber = arrayWithRandom[0];

        for (int i = 0; i < arrayWithRandom.length; i++) {
            if (arrayWithRandom[i] > biggestNumber) {
                biggestNumber = arrayWithRandom[i];
            }
        }
        return biggestNumber;
    }

    public int[] findCommonElements(int[] array1, int[] array2) {
        int commonsCounter = 0;
        int[] commonElements = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            boolean isNumberPresent = false;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isNumberPresent = true;
                }
            }

            if (isNumberPresent) {
                commonElements[commonsCounter] = array1[i];
                commonsCounter++;
            }

        }
        return commonElements;
    }

    public void printingLines() {
        int[][] lines = new int[10][10];

        for (int i = 0; i < lines.length; i++) {

            for (int j = 0; j < lines.length; j++) {
                System.out.printf(" - ", lines[i][j]);
            }
            System.out.println("Asd");
        }
    }

    public double average(int[] array1) {
        double sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        return sum / array1.length;
    }

//    public boolean numberContains(int number, int[] array1){
//        for(int i =0; i< array1.length; i++){
//            if(array1[i] == number) {
//
//                int[]array2 = new int[];
//                for (int j = 0; j<array2.length)
//
//                System.out.println("numer " + number + "pojawia się "+ array2.length);
//            }
//        }


}