package codechallengestest;

import codechallenges.arrayshift.ArrayShift;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {
    @Test public void testArrayShiftMethod() {
        ArrayShift classUnderTest = new ArrayShift();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someArrayShiftMethod());
    }

    @Test
    public void testArrayShift(){
        ArrayShift test = new ArrayShift();
        int[] testArrEven = {2,4,6,8};
        int num1 = 5;

        int[] testArrEven2 = {1,2,3,4,5,6};
        int num2 = 7;

        int[] testArrOdd = {1,2,3,4,5};
        int num3 = 10;

        int[] newArr = test.insertShiftArray(testArrEven, num1);
        assertEquals(newArr[2], num1);

        int[] newArr2 = test.insertShiftArray(testArrEven2, num2);
        assertEquals(newArr2[3], num2);

        int[] newArr3 = test.insertShiftArray(testArrOdd, num3);
        assertEquals(newArr3[3], num3);

    }

}
