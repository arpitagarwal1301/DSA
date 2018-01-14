package Graphs;

/**
 * getadjacentvertex + level order transversal
 */
public class BFS {
    public static void main(String[] args) {
        GraphSelf graphSelf = new GraphSelf(4);
        graphSelf.addVertex('a');
        graphSelf.addVertex('b');
        graphSelf.addVertex('c');
        graphSelf.addVertex('d');

        graphSelf.addEdge(0,1);
        graphSelf.addEdge(0,2);
        graphSelf.addEdge(1,0);
        graphSelf.addEdge(1,3);
        graphSelf.addEdge(2,0);
        graphSelf.addEdge(2,3);
        graphSelf.addEdge(3,1);
        graphSelf.addEdge(3,2);


        BFS bfs = new BFS();
        bfs.breadthFirstSearch(graphSelf.verArr,graphSelf.adj);

    }

    private void breadthFirstSearch(Vertex[] verArr, int[][] adj) {

    }
}
