/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package products;

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
        
        // Instacia a lista
        List list = new List(10);
        
        list.insert(new Product("Teclado Mecânico Gamer Redragon Sani", 275.0, 0, "Informática"));
        list.insert(new Product("Fonte SuperFrame", 339.0, 0, "Informática"));;
        list.insert(new Product("Banana", 4.3, 2, "Fruta"));
        list.insert(new Product("Açai", 12.4, 3, "Fruta"));
        list.insert(new Product("Macarrão", 3.0, 4, "Alimento"));
        list.insert(new Product("Beterraba", 8.0, 5, "Verdura"));
        list.insert(new Product("Batatinha Frita", 34.0, 2, "Salgadinho"));
        list.insert(new Product("Chocolate", 33.3, 12, "Doce"));
        list.insert(new Product("Biscoito", 3.0, 12, "Doce"));
        list.insert(new Product("Suco", 0.55, 12, "Doce"));
        
        // Verifica se esta vazio
        list.isEmpty();
        
        // Remove pela posição
        list.remove(0);
        
        // Busca
        System.out.println(list.search("Chocolate"));
        
        //list
        list.print();
        
        // Limpa a lista
        list.clearList();
        
        System.exit(0);
    }
    
}
