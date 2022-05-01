/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph.core;

/**
 *
 * @author Olafi
 */
public class Vertex {
    private String label; // Valor/Rotulo do vertice
    private int weight; 
    private int degree; // Grau do vertice
    
    public Vertex(String label) {
        boolean isLabelNull = label == null || label != null && "".equals(label.trim());
        if(isLabelNull) {
            System.out.println("Label cannot be null or blank");
        } else {
            this.label = label;
        }
    }
    
    public String getLabel() { 
        return this.label;
    }
    
    public void addDegree() { 
        this.degree++;
    }
    
    public int getDegree() { 
        return this.degree;
    }
    
}
