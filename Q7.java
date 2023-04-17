import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = x.nextInt();
        int arr[] = new int[len];

        for(int i = 0; i < len; i++){
            System.out.println("Enter the elements of array");
            arr[i] = x.nextInt();
        }
        int max = arr[0], min = arr[0];
        int maxFreq = 1, minFreq = 1;
        int maxPos = 0, minPos = 0;

        for (int i = 1; i < len; i++){
            if (arr[i] > max){
                max = arr[i];
                maxFreq = 1;
                maxPos = i;
            }
            else if(arr[i] == max){
                maxFreq++;
            }
            if (arr[i] < min){
                min = arr[i];
                minFreq = 1;
                minPos = i;
            }
            else if (arr[i] == min){
                minFreq++;
                minPos = i;
            }
        }
        System.out.println("Maximum element of Array is " + max + " and occurs " + maxFreq + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minFreq + " times.");
        System.out.println("First occurrence of maximum element is at position " + (maxPos + 1) + ".");
        System.out.println("Last occurrence of minimum element is at position " + (minPos + 1) + ".");
    }
}
