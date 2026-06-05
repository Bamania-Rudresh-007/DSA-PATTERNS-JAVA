public class rearrange0sAnd1s {
    public static void main(String args[]){
        
        int[] arr = {1,0,1,1,0,0,1};

        System.out.println("Before:- ");
        for(int d: arr){
            System.out.print(d + " ");
        }
        System.out.println();

        int i = 0, j = 0;

        while(j < arr.length){   
            if(arr[j] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }

        System.out.println("After:- ");
        for(int d: arr){
            System.out.print(d + " ");
        }

    }
}