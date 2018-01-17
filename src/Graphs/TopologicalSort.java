package Graphs;

/**
 * Eg. build systems
 * parent <- apache , child <- apache POI.
 * api - get unisystem
 * ide, works for Directed acyclic graph (DAG)
 * use the stack
 * see geeksforgeeks - https://www.geeksforgeeks.org/topological-sorting/
 */
public class TopologicalSort {

    private static Vertex vertex[];
    private static int adj[][];

    public static void main(String[] args) {
        GraphSelf graphSelf = new GraphSelf(4);
        graphSelf.addVertex('a');
        graphSelf.addVertex('b');
        graphSelf.addVertex('c');
        graphSelf.addVertex('d');

        graphSelf.addEdge(0,1);
//        graphSelf.addEdge(0,2);
        graphSelf.addEdge(1,0);
        graphSelf.addEdge(1,3);
//        graphSelf.addEdge(2,0);
        graphSelf.addEdge(2,3);
        graphSelf.addEdge(3,1);
//        graphSelf.addEdge(3,2);


        TopologicalSort sort = new TopologicalSort();
        vertex = graphSelf.verArr;
        adj = graphSelf.adj;

        for(int i=0;i<vertex.length;i++)
            sort.topologicalSort(i);

    }



    private void topologicalSort(int v){
        //NOTE :: same as dfs just we have to print reverse
    }

    private int getAdjacent(int vertexPosition){
        for (int i=0;i<vertex.length;i++){
            if (!vertex[vertexPosition].isVisited() && adj[vertexPosition][i]==1){
                return i;
            }
        }
        return -1;
    }

}
