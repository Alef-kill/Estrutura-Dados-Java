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
public class Graph<T> {    
    List<Node<T>> nodesList = new ArrayList<>(); // Lista de vertices
    List<Edges<T>> EdgesList = new ArrayList<>(); // Lista de arestas

    public Graph() {}
    
    public Boolean isEmpty() {
       return this.nodesList.isEmpty();
    }
    
    public void addNode(T t) {
        Node<T> node = new Node(t);
        nodesList.add(node);
    }
    
    public void addEdges(int peso, Node<T> nodeInput, Node<T> nodeOutput) {
        Node<T> nodeInputExist = this.getVerticesInList(nodeInput);
        Node<T> nodeOutputExist = this.getVerticesInList(nodeOutput);
        
        if(nodeInputExist != null && nodeOutputExist != null) {
            Edges<T> edges = new Edges<T>(peso, nodeInput, nodeOutput);
            
            nodeInputExist.addEdgesInput(edges);
            nodeOutputExist.addEdgesOutput(edges);
            
            this.EdgesList.add(edges);
        }
    }
    
    public Node<T> getVerticesInList(Node<T> t) {
        Node<T> node = null;
        for (int i = 0; i < this.nodesList.size(); i++) {
            if(this.nodesList.get(i).equals(t)) {
                node = t;
                break;
            }
        }
        return node;
    }

}

