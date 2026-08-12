package maxSumSubArraySizeK;
public class maxSumSub{
    public static void main(String args[]){

        int arr[] = {100, 200, 300, 400};
        int k = 2;

        int low = 0;
        int high = k-1;
        int sum = 0;
        int result = 0;

        for(int i = low; i <= high; i++){
            sum += arr[i];
        }

        while(high < arr.length){
            result = Math.max(result, sum);

            if(high == arr.length-1){
                break;
            }

            low++;
            high++;

            sum = sum - arr[low-1] + arr[high];
        }
        System.out.println("The maximum sum of subbarray size k is : " + result);
    }
}