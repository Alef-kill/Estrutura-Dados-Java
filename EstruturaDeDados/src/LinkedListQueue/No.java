/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListQueue;

/**
 *
 * @author Olafi
 * @param <T>
 */
public class No<T> {
    private No prox;
    private No prev;
    private T value;
    
    No(No prox, T value) { 
        this.prox = prox;
        this.value = value;
    }
    
    No(T value) { 
        this.value = value;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getPrev() {
        return prev;
    }

    public void setPrev(No prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }   
}
