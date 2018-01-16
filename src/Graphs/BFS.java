package Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * getadjacentvertex + level order transversal
 * same as breadth first search just we have to mark vertices as visited and take care how the input is being taken
 *  * NOTE : in some case some vertices may not be transversed from starting vertices so ....run dfs from all vertices
 */
public class BFS {
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


        BFS bfs = new BFS();
        vertex = graphSelf.verArr;
        adj = graphSelf.adj;
        for (int i =0;i<vertex.length;i++)
        bfs.breadthFirstSearch(i);

    }

    static Vertex vertex[];
    static int adj[][];

    private void breadthFirstSearch(int position) {

        Queue<Integer> queue = new LinkedList<>();
        if (!vertex[position].isVisited()){
            queue.add(position);
            vertex[position].setVisited(true);
        }else {
            return;
        }


        while (!queue.isEmpty()){
            int vertexPosition = queue.poll();
            System.out.println(vertexPosition);
            while (true){
                int adjacentVerticePosition = getAdjacentVertices(vertexPosition);
                if (adjacentVerticePosition==-1){
                    break;
                }else {
                    queue.add(adjacentVerticePosition);
                }
            }
        }

    }

    private int getAdjacentVertices(int verticePosition){
        for (int i=0;i<adj[0].length;i++){
            if (!vertex[i].isVisited() && adj[verticePosition][i]==1){
                vertex[i].setVisited(true);
                return i;
            }
        }

        return -1;
    }
}
