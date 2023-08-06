public class MatrixNullify {


    public static int[][] matrixNulify(int[][] matrix) {

        int rows = matrix.length; //rows of the matrix
        int cols = matrix[0].length; //cols of the matrix


        //idea is to first check the rows which need to be nulify
        boolean[] rowsToNullify = new boolean[rows];
        boolean[] colsToNullify = new boolean[cols];

        //checking rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowsToNullify[i] = true;
                    colsToNullify[j] = true;

                }
            }
        }

        //now nullifying the rows of the matrix
        for (int i = 0; i < rows; i++) {
            if (rowsToNullify[i]) { //if this is the row to nullify
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0; //this will nullify the full row of the matrix which contain 0
                }
            }
        }

        //now nullifying the cols of the matrix
        for (int j = 0; j < cols; j++) {
            if (colsToNullify[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;

    }


    public static void main(String[] args) {

        //creating 2d matrix
        int[][] matrix = {
                {1, 2, 1},
                {0, 1, 2},
                {3, 4, 5}
        };

        System.out.println("Original Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Nullified Matrix");

        int[][] nullifiedMatrix = matrixNulify(matrix);

        //now showing the matrix

        for (int i = 0; i < nullifiedMatrix.length; i++) {
            for (int j = 0; j < nullifiedMatrix[i].length; j++) {
                System.out.print(nullifiedMatrix[i][j]);
            }
            System.out.println();
        }


    }

}
