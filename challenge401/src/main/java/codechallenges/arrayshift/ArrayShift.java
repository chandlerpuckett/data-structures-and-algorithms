package codechallenges.arrayshift;


public class ArrayShift {
    public boolean someArrayShiftMethod (){
        System.out.println("Array Shift working");
        return true;
    }

    public int[] insertShiftArray(int[] arr, int num){
//        Solution Code Goes Here

        int[] newArr = new int[arr.length + 1];
        int middleIdx;
        int j = 0;

        if (arr.length % 2 == 0){
            middleIdx = arr.length / 2;
        } else {
            middleIdx = arr.length / 2 + 1;
        }

        for (int i=0; i < newArr.length; i++){

            if(newArr[middleIdx] == newArr[i]){
                newArr[middleIdx] = num;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        return newArr;
    }
}
