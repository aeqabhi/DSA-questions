import java.util.ArrayList;

class Cycle {
    static class Edge {
        int src;
        int des;

        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void buildGraph(ArrayList<Edge> Graph[]) {
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<>();
        }

        Graph[0].add(new Edge(0, 2));

        Graph[1].add(new Edge(1, 0));

        Graph[2].add(new Edge(2, 3));

        Graph[3].add(new Edge(3, 0));
       
    }

    public static void DFS(ArrayList<Edge> Graph[], int curr, boolean visited[]) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < Graph[curr].size(); i++) {
            Edge e = Graph[curr].get(i);
            if(visited[e.des] == false){
                DFS(Graph,e.des,visited);
            }
        }

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> Graph[] = new ArrayList[V];

        buildGraph(Graph);

        boolean visited[] = new boolean[V];
        DFS(Graph,0,visited);
    }
}
