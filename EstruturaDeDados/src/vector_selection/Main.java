/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector_selection;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String args[]) {
        int[] numbers = {10,9,8,100,6,5,4,3,2,1,0,-1,-2,-3,-4,-5};
        
        // walking in each number 
        for (int i = 0; i <= numbers.length -1; i++) {
            // going through each number, taking into account the value of the variable "i".
            for (int j = i; j <= numbers.length -1; j++) {
                // saving the values for the exchanges
                int value_i = numbers[i];
                int value_j = numbers[j];
                //making the exchange
                if (numbers[i] > numbers[j]) {
                    numbers[i] = value_j;
                    numbers[j] = value_i;
                }
                
                for(int number : numbers) { 
                    System.out.print(number);
                }
                System.out.println("\n");

            }
        }
        
        System.exit(0);
    }
}
