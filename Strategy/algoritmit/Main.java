package algoritmit;


public class Main {
    public static void main(String[] args) {
        int size = 100000; // taulukon koko
        int minValue = 1; // Minimi arvo taulukossa
        int maxValue = 100; // Max arvo taulukossa
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        int[] data = IntGenerator.generateRandomArray(size, minValue, maxValue);

        Context context = new Context();
        SortAlgoritmi bubbleSort = new BubbleSort();
        SortAlgoritmi selectionSort = new SelectionSort();
        SortAlgoritmi insertionSort = new InsertionSort();

        // SelectionSort
        int[] selectionData = data.clone();
        context.setAlgoritmi(selectionSort);
        startTime = System.nanoTime();
        context.sorttaa(selectionData);
        endTime = System.nanoTime();
        long selectionSortTime = endTime - startTime;
        System.out.println("SelectionSort Time: " + selectionSortTime + " ns");
        System.out.println("SelectionSort järjestetty: ");
        //IntGenerator.printArray(selectionData);

        // InsertionSort
        int[] insertionData = data.clone();
        context.setAlgoritmi(insertionSort);
        startTime = System.nanoTime();
        context.sorttaa(insertionData);
        endTime = System.nanoTime();
        long insertionSortTime = endTime - startTime;
        System.out.println("InsertionSort Time: " + insertionSortTime + " ns");
        System.out.println("InsertionSort järjestetty: ");
        //IntGenerator.printArray(insertionData);

        // BubbleSort
        int[] bubbleData = data.clone();
        context.setAlgoritmi(bubbleSort);
        startTime = System.nanoTime();
        context.sorttaa(bubbleData);
        endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " ns");
        System.out.println("BubbleSort järjestetty: ");
        //IntGenerator.printArray(bubbleData);

    
        System.out.println();       
        System.out.println("Insertion Sort Time: " + insertionSortTime + " ns");
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " ns");
        System.out.println("Selection Sort Time: " + selectionSortTime + " ns");
        
    }
}
