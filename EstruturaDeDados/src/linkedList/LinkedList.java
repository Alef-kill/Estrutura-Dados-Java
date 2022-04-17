/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;

/**
 *
 * @author Olafi
 */
public class LinkedList {
    private No first;
    private No last;
    private int length;
    
    public LinkedList() { 
        this.length = 0;
    }
    
    public void add(String newValue) { 
        No no = new No(newValue);
        if(this.first == null && this.last == null) { 
           this.first = no;
           this.last = no;
        } else { 
            this.last.setNextNo(no);
            this.last = no;
        }
        this.length++;
    }
    
    public void addRemove(String value) {
        
    }
    
    public No get(int position) {
        No actual = this.first;
        
        for (int i = 0; i < position; i++) {
            if (actual.getNextNo() != null) {
                actual = actual.getNextNo();
            }
        }
        
        return actual;
    }
    

    public No getFirst() {
        return first;
    }

    public void setFirst(No first) {
        this.first = first;
    }

    public No getLast() {
        return last;
    }

    public void setLast(No last) {
        this.last = last;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
}
