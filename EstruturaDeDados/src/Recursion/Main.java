/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String[] agrs) {
        int[] vet =  { 0,1,2,3,4,5,6,7,9,10 };
        
        System.out.println("Vetor não invertido");
        print(vet, vet.length);
        System.out.println("\n\nVetor invertido");
        inverseOrder(vet, 0, vet.length -1);
        print(vet, vet.length);
        
        System.out.println("\n");
        
        System.out.println("Digite um número: ");
        int mult = recursiveMultiplication(3, 2);
        System.out.println("A soma dos algarismos é: " + mult);
        
        System.exit(0);
        
    }
    
    public static void print(int[] v, int tam) {
        if(tam == 1) {
            System.out.printf("%s ", v[tam -1]);
        } else {
            print(v, tam - 1);
            System.out.printf("%s ", v[tam -1]);
        }
    }
    
    public static void inverseOrder(int v[], int firstPositionVector, int endPositionVector) {
        
        int aux = 0; // Guarda o valor para realizar a troca de posição
        
        // Caso base: 
        // Eu paro quando a posicão inicial do meu vetor é menor que o que minha posição final 
        if(firstPositionVector < endPositionVector) { 
            
            aux = v[firstPositionVector]; // Quarda o valor para fazer a troca
            v[firstPositionVector] = v[endPositionVector];  // Momento da troca do primeiro elemento
            v[endPositionVector] = aux; // Momento da troca do segundo elemento
            
            // Chamo novamente minha fução recursiva
            // firstPositionVector + 1 -> Após realizar a troca, a posição inicial deve ser incrementada
            // endPositionVector - 1 ->  Após realizar a troca, a posição final deve ser decrementada
            inverseOrder(v, firstPositionVector + 1, endPositionVector - 1);
        }
    }
    
    public static int recursiveMultiplication(int a, int b){
        // Se a variavel b igual a 1 então eu retorno pois essa é meu ponto base;
        // 3 x 2 
        // 3 x 1  1 é a base
         if( b == 1)
            return a;
         
         // é somado o ultilmo valor com o retorno atual
         return a + recursiveMultiplication(a, --b); 
    }
}
