/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListQueue;

/**
 *
 * @author Olafi
 */
public class Queue<T> {
    public No start;
    public No end;
    public int size;
    
    public void addStart(T value) { 
        if(this.isEmpty()) {
            No no = new No(value);
            this.start = no;
            this.end = no;
        } else  {
            No no = new No(this.start, value);
            this.start.setPrev(no);
            this.start = no;
        }
        this.size++;
    }
    
    public void addEnd(T value) { 
        if(this.isEmpty()) this.addStart(value);
        else {
            No no = new No(value);
            this.end.setProx(no);
            no.setPrev(no);
            this.end = no;
            this.size++;
        }
    }
    
    public Boolean isEmpty() {
        return this.start == null;
    }

    public void print() { 
        System.out.println(this.toString());
    }
    
    public void removeInStart() { 
        if(this.isEmpty()) {
            System.out.println("List is empty");
        } else {
            this.start = this.start.getProx();
            if(this.start == null) {
                this.end = null;
            }
        }
    }
    
    public void removeInEnd() {
        if(this.isEmpty()) {
            System.out.println("List is empty");
        } 
        else if(this.size == 1) {
            this.removeInStart();
        }
        else {
            No no = this.end.getPrev();
            no.setProx(null);
            this.end = no;
            this.size--;
        }
    }
    
    public String toString() {
        if(this.isEmpty()){
            return "ListaLigada{}";
        }
        else {
            No<T> no = this.start;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Lista[ ");
            stringBuilder.append(no.getValue()!=null ? no.getValue().toString() : "<NULO>");
            stringBuilder.append(", ");
            while(no.getProx()!=null){
                stringBuilder.append(no.getProx().getValue()!=null ? no.getProx().getValue().toString() : "<NULO>");
                stringBuilder.append(", ");
                no=no.getProx();
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

    }
    
}
