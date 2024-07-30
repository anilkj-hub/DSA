import java.util.*;
public class Missing_no_br {
    public static int missingNumber(int []a,int N){
        //outer loop that run form 1 to N:
        for (int i = 1; i <= N; i++){
            //flag variable to check 
            // if on element exists
            int flag =0;
            //search the element useing liner search:
            for (int j = 0; j < N-1; j++){
                if (a[j] ==i){
                    //i is present in the array:
                    flag = 1;
                    break;
                }
            }
            //check if on element missing
            //i.e flag ==0:
            if (flag ==0) return i;
        }
        //The following line will never excute .
        //It is just to avoid warnings.
        return -1;
    }
    public static void main(String[] args) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
