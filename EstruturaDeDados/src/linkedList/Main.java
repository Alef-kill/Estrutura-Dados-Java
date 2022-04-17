/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String args[]) { 
        LinkedList linkedList = new LinkedList();
        linkedList.add("MG");
        linkedList.add("SP");
        linkedList.add("BA");
        System.out.println("Length: " +linkedList.getLength());
        System.out.println("First: " +linkedList.getFirst().getValue());
        System.out.println("Last: "+ linkedList.getLast().getValue());
        
        System.out.println("search 'no' for position: "+ linkedList.get(1).getValue());
        
    }
}
