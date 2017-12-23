package Graphs;

public class Vertex {

    char aChar;
    boolean visited;

    public Vertex(char label) {
        super();
        aChar = label;
        visited = false;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
