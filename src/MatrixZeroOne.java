public class MatrixZeroOne {


    public static void replaceZero(int[][] matrix) {
        int rows = matrix.length; //number of rows
        int cols = matrix[0].length; //number of cols


        boolean[] rowsToReplace = new boolean[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowsToReplace[i] = true;
                    break;
                }
            }
        }

        //replace zero to identified rows
        for (int i = 0; i < rows; i++) {
            if (rowsToReplace[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };

        replaceZero(matrix);
        printMatrix(matrix);


    }
}
