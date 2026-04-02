/// https://cses.fi/problemset/task/1666
/// Using DSU, Union-Find, Disjoint Set Union
import java.io.*;
import java.util.*;
public class main1 {
    static class DSU{
        int[] parent;
        DSU(int n){
            parent = new int[n+1];
            for(int i=0; i<=n; i++){
                parent[i] = i;
            }
        }
        int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
        void union(int a, int b){
            int ra = find(a), rb = find(b);
            if(ra != rb){
                parent[rb] = ra;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        DSU dsu = new DSU(n);
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            dsu.union(u, v);
        }

        boolean[] seen = new boolean[n+1];
        List<Integer> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            int root = dsu.find(i);
            if(!seen[root]){
                seen[root] = true;
                res.add(i);
            }
        }
        int k = res.size()-1;
        StringBuilder sb = new StringBuilder();
        sb.append(k).append("\n");
        for(int i=0; i<k; i++){
            sb.append(res.get(i)).append(" ").append(res.get(i+1)).append("\n");
        }
        System.out.print(sb);
    }
}
