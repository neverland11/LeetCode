/**
 * Created by Ge on 2016/7/7.
 * 48. Rotate Image
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 *
 * y' = n - x
 * x' = y
 */
public class Q48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for(int i = 0; i <= n / 2; i++){
            for(int j = i; j < n - i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = temp;
            }
        }

    }
}
