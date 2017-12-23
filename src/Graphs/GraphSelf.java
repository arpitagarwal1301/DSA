package Graphs;

public class GraphSelf {
    int maxVertex;
    int nVertex;
    int adj[][];
    Vertex verArr[];


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

        graphSelf.display();
    }

    public GraphSelf(int number) {
        maxVertex = number;
        adj = new int[number][number];
        verArr = new Vertex[maxVertex];
        nVertex = 0;
    }

    public void addVertex(char label){
        Vertex vertex = new Vertex(label);
        verArr[nVertex++] = vertex;
    }

    public void addEdge(int a, int b){
        adj[a][b] = 1;
    }

    public void display( ){
        System.out.println(verArr);
    }
}

