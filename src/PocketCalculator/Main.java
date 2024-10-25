package PocketCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test câu a");
        CasioFX500 casioFX500 = new CasioFX500();
        Cal500MS cal500MS = new Cal500MS();


        System.out.println("casio fx 500: a + b = " + casioFX500.add(50, 100));
        System.out.println("cal 500 ms:a / b = " + cal500MS.div(150, 50));
        System.out.println("");
        System.out.println("Test câu b");
        double[] arr =  new double[] {5,1,5,6,7,3,3,5};
        double[] arr2 =  new double[] {6,32,5,7,7,18,23,2};

        SortBySelect sortBySelect = new SortBySelect();
        InsertionSort insertionSort = new InsertionSort();

        sortBySelect.ascendingArraySort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n");
        insertionSort.descendingArraySort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }

        System.out.println("\n");
        System.out.println("Test câu c");
        CalculatorSoftware calculatorSoftware = new CalculatorSoftware();
        System.out.println("50 + 100000 = " + calculatorSoftware.add(50, 100000) );
        System.out.println("50 - 100000 = " + calculatorSoftware.mul(50, 100000) );
        System.out.println("50 * 3 = " + calculatorSoftware.sub(50, 3) );
        System.out.println("50 / 5 = " + calculatorSoftware.sub(50, 5) );
    }
}
