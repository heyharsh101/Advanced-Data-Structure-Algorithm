import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] adj = new ArrayList[n+1];
        for(int i=0; i<n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=1; i<=m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        boolean[] visited = new boolean[n+1];
        List<Integer> res = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                res.add(i);

                BFS(visited, i, adj);
            }
        }

        int k = res.size() - 1;
        System.out.println(k);
        for(int i=0; i<k; i++){
            System.out.println(res.get(i)+ " " + res.get(i+1));
        }
        sc.close();
    }
    public static void BFS(boolean[] visited, int i, List<Integer>[] adj){
        Queue<Integer> q = new LinkedList<>();
        visited[i] = true;
        q.add(i);

        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nei : adj[curr]){
                if(!visited[nei]){
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }
}
