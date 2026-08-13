package smallestSubArrayWIthGivenSum;
public class smallestSubArray{
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 2, 3, 2};
        int target = 7;
        int sum = 0;
        int diffrence = Integer.MAX_VALUE;
        int low = 0,high = 0;

        while(high < arr.length){
            sum = sum + arr[high];

            while(sum >= target){
                diffrence = Math.min(diffrence, (high-low)+1);
                sum = sum - arr[low];
                low++;
            }

            high++;
        }

        if(diffrence == Integer.MAX_VALUE){
            System.out.println("No such subarray exists");
        }else{
            System.out.println("The smallest subarray length is : " + diffrence);
        }

    }
}