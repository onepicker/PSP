package zhihu;

/**
 * @author Picker
 * @date 2023/3/24 20:30
 */
public class question2 {
    public boolean searchMatrix (int[][] matrix, int target) {
        // write code here
        int len = matrix.length;
        int len2 = matrix[0].length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len2; j++) {
               if(matrix[i][j]==target){
                   return  true;
               }

            }
        }
        return false;
    }
}
