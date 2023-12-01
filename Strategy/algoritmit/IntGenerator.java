package algoritmit;
import java.util.Random;

public class IntGenerator {
    public static int[] generateRandomArray(int size, int min , int max) {
        int[] array = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) +1) + min;
        }
        return array;
    }

    public static void printArray(int[] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    
}
