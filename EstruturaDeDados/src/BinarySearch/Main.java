/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

import java.util.Scanner;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String args[]) {
        int vetor[] = new int[10];
        Scanner scanner = new Scanner(System.in);
                
        for (int i = 0; i < 10; i++) {
            vetor[i] = i * 2;
            System.out.print(vetor[i] + " ");
        }
        
        int start = 0;
        int middle =  vetor.length / 2;
        int end = (int) vetor.length;
        
        System.out.printf("\nstart: %s \nmiddle: %s \nend: %s\n", start, middle, end);
        
        System.out.println("Qual valor deseja encontrar? ");

        int searchValue = scanner.nextInt(); 
        
        do {
           middle = (start + end) / 2;
            
            if(vetor[middle] == searchValue) { 
                System.out.println("O valor foi encontrado na posição: "+ middle);
                break;
            }
            
            if (vetor[middle] < searchValue) { 
                start = middle + 1;
            } else { 
                end = middle;
            }
            
        } while(start <= end);
        
        System.exit(0);
    }
}
