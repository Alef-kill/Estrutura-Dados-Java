/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olafi
 */
public class AdjacencyMatrix {
    private IMatrixModel[][] matrix;
    private List<Vertex> vertices;
    private int amountVertices;
    
    public AdjacencyMatrix(List<Vertex> vertices) {
        this.vertices = vertices;
        this.amountVertices = vertices.size();
        this.matrix = new IMatrixModel[amountVertices][amountVertices];
        this.buildMatrix();
    }
    
    public void buildMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = new IMatrixModel(0, 0);
            }
        }
    }
    
    public void addEdges(int indexVertexInitial, int indexVertexFinal, int weight) {
        Vertex initialVertex = this.vertices.get(indexVertexInitial);
        Vertex finalVertex = this.vertices.get(indexVertexFinal);
        
        if(indexVertexInitial == indexVertexFinal) { 
            this.matrix[indexVertexInitial][indexVertexInitial] = new IMatrixModel(1, weight);
            initialVertex.addDegree();
        } else { 
            matrix[indexVertexInitial][indexVertexFinal] = new IMatrixModel(1, weight);
            initialVertex.addDegree();
            matrix[indexVertexFinal][indexVertexInitial] = new IMatrixModel(1, weight);
            finalVertex.addDegree();
        }
    }
    
    public List<Vertex> getAdjacency(int indexVertice) {
        int line = indexVertice;
        List<Vertex> adjacencies = new ArrayList<>();
        
        for(int j=0; j < vertices.size(); j++) {
            if(matrix[line][j].number == 1) {
                Vertex vertice = vertices.get(j);
                adjacencies.add(vertice);
            }
        }
        
        return adjacencies;
    }
    
    
    public void print() { 
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j]);
                if(j == amountVertices -1) {
                    System.out.println("");
                }
            }
        }
    }
}


class IMatrixModel{
    int number;
    int weight;

    public IMatrixModel(int number, int weight) {
        this.number = number;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  number+" ";
    }
    
    
}