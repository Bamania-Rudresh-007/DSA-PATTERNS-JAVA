/*
    Input: nums = [-1,2,1,-4], target = 1
    Output: 2
    Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
import java.util.Arrays;
public class tripletsSumCloseToTarget {
  public static void main(String[] args) {
    
    int arr[] = {-1,2,1,-4};
    int target = 1;
    int maxDiff = Integer.MAX_VALUE;
    int actuallSum = 0;
    Arrays.sort(arr);

    for(int i = 0; i < arr.length-2; i++){
        
        int left = i+1;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[i] + arr[left] + arr[right];
            int diffrence = Math.abs(sum - target);

            if(maxDiff > diffrence){
                maxDiff = diffrence;
                actuallSum = sum;
            }
            else if(sum < target) left++;
            else if(sum > target) right--;
        }

    }

    System.out.println(actuallSum);
  }  
}
