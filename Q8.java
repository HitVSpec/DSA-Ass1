import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the row and column of the 2D array: ");
        int row = x.nextInt(), col = x.nextInt();
        int sum = 0;

        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = x.nextInt();
                sum += arr[i][j];
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
