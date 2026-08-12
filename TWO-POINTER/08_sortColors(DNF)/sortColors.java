/*
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
*/
public class sortColors {
    public static void main(String args[]){

/*
        0 - low = 0s
        low+1 - mid = 1s
        mid+1 - high = unordered numbers
        high+1 - end = 2s
*/

        int arr[] = {2,0,2,1,1,0};

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{ // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for(int d: arr){
            System.out.print(d + " ");
        }
    }
}
