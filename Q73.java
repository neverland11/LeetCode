/**
 * Created by Ge on 2016/7/7.
 * 73. Set Matrix Zeroes
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 *
 * 思路：【用常数额外空间】
 * 1.第一行是否有0，记录
 * 2.遍历下面每一行，有0，记录本行有0，且把第一行对应位置变为0。
 * 3.根据第一行的0将列变0
 * 4.根据第一行是否有0决定第一行是否变0
 */
public class Q73 {
    public void setZeroes(int[][] matrix) {
        boolean row1flag = false;
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                row1flag = true;
                break;
            }
        }

        for(int i = 1; i < matrix.length; i++){
            boolean thisrow = false;
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    thisrow = true;
                    matrix[0][j] = 0;
                }
            }
            if(thisrow){
                for(int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i < matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(row1flag){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
