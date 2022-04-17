/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;

/**
 *
 * @author Olafi
 */
public class No {
    private String value;
    private No nextNo;
    
    public No(String newValue) {
        this.value = newValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public No getNextNo() {
        return nextNo;
    }

    public void setNextNo(No nextNo) {
        this.nextNo = nextNo;
    }
    
    
}
