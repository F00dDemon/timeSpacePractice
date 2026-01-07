import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

  //Orion
  // Time Complexity: O(N) N = array.length
  // Space Complexity: O(N) N = evens.length determined by array.length
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }
  //Freddie
  // Time Complexity: O(n) --> length of the matrix
  // Space Complexity: O(1) 
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  
  //Orion
  // Time Complexity: O(N) N = array length
  // Space Complexity: O(N) N = frequencies length determined by array length
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }
  //Freddie
  // Time Complexity: O(n) --> length of n
  // Space Complexity: O(n) --> n length of evens determined by n
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Orion
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    Map<Integer, Integer> numList = new HashMap<>();
    int mainvalue = -1;
    for(int i= 0; i < nums.length; i++){
      numList.put(nums[i], numList.getOrDefault(nums[i], 0) + 1);
    }
    for(int num: numList.keySet()){
      if (num>mainvalue){
        mainvalue=num;
      }
    }
    return mainvalue;
  }
  public static void main(String[] args) {
    int[] arr = {1,3,6,2,3,4,7,2,1,4,7,3,5,3,1,7,7,6,4,7};
    
    System.out.println(mostCommonTimeEfficient(arr));
  }

  /**
   * Freddie
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    
    // for (int num )




    // return num;
    return -1;
  }
}