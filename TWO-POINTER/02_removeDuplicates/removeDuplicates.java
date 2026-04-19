public class removeDuplicates {
    public static void main(String args[]){
        int[] arr = {1,2,2,3,4,5,5};

        int i = 1;
        int j = i+1;
        int till = 1;

        while(j < arr.length){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                till++;
            }
            j++;
        }


        for (int k = 0; k <= till; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
//1:-  i = 2, j = 2 false
//2:- i = 2, j = 3   true i++ i = j  till++ j++ ;
        