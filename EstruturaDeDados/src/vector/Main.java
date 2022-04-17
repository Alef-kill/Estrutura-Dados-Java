/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector;

import java.util.Scanner;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String args[]) {
        // instance classes to use methods
        Vector vector = new Vector(6);
        
        // assigning values to the vector
        vector.setVector(0, "A");
        vector.setVector(1, "B");
        vector.setVector(2, "C");
        vector.setVector(3, "D");
        vector.setVector(4, "E");
        vector.setVector(5, "F");
        
        // using scanner class to read data
        System.out.println("Qual valor deseja procurar?");
        Scanner scanner = new Scanner(System.in);
        
        String buscarPor = scanner.next();
        
        // search linear
        for (int i = 0; i < vector.getVector().length -1; i++) {
            if (vector.getVector()[i].equalsIgnoreCase(buscarPor)) 
                System.out.println("Encontrado: " + vector.getVector()[i] + " na Posição: " + i);
        }
    }
}
