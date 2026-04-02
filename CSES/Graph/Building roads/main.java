/// https://cses.fi/problemset/task/1666
/// BFS, DFS, Graph, Implementation

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<List<Integer>> adj = new ArrayList<>(n+1);

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj.get(u).add(v);
            adj.get(v).add(u);
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
        StringBuilder sb = new StringBuilder();
        sb.append(k).append("\n");
        for(int i=0; i<k; i++){
            sb.append(res.get(i)).append(" ").append(res.get(i+1)).append("\n");
        }
        System.out.print(sb);
    }

    public static void BFS(boolean[] visited, int i, List<List<Integer>> adj){
        Queue<Integer> q = new ArrayDeque<>();
        visited[i] = true;
        q.add(i);

        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nei : adj.get(curr)){
                if(!visited[nei]){
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }
}
