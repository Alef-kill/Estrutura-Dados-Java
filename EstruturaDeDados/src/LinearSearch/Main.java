/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinearSearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String args[]) {
        int[] vetors = new int[100];
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean notFound = true;
        
        for (int i = 0; i <= vetors.length -1; i++) {;
            vetors[i] = new Random().nextInt(100);
        }
        
        System.out.println("Qual valor deseja encontrar? ");
        value = scanner.nextInt();
        
        for (int vetor : vetors) {
            System.out.printf("%s ",vetor);
            
            if (new Main().hasValue(vetor, value)) {
                System.out.printf("\n%s \n",vetor);
                notFound = false;
                break;
            }
        }
        
        if (notFound) {
            System.out.printf("\nNão fois possível encontrar o valor: %s ", value);
        }
        
        System.exit(0);
    }
    
    public boolean hasValue(Object value_1, Object value_2) {
        if (value_1 == value_2) {
            return true;
        }
        return false;
    }
}
