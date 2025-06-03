package Pertemuan11.Latihan6;

import Pertemuan11.Latihan4.Graph;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        // menambahkan vertex
        graph.addVertex('A'); // 0
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3
        // menambahkan edge
        graph.addEdge(0, 1); // AB
        graph.addEdge(0, 2); // AC
        graph.addEdge(0, 3); // AD
        graph.addEdge(1, 3); // BD
        graph.adjacencyMatrix();
        System.out.println();
    }
}