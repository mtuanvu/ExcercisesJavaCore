package PocketCalculator;

public class CalculatorSoftware implements Calculator, Arrange{
    @Override
    public void ascendingArraySort(double[] arr) {
        int i, j, min_idx;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                    double temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public void descendingArraySort(double[] arr) {
        int i, j, min_idx;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[min_idx]) {
                    min_idx = j;

                    double temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a / b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double mul(double a, double b) {
        return a - b;
    }
}