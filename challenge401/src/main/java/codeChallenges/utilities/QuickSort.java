package codeChallenges.utilities;

public class QuickSort {
    public void quickSort (int[] arr, int left, int right){
        if (left < right){
            int pos = partition(arr, left, right);

            quickSort(arr, left, pos - 1);
            quickSort(arr, pos + 1, right);
        }
    }

    private int partition (int[] arr, int left, int right){

        int pivot = arr[right];
        int i = left - 1;

        for (int j=left; j < right; j++){
            if (arr[j] <= pivot){
                i++;

                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }

        int swap = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = swap;

        return i + 1;
    }
}
