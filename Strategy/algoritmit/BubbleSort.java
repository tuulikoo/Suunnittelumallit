package algoritmit;

public class BubbleSort implements SortAlgoritmi{
    public void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n - i; j++) {
                if(arr[j - 1] > arr[j]) {
                    // Vertaa kahden peräkkäisen arvon suuruutta
                    // Jos edellinen on suurempi kuin seuraava, vaihdetaan niiden paikkaa
                    int temp = arr[j - 1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
