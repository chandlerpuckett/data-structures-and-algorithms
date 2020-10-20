package challenges.utilities;

public class App {
    public static void main(String[] args) {
        int[] arr = {8,4,23,42,16,15};
        SelectionSort.InsertionSort(arr);

        for (int num : arr)
            System.out.print(num + " ");


//       ---- merge sort ----

        int[] arr2 = {12,11,13,5,6,7};
        MergeSort.sort(arr2,0, arr2.length-1);

        System.out.println("----- merger sorted array -----");
        for (int num : arr2){
            System.out.println(num + " ");
        }

    }
}
