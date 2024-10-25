package PocketCalculator;

public class InsertionSort implements Arrange {
    @Override
    public void ascendingArraySort(double[] arr) {
        int i, j;
        double key;
        int n = arr.length;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    @Override
    public void descendingArraySort(double[] arr) {
        int i, j;
        double key;
        int n = arr.length;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }
}
