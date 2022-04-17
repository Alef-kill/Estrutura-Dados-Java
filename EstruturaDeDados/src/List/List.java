/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author Olafi
 */
public class List {
    public int first = 0;
    public int last = 0;
    public int matricula;
    public Student[] listStudent;
    public int maximo;

    //******Método Construtor******
    public List(int maximo) {
        this.first = 0; 
        this.last = this.first;
        listStudent = new Student[maximo];
        this.maximo = maximo;
    }

    //*******Método para testar se a lista está vazia********
    public boolean vazia() {
        return (this.first == this.last);
    }

    //*********Método para adicionar um Student na lista*******
    public void insert(Student a1) {
        if (this.last >= this.listStudent.length) {
            System.out.println("Lista Cheia....Nao e permitido adicionar outro Student");
        } else {
            this.listStudent[this.last] = a1;
            this.last = this.last + 1;
            System.out.println("Student inserido com sucesso");
        }
    }
    
    //*********Criar Método para Remover um Student da lista com base no seu nome*****************
    public void remove(String name) {
        //Insira o codigo aqui
        
        for (int i = 0; i <  listStudent.length -1; i++) {
            if (listStudent[i].getName() == name) {
                for (int j = i; j < this.maximo -1 ; j++) {
                    this.listStudent[j] = this.listStudent[j+1];
                }
                this.maximo--;
                break;
            }   
        }
        
    }
    
    //*********Criar Método para recuperar os dados de  um Student em especifico da lista com base no seu nome*****************
    public int search(int registration) {
        //Substitua o tipo de retorno da função para Student
        //Insira o codigo aqui
        Boolean notFound = true;
        int position = 0;
        
        for (int i = 0; i < this.listStudent.length - 1; i++) {            
            if (listStudent[i].getRegistration() == registration) {
                notFound = false;
                position = i;
                break;
            }   
        }
        
        if (notFound) {
            throw new IllegalArgumentException("\nNão fois possível encontrar o valor: "+ registration);  
        } else {
            System.out.printf("Registration: %s; Name: %s; Age: %s \n", listStudent[position].getRegistration(), listStudent[position].getName(), listStudent[position].getAge());
            return position;
        }
        
    }

    @Override
    public String toString() {
        return "List{" + "listStudent=" + listStudent + '}';
    }
    
    //*********Criar Método para imprimir todos os dados de cada Student da lista*****************
    public Student[] print() {
        //Substitua o tipo de retorno da função para Student
        //Insira o codigo aqui
        for(Student student : listStudent) {
            if(student != null) {
                System.out.printf("Registration: %s; Name: %s; Age: %s \n", student.getRegistration(), student.getName(), student.getAge());
            }
        }
        return listStudent;
    }
}
