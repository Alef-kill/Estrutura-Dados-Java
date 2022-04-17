/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String[] agrs){
        
        List<Friends> friendsList = Arrays.asList(
                new Friends("Friend 1", 1),
                new Friends("Friend 2", 2),
                new Friends("Friend 3", 3),
                new Friends("Friend 4", 4),
                new Friends("Friend 5", 5),
                new Friends("Friend 6", 6),
                new Friends("Friend 7", 7)
        );
        
        Graph<Friends> graph = new Graph();
        
        graph.addNode(friendsList.get(0));
        graph.addNode(friendsList.get(1));
        graph.addNode(friendsList.get(2));
        graph.addNode(friendsList.get(3));
        graph.addNode(friendsList.get(4));
        graph.addNode(friendsList.get(5));
        graph.addNode(friendsList.get(6));
        
        graph.addEdges(0, graph.nodesList.get(0), graph.nodesList.get(1));
        graph.addEdges(0, graph.nodesList.get(0), graph.nodesList.get(2));
        graph.addEdges(0, graph.nodesList.get(1), graph.nodesList.get(3));
        graph.addEdges(0, graph.nodesList.get(1), graph.nodesList.get(4));
        graph.addEdges(0, graph.nodesList.get(2), graph.nodesList.get(5));
        graph.addEdges(0, graph.nodesList.get(2), graph.nodesList.get(6));
        
    }
}

