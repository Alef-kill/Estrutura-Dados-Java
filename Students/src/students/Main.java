/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package students;

import java.util.Random;

/**
 *
 * @author Olafi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalList = 20;
        Random random = new Random();
        List list = new List(totalList);
        
        // Adiciona estudantes a lista
        System.out.println("\n ------ Adicionando os estudantes ----- \n");
        list.insert(new Student(random.nextInt(3000) , "Thais", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Barbara", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Alef", random.nextInt(80), "address"+ random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Matheus", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Caique", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Esquiniel", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Gumteber", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Daniel", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Liana", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Maria", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Isaque", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Zenilda", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Davi", random.nextInt(80), "address"+ random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Betoween", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Julia", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Izac Newton", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Marlon", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Aeuleus", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Marciel", random.nextInt(80), "address "+random.nextInt(34)));
        list.insert(new Student(random.nextInt(3000) , "Gabriel", random.nextInt(80), "address "+random.nextInt(34)));
        
        System.out.println("\n ------ Mostrando estudantes ordenados ----- \n");
        // Ordena e imprime os estudantes
        System.out.println("\n ------ Seleção ----- \n");
        list.filterSelectionSort(); // Selecão
        System.out.println("\n ------ Inserção ----- \n");
        list.filterInsertionSort(); // Inserção
        System.out.println("\n ------ Inserção nome ----- \n");
        list.filterSelectionSortName(); // Inserção
        
        // Mostrar a media de idade dos primeiros 3 alunos
        System.out.println("\n ------ Media de Idade ----- \n");
        System.out.println(list.getAvarege(3));
        
        System.out.println("\n ------ buscando o estudante com a matricula 20 ----- \n");
        // busca o estudante
        list.search(20);
        
        System.out.println("\n ------ Limpando a lista ----- \n");
        // limpa a lista;
        list.FVLEmpty();
        
        System.out.println("\n ------ Verificando se a lista esta vazia  ----- \n");
        // Verifica se a lista esta vazia
        System.out.println(list.isEmpty());
    }
    
}
