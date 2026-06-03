public class Solution {
    public static void main(String args[]){

        int[] arr = {-4,-1,0,3,10};
        int[] result = new int[arr.length];

        System.out.println("Before Process Begin:- ");
        for(int d: arr){
            System.out.print(d + " ");
        }
        System.out.println();
        

        // Find index where negatvie numbers end

        int nNums = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0) nNums++;
            else if(arr[i] >= 0) break;
        }

        // Sqaring the Array
        System.out.println("After sqaring the array elements:- ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        
        for(int d: arr){
            System.out.print(d + " ");
        }
        System.out.println();

        // merging into the final array

        int index = 0;
        int left = nNums;
        int right = nNums+1;

        while(left >= 0 && right < arr.length){
            if(arr[left] < arr[right]){
                result[index] = arr[left];
                index++;
                left--;
            }
            else{ // arr[left] > arr[right]
                result[index] = arr[right];
                index++;
                right++;
            }
        }

        while (left >= 0) {
            result[index] = arr[left];
            index++;
            left--;
        }        

        while (right < arr.length) {
            result[index] = arr[right];
            index++;
            right++;
        }

        System.out.println("After merging the both negative sqaures and positive elements sqaured array");
        
        for(int d: result){
            System.out.print(d + " ");
        }
    }
}
