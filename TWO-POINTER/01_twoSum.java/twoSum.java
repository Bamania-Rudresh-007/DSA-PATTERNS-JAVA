public class twoSum{ 
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int target = 8;

        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                System.out.print("Target found at Element:- " + arr[i] + " and " + arr[j]);
                break;
            }
            if(sum > target){
                j--;
            }
            if(sum < target){
                i++;
            }
        }

    }
}