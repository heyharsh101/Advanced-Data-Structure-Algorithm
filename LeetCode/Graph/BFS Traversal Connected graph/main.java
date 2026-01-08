import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class main {
    public ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> graph){
        int V = graph.size();
        boolean visited[] = new boolean[V];
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0]= true;
        while(!q.isEmpty()){
            int curr = q.poll();
            bfs.add(curr);
            for(int x : graph.get(curr)){
                if(!visited[x]){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int V = 5; // Number of vertices
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        // Example edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(4);
        graph.get(3).add(1);
        graph.get(4).add(2);

        main obj = new main();
        ArrayList<Integer> result = obj.bfsTraversal(graph);
        System.out.println("BFS Traversal: " + result);
    }
}
