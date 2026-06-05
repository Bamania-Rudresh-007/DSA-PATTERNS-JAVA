import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class tripletsSumToZero{
    public static void main(String[] args) {
        
        // Input:-
        int[] arr = {-1,0,1,2,-1,-4};
        // Output :-  [[-1,-1,2],[-1,0,1]]
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length-2; i++){


            if(i > 0 && arr[i] == arr[i-1]){
                i++;
            }

            int left = i+1;
            int right = arr.length-1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){
                    result.add(List.of(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left-1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right+1]) {
                        right--;
                    }
                }

                else if(sum < 0){
                    left++;
                }
                else{ // sum > 0
                    right--;
                }
            }

        }

        System.out.println(result);

    }
}