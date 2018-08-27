package bean;

import java.util.ArrayList;

/**
 * @author PouriaM
 */
public class Graph {
    private ArrayList<Edge> edges;
    private int[] vertices;
    public Graph(ArrayList<Edge> edges, int vertices){
        this.edges = edges;
        this.vertices = new int[vertices];
        for(int i=0; i< vertices; i++){
            this.vertices[i] = i+1;
        }
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public int[] getVertices() {
        return vertices;
    }
    
}
