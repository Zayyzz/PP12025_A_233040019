package Pertemuan11.Latihan2;

import Pertemuan11.Latihan1.Vertex;

public class Graph {

    private Vertex vertexList[]; // array of vertices
    private int adjMAt[][]; //adjacency matrix
    private int nVerts; // current number of vertices

    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts];
        // adjacency matrix
        adjMAt = new int[maxVerts][maxVerts];
        nVerts = 0;

        for (int i = 0; i < maxVerts; i++) // set adjacency
            for (int j = 0; j < maxVerts; j++) // matrix to 0
                adjMAt[i][j] = 0;

    } // end constructor
}