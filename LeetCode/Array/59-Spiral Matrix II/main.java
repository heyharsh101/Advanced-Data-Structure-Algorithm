// Same as LeetCode 59
// only purpose is to generate matrix instead of returning list

public class main {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n-1;
        int top = 0, bottom = n-1;
        int num = 1;

        while(left<=right && top<=bottom){
            for(int i = left; i<=right; i++){
                matrix[top][i] = num;
                num++;
            }
            top++;

            for(int i = top; i<=bottom; i++){
                matrix[i][right] = num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        main obj = new main();
        int generateMatrix[][] = obj.generateMatrix(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(generateMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
