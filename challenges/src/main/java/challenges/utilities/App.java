package challenges.utilities;

public class App {
    public static void main(String[] args) {
        int[] arr = {8,4,23,42,16,15};
        SelectionSort.InsertionSort(arr);

        for (int num : arr)
            System.out.print(num + " ");

    }
}
