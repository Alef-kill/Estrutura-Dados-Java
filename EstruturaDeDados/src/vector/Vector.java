/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector;

/**
 *
 * @author Olafi
 */
public class Vector {
   // create vector of string in java
   String[] vector = new String[0]; // this need add a length
   
   public Vector(int lengthVector) {
       this.vector = new String[lengthVector];
   }

    public String[] getVector() {
        return vector;
    }

    public void setVector(int index, String vector) {
        this.vector[index] = vector;
    }
   
   
   
}
