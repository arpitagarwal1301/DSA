package Graphs;

import java.util.Stack;

/**
 * getadjacentvertex + inorder/stack
 * try recursion
 * same as dfs just isVisited flag and see how the input is being feeded
 * NOTE : in some case some vertices may not be transversed from starting vertices so ....run dfs from all vertices
 */
public class DFS {

    static Vertex vertex[];
    static int adj[][];

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


        DFS dfs = new DFS();
        vertex = graphSelf.verArr;
        adj = graphSelf.adj;

        for (int i=0;i<vertex.length;i++)
            dfs.depthFirstSearch(i);

    }


    public void depthFirstSearch(int position){
        this.vertex = vertex;
        this.adj = adj;

        Stack<Integer> stack = new Stack();
        if (!vertex[position].isVisited()){
            stack.push(position);
            vertex[position].setVisited(true);
        }else {
            return;
        }

        while (!stack.isEmpty()){
            int vertexPosition = stack.peek();
            int adjacentVertex = getAdjacentVertex(vertexPosition);
            if (adjacentVertex!=-1){
                vertex[adjacentVertex].setVisited(true);
                stack.push(adjacentVertex);
            }else {
                System.out.println(stack.pop());
            }
        }

    }


    private int getAdjacentVertex(int vertexPosition){
        for (int i =0;i<adj[0].length;i++){
            if (!vertex[i].isVisited() && adj[vertexPosition][i] == 1){
                return i;
            }
        }
        return -1;
    }

    public void depthFirstSearchRecursion(int position,int adj[][]){

        if (getAdjacentVertex(position)==-1){
            return;
        }


    }



}
