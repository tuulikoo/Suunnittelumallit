package algoritmit;
public class InsertionSort implements SortAlgoritmi {
    public void sort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    // Tarkista, onko nykyinen arvo pienempi kuin edellinen
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
    }
}
