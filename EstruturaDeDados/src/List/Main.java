/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String agrs[]) { 
        Student[] students = { 
            new Student("Aluno 1", 21, 01),
            new Student("Aluno 2", 21, 02),
            new Student("Aluno 3", 21, 03),
            new Student("Aluno 4", 21, 04),
            new Student("Aluno 5", 21, 05),
        };
        
        List list = new List(10);
        
        list.insert(students[0]);
        list.insert(students[1]);
        list.insert(students[2]);
        list.insert(students[3]);
        list.insert(students[4]);
        
        list.remove("Aluno 4");
        list.print();
    }
}
