/*

    Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
    Output: 4
    Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).

*/
import java.util.Arrays;
class tripletsWithSmallerSum {
    public static void main(String args[]){
        int[] arr = {5, 1, 3, 4, 7};
        int sum = 12;
        int ans = 0;

        Arrays.sort(arr);

        for(int i = 0; i < arr.length-2; i++){

            int left = i+1; 
            int right = arr.length-1;

            while(left < right){
                int tripSum = arr[i] + arr[left] + arr[right];

                if(tripSum >= sum){
                    right--;
                }
                else if(tripSum < sum){ // tripSum < sum
                    ans = ans + (left - right);
                    left++;
                }

            }
        }

        System.out.println(Math.abs(ans));
    }
}
