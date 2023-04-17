import java.util.Scanner;
public class Q10 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        double[][] arr = new double[3][4];

        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = x.nextDouble();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < arr[0].length; j++) {
            double sum = sumColumn(arr, j);
            System.out.println("Sum of column " + j + " = " + sum);
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
