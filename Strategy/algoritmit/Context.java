package algoritmit;

public class Context {
    private SortAlgoritmi algoritmi;

    public void setAlgoritmi(SortAlgoritmi algoritmi) {
        this.algoritmi = algoritmi;
    }

    public void sorttaa(int[] array) {
        algoritmi.sort(array);
    }
}
