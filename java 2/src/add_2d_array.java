public class add_2d_array {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 4, 6},
                {8, 10, 12}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (i = 0; i < mat1.length; i++) {
            for (j = 0; j < mat1[i].length; j++) {


                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            for (i = 0; i < mat1.length; i++) {
                for (j = 0; j < mat1[i].length; j++) {


                    result[i][j] = mat1[i][j] + mat2[i][j];
                    System.out.print(result[i][j] + " ");




                }

            }
        }
    }
}