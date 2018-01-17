package Graphs;

/**
 * Sort edges in ascending order
 * pick up the edges 1 by 1 and if they don't form cycle with existing mst then include it into mst else move to next
 * max. edges of mst for graph with vertex V is V-1 edges....so perform the above steps till we V-1 edges
 */
public class MSTKruskal {
    public static void main(String[] args) {
        MSTKruskal t = new MSTKruskal();
        int graph[][] = new int[][] { {0, 10, 30, 15}, {10, 0, 40, 0}, {30, 40, 0, 50}, { 15, 0, 50, 0 } };
        t.mst();

        adj = graph;
    }

    private static int adj[][];
    private void mst(){

    }
}
