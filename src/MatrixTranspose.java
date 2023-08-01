import java.util.Scanner;

public class MatrixTranspose {


    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length; //row
        int m = matrix[0].length; //col

        int[][] res = new int[m][n]; // col*row -> dimension of the result

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                 res[i][j] = matrix[j][i];
            }
        }

        return res;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] res = transpose(matrix);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.println(res[i][j] + " ");
            }
            System.out.println();
        }


    }
}
