/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListQueue;

/**
 *
 * @author Olafi
 */
public class Main {
   public static void main(String[] args) {
       
       Queue<Integer> queue = new Queue<Integer>();
       
       queue.addEnd(0);
       queue.addEnd(1);
       queue.addEnd(2);
       queue.addEnd(3);
       queue.addEnd(4);
       queue.addEnd(5);
       queue.addEnd(6);
       queue.addEnd(7);
       
       queue.removeInStart();
       queue.removeInStart();
       queue.removeInStart();
       queue.removeInStart();
       
       queue.print();
   }
    
}

