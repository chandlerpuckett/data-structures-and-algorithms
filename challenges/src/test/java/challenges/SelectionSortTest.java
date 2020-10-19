package challenges;

import challenges.utilities.SelectionSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sortTest (){
        int[] arr1 = {8,4,23,42,16,15};
        int[] arr = {10000, 90, 388, 100, 250, 80};
        int[] arr3 = {20,20,10,9,9,250,250,1,1,21};
        SelectionSort.InsertionSort(arr1);
        SelectionSort.InsertionSort(arr);
        SelectionSort.InsertionSort(arr3);

        int[] ans = {4,8,15,16,23,42};
        int[] ans2 = {80,90,100,250,388,10000};
        int[] ans3 = {1,1,9,9,10,20,20,21,250,250};
        assertArrayEquals(ans,arr1);
        assertArrayEquals(ans2,arr);
        assertArrayEquals(ans3,arr3);
    }


}
