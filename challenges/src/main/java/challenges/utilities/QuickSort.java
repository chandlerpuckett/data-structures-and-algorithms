package challenges.utilities;

public class QuickSort {
    public void quickSort (int[] arr, int left, int right){
        int pos = partition(arr, left, right);

        quickSort(arr, left, pos - 1);
        quickSort(arr, pos + 1, right);
    }

    public int partition (int[] arr, int left, int right){
        int pivot = arr[right];

        int low =

        return ;
    }

    public void swap (int[] arr, int idx, int low){

    }
}
