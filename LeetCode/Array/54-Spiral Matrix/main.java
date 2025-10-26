// Using Row and Column Boundaries to traverse the matrix in spiral order
// Left, Right, Top, Bottom boundaries are maintained and updated after each traversal

import java.util.*;
public class main {
   
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> newmatrix = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int left =0; int right=m-1;
        int top =0; int bottom=n-1;

        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                newmatrix.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                newmatrix.add(matrix[i][right]);
            }
            right--;
        
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    newmatrix.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    newmatrix.add(matrix[i][left]);
                }
                left++;
            }
        }
        return newmatrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        main obj = new main();
        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println(result);
    }

}
