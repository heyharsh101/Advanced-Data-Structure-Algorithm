import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {
    static int[][] dire = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[n][m];
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            arr[i] = line.toCharArray();
        }
        boolean[][] visited = new boolean[n][m];
        int cnt=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == '.' && !visited[i][j]){
                    cnt++;
                    bfs(arr, visited, i, j);
                }
            }
        }
        System.out.println(cnt);
    }
    public static void bfs(char[][] arr, boolean[][] visited, int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int a = curr[0];
            int b = curr[1];
            for(int[] d : dire){
                int nx = a + d[0];
                int ny = b + d[1];
                if(nx>=0 && nx<arr.length && ny>=0 && ny<arr[0].length && arr[nx][ny] == '.' && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}
