import java.util.Random;

public class AQ5 {
    public static void main(String[] args){
        int [][] arr = new int[4][4];
        Random rand = new Random();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = rand.nextInt(2);
            }
        }

        System.out.println("Matrix is:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxRow = 0, maxCol = 0, maxCount = 0;

        for (int i = 0; i < 4; i++) {
            int rowCount = 0, colCount = 0;
            for (int j = 0; j < 4; j++) {
                rowCount += arr[i][j];
                colCount += arr[j][i];
            }
            if (rowCount > maxCount) {
                maxRow = i;
                maxCount = rowCount;
            }
            if (colCount > maxCount) {
                maxCol = i;
                maxCount = colCount;
            }
        }

        System.out.println("Row with the most 1s: " + maxRow);
        System.out.println("Column with the most 1s: " + maxCol);
    }
}
