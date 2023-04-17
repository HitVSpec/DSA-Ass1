import java.util.Scanner;
public class Q9 {
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0.0;
        for(int i = 1; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        double arr[][] = new double[4][4];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = x.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(arr);
        System.out.println(sum);
    }
}