package codechallengestest;

import codechallenges.utilities.MergeSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void sortSucceed(){
        int[] arr = {8,4,23,42,16,15};
        int[] arr2 = {900,20,21,2,3,10000};
        MergeSort objToSort = new MergeSort();

        objToSort.sort(arr, 0, arr.length-1);
        objToSort.sort(arr2, 0, arr2.length-1);
        int[] sorted = {4,8,15,16,23,42};
        int[] arr2Sorted = {2,3,20,21,900,10000};

        assertArrayEquals(sorted, arr);
        assertArrayEquals(arr2Sorted,arr2);
    }

    @Test
    public void sortExpectFail(){
        int[] arr = {8,4,23,42,16,15};
        int[] arr2 = {900,20,21,2,3,10000};
        MergeSort objToSort = new MergeSort();

        objToSort.sort(arr, 0, arr.length-1);
        objToSort.sort(arr2, 0, arr2.length-1);

        // ----- mis-sorted test arrays
        int[] sorted = {8,4,15,16,42,15};
        int[] arr2sorted = {2,3,21,900,20,10000};

        assertFalse(arr.equals(sorted));
        assertFalse(arr2.equals(arr2sorted));
    }

    @Test
    public void sortEdgeCase(){
        int[] arr = {};
        int[] arr2 = {2,1};
        int[] arr3 = {1,0,-1};
        int[] arr4 = {1,0,0,-1};
        MergeSort objToSort = new MergeSort();

        objToSort.sort(arr,0,arr.length-1);
        objToSort.sort(arr2,0,arr2.length-1);
        objToSort.sort(arr3,0,arr3.length-1);
        objToSort.sort(arr4,0,arr4.length-1);

        // ---- control arrays
        int[] sorted = {};
        int[] arr2sorted = {1,2};
        int[] arr3sorted = {-1,0,1};
        int[] arr4sorted = {-1,0,0,1};

        assertArrayEquals(sorted,arr);
        assertArrayEquals(arr2sorted,arr2);
        assertArrayEquals(arr3sorted,arr3);
        assertArrayEquals(arr4sorted,arr4);
    }

}
