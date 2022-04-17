/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students;

import java.util.ArrayList;

/**
 *
 * @author Olafi
 */
public class List {
    public int first = 0;
    public int last = 0;
    public Student[] list;
    public int maximo;
    
    public List(int maximo) {
        this.first = 0; 
        this.last = this.first;
        this.maximo = maximo;
        list = new Student[this.maximo];
    }
    
    public void FVLEmpty() {
       list =  new Student[this.maximo];
    }
    
    public Boolean isEmpty() {
        Boolean hasValue = true;
        
        for(var item : list) {
            if(item != null) { 
                hasValue = false;
            }
        }
        return hasValue;
    }
    
    public void insert(Student object) {
        if (this.last >= this.list.length) {
            System.out.println("Full list");
        } else {
            this.list[this.last] = object;
            this.last = this.last + 1;
            System.out.println("added in list "+ object);
        }
    }
    
    public void remove(int position) {
        for (int j = position; j < this.maximo -1 ; j++) {
            this.list[j] = this.list[j+1];
        }
    }
    
    public Student search(int enroll) {
        Boolean hasStudent = false;
        for(var item : list) {
            if((item != null) && item.enroll == enroll) { 
                hasStudent = true;
                return item;
            }
        }
        if(!hasStudent) System.out.println("Not found");
        return null;
    }
    
    public Student[] print() {
        for(var item : list) {
            if(item != null) System.out.println(item);
        }
        return list;
    }
    
    public Student[] filterSelectionSort() {
        for (int i = 0; i <= list.length -1; i++) {
            for (int j = i; j <= list.length -1; j++) {
                var value_i  = list[i];
                var value_j = list[j];
                
                if ((list[i] != null && list[j] != null) && list[i].enroll > list[j].enroll) {
                    list[i] = value_j;
                    list[j] = value_i;
                }
            }
        }  
        return this.print();
    }
    
    public Student[] filterSelectionSortName() {
        for (int i = 0; i <= list.length -1; i++) {
            for (int j = i; j <= list.length -1; j++) {
                var value_i  = list[i];
                var value_j = list[j];
                
                if((list[i] != null && list[j] != null)) {
                    if (list[i].name.compareTo(list[j].name) > 0) {
                        list[i] = value_j;
                        list[j] = value_i;
                    }
                }
            }
        }  
        return this.print();
    }
    
    public Student[] filterInsertionSort() {
        Student x; 
        int j;
        
        for(int i  = 1; i< list.length; i++) {
                x = list[i];
                j = i - 1;
                while((j >= 0) && list[j].enroll > x.enroll) {
                    list[j + 1] = list[j];
                    j = j - 1;
                }
                list[j+1] = x;

        }
        
        return this.print();
    }
    
    public int getAvarege(int avarege) {
        int media = 0;
        
        for (int i = 0; i < avarege; i++) {
            if(list[i] != null) {
                media += list[i].age;
            }
        }
        return media / (avarege);
    }
    
}
