/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author Olafi
 */
public class Edges<T> { // Representa as arestas
    private int weight; // Peso
    private Node<T> home; // Aresta inicial
    private Node<T> end; // Aresta final
            
    public Edges(int weight, Node home, Node end) {
        this.home = home;
        this.end = end;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node<T> getHome() {
        return home;
    }

    public void setHome(Node<T> home) {
        this.home = home;
    }

    public Node<T> getEnd() {
        return end;
    }

    public void setEnd(Node<T> end) {
        this.end = end;
    }
    
}