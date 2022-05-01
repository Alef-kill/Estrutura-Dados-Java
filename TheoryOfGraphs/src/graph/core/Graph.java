/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Olafi
 */
public class Graph {

    private List<Vertex> vertices = new ArrayList<>();
    private Map<String, Integer> labelInIndex = new HashMap<>();
    private int maxAmountOfVertices; // Quantidade maxima de vertices em um grafo
    private int amountActualOfVertices = 0;
    public AdjacencyMatrix adjacencyMatrix;

    public Graph() {
        this.maxAmountOfVertices = 10;
    }

    public Graph(int maxAmountOfVertices)throws Exception{
        if (maxAmountOfVertices <= 0) {
            throw new Exception("Maximum amount of vertice cannot be less or equal to 0.");
        } else {
            this.maxAmountOfVertices = maxAmountOfVertices;
        }
    }

    public void addVertex(String label) throws Exception{
        if (this.amountActualOfVertices <= maxAmountOfVertices - 1) {
            Vertex newVertex = new Vertex(label);
            vertices.add(newVertex);
            this.labelInIndex.put(label, this.amountActualOfVertices);
            this.amountActualOfVertices++;
        } else {
            throw new Exception("The amount max of vertex is " + this.amountActualOfVertices);
        }
    }
    
     private void createAdjacencyMatriz(){
        if(this.adjacencyMatrix == null){
            this.adjacencyMatrix = new AdjacencyMatrix(new ArrayList<>(this.vertices));
        }
    }
    

    public void connectVertices(String labelVertexInitial, String labelVertexFinal, int weight) throws Exception {
        if (!this.existsVertex(labelVertexInitial) || !this.existsVertex(labelVertexFinal)) {
            throw new Exception("To add one edges both the vertices must exist.");
        }
        this.createAdjacencyMatriz();
        int indiceVerticeFinal = this.labelInIndex.get(labelVertexInitial);
        int indiceVerticeInicial = this.labelInIndex.get(labelVertexFinal);
        this.adjacencyMatrix.addEdges(indiceVerticeInicial, indiceVerticeFinal, weight);
    }
    
    public List<Vertex> getAdjacencies(String vertice) {
        this.existsVertexOrThrow(vertice);
        int indiceVertice = this.labelInIndex.get(vertice);
        return this.adjacencyMatrix.getAdjacency(indiceVertice);
    }

    public boolean existsVertexOrThrow(String vertex) {
        if (!existsVertex(vertex)) {
            throw new IllegalArgumentException("vertex dont exists");
        }
        return true;
    }

    public boolean existsVertex(String labelVertex) {
        int index = this.labelInIndex.get(labelVertex);
        return vertices.get(index) != null;
    }

    public Vertex getVertex(String label) {
        this.existsVertexOrThrow(label);
        int indexVertex = this.labelInIndex.get(label);
        return vertices.get(indexVertex);
    }

    public List<Vertex> getVertices() {
        return vertices;
    }
}
