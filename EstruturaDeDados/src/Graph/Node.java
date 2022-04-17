/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olafi
 * @param <T>
 */
public class Node<T> { // Representa o nó/vertices
    private T element; // Vertices
    private List<Edges<T>> edgesListInput = new ArrayList(); // arestas de entrada
    private List<Edges<T>> edgesListOutput = new ArrayList(); // arestas de saída
    
    public Node(T element) {
        this.element = element;
    }
    
    public void addEdgesInput(Edges<T> edgesInput) {
        this.edgesListInput.add(edgesInput);
    };

    public void addEdgesOutput(Edges<T> edgesOut) {
        this.edgesListOutput.add(edgesOut);
    };
    
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public List<Edges<T>> getEdgesListInput() {
        return edgesListInput;
    }

    public void setEdgesListInput(List<Edges<T>> edgesListInput) {
        this.edgesListInput = edgesListInput;
    }

    public List<Edges<T>> getEdgesListOutput() {
        return edgesListOutput;
    }

    public void setEdgesListOutput(List<Edges<T>> edgesOutput) {
        this.edgesListOutput = edgesOutput;
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + ", edgesListInput=" + edgesListInput + '}';
    }
}