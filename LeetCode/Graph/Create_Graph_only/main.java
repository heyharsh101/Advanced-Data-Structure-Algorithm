import java.util.ArrayList;

class Edge {
    int src;
    int dest;
    int weight;

    public Edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.weight = w;
    }
}


public class main {
    public static ArrayList<Edge> createGraph(ArrayList<Edge> edges, int V) {
    ArrayList<Edge> graph = new ArrayList<>();

        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0,2, 15));
        graph.add(new Edge(1, 3,20));
        graph.add(new Edge(2,3, 25));
        return graph;
    }

    public static void print(ArrayList<Edge> graph){
        for(Edge e : graph){
            System.out.println(e.src + "--" + e.dest + ":" + e.weight);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        print(graph);
    }
}
