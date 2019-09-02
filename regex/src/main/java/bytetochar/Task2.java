package bytetochar;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = {68, 112, 100, 117, 125, 37, 118, 118, 107, 131, -50, -112, 128, 114, 121, 47, 132, 128, 50, 131, 131, -38, -104, 134, 143, 122, 58, 141, 139, 127, 141, 147, 153, 79};
        byte[] arr2 = new byte[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] = (byte) (arr[i] - i);
        }
        String s = new String(arr2);
        System.out.println(s);
    }
}
