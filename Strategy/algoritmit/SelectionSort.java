package algoritmit;

public class SelectionSort implements SortAlgoritmi {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    // Tarkistetaan, onko tämä arvo pienempi kuin aiemmin löydetty pienin arvo
                    index = j;
                }
            }
            // Vaihdetaan paikkaa: aseta pienempi arvo nykyiseen indeksiin
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
