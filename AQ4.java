import java.util.Arrays;

public class AQ4 {
    public static void rearrange(int []A, int k){
        rearrange(A, k, 0, A.length - 1);
    }
    private static void rearrange(int []A, int k, int start, int end){
        if(start >= end){
            return;
        }
        if(A[start] <= k){
            rearrange(A, k, start + 1, end);
        }
        else if (A[end]> k) {
            rearrange(A, k, start, end - 1);
        }
        else{
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            rearrange(A, k, start + 1, end - 1);
        }
    }
    public static void main(String[] args){
        int A[] = {1,3,5,7,9,4,2,8,6,0};
        int k = 5;
        System.out.println("Original Array: " + Arrays.toString(A));
        rearrange(A, k);
        System.out.println("Rearranged Array: " + Arrays.toString(A));
    }
}
