import java.util.Scanner;
public class AQ2 {
    public static int binarySearch(int arr[], int sea){
        return binarySearch(arr, sea, 0, arr.length - 1);
    }
    private static int binarySearch(int arr[], int sea, int l, int r){
        if (l > r){
            return - 1;
        }
        int mid = l + (r - l) / 2;
        if(arr[mid] == sea){
            return mid;
        }
        else if(arr[mid] > sea){
            return binarySearch(arr, sea, l, mid-1);
        }
        else{
            return binarySearch(arr, sea, mid + 1, r);
        }
    }
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = x.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < len; i++){
            arr[i] = x.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int sea = x.nextInt();

        int index = binarySearch(arr, sea, 0, len - 1);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
