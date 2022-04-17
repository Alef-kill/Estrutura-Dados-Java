/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

import java.lang.reflect.Field;


/**
 *
 * @author Olafi
 */
public class List {
    public int first = 0;
    public int last = 0;
    public Product[] list;
    public int maximo;
    
    public List(int maximo) {
        this.first = 0; 
        this.last = this.first;
        this.maximo = maximo;
        list = new Product[this.maximo];
    }
    
    public boolean isEmpty() { 
        return (this.first == this.last);
    }
    
    public void insert(Product object) {
        if (this.last >= this.list.length) {
            System.out.println("The cart is full");
        } else {
            this.list[this.last] = object;
            this.last = this.last + 1;
            System.out.println("added to cart");
        }
    }
    
    public void remove(int position) {
        for (int j = position; j < this.maximo -1 ; j++) {
            this.list[j] = this.list[j+1];
        }
    }
    
    public String search(String name) { 
        for (int i = 0; i < this.list.length; i++){
            try{
                if(this.list[i].getName().equals(name)){
                    return "ENCONTRADO -> "+list[i].toString();
                }
            }catch(Exception e){
            }
        }
        return "Produto não encontrado";
    }
    
    public void clearList() { 
        list = new Product[this.maximo];
    }
    
    public Product[] print() {
        for(var item : list) {
            if(item != null) System.out.println(item);
        }
        return list;
    }
}
