package challenges.ArrayReverse;

public class ArrayReverse {
   
  public static void main (final String[] args) {

    int[] testArray1 = new int[]{1, 2, 3, 4, 5, 6};
    int[] testArray2 = new int[]{89, 2354, 3546, 23, 10, -923, 823, -12};
    int[] testArray3 = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

    reverseArray(testArray1);
    reverseArray(testArray2);
    reverseArray(testArray3);
    
  }

  private static void reverseArray (int[] test){

    for (int i=0; i<test.length/2; i++){
      int temp = test[i];
      test[i] = test[test.length -i -1];
      test[test.length -i -1] = temp;
    }
    
    System.out.println("SORTED ARRAY: ");
    for (int val : test){
      System.out.println(val);
    }

  }
  
}