/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author Olafi
 */
public class Student {
    private String name;
    private int age;
    private int registration;
    
    //************Métodos**************
    public Student(String name, int age, int registration){
       this.name = name;
       this.age = age;   
       this.registration = registration;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }
    
    public String getName(){
         return(this.name);
    }
    
    public int getAge(){
         return(this.age);
    }
}
