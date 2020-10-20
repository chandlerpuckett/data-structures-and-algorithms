package challenges.utilities;

public class App {
    public static void main(String[] args) {

//       ---- merge sort ----
        int[] arr2 = {12,11,13,5,6,7};
        MergeSort objToSort = new MergeSort();
        objToSort.sort(arr2, 0, arr2.length - 1);

        System.out.println("----- merger sorted array -----");
        for (int num : arr2){
            System.out.print(num + " ");
        }
    }
}
