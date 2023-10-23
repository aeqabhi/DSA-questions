import java.util.ArrayList;

class ADJlist{
    static class Edges{
        int src;
        int des;
        int weight;

        Edges(int src,int des,int weight){
            this.src = src;
            this.des = des;
            this.weight = weight;
        }
    }
    public void createGraph(ArrayList<Edges> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,2,10));

        graph[1].add(new Edges(1,2,2));
        graph[1].add(new Edges(1,3,2));
        
        graph[2].add(new Edges(2,3,4));
        graph[2].add(new Edges(2,1,12));
        graph[2].add(new Edges(2,0,5));

        graph[3].add(new Edges(3,2,6));
        graph[3].add(new Edges(3,1,4));
    }
    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edges> graph[] = new ArrayList[V];

        ADJlist list = new ADJlist();
        list.createGraph(graph);

        //print 2's neighbour
        for(int i = 0;i<graph[2].size();i++){
            Edges e = graph[2].get(i);
            System.out.println(e.des + " " +e.weight);

        }
        


        
    }
}