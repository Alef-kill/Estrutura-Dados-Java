/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import graph.core.Graph;
import graph.core.Vertex;
import java.util.List;

/**
 *
 * @author Olafi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Graph graph = new Graph(5);
        
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        graph.connectVertices("A", "B", 7);
        graph.connectVertices("A", "C", 6);
        graph.connectVertices("A", "D", 10);
        graph.connectVertices("A", "E", 7);

        graph.connectVertices("B", "A", 7);
        graph.connectVertices("B", "C", 7);
        graph.connectVertices("B", "D", 10);
        graph.connectVertices("B", "E", 10);
        
        graph.connectVertices("C", "A", 6);
        graph.connectVertices("C", "B", 7);
        graph.connectVertices("C", "D", 5);
        graph.connectVertices("C", "E", 9);
        
        graph.connectVertices("D", "A", 10);
        graph.connectVertices("D", "B", 10);
        graph.connectVertices("D", "C", 5);
        graph.connectVertices("D", "E", 6);
        
        graph.connectVertices("E", "A", 7);
        graph.connectVertices("E", "B", 10);
        graph.connectVertices("E", "C", 9);
        graph.connectVertices("E", "D", 6);
        
        System.out.println("degree vertex A: " + graph.getVertex("A").getDegree());
        System.out.println("degree vertex B: " + graph.getVertex("B").getDegree());
        System.out.println("degree vertex C: " + graph.getVertex("C").getDegree());
        System.out.println("degree vertex D: " + graph.getVertex("D").getDegree());
        System.out.println("degree vertex E: " + graph.getVertex("E").getDegree());
        

        System.out.println("The adjacencies: ");
        
        List<Vertex> adjacentes = graph.getAdjacencies("A");
        for (Vertex vertice : adjacentes) {
            System.out.print(vertice.getLabel() + " ");
        }
        
        System.out.println();
        
        System.out.println("Show adjacency matrix");
        graph.adjacencyMatrix.print();

    }

}
