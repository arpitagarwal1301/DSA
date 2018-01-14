package Graphs;

/**
 * getadjacentvertex + inorder/stack
 * try recursion
 */
public class DFS {

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


        DFS dfs = new DFS();
        dfs.depthFirstSearch(graphSelf.verArr,graphSelf.adj);

    }

    public void depthFirstSearch(Vertex vertex[],int adj[][]){
//        Stack<Integer> stack = new Stack<>();
//        vertex[0].setVisited(true);
//        stack.add(vertex[0]);
//
//        while (!stack.isEmpty()){
//            Vertex v = stack.peek();
//            getAdjacentVertices(vertex);
//        }
    }


//    public Vertex getAdjacentVertices(int v){
//
//    }


}
