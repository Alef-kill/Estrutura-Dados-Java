/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adjacency.matriz;

import java.util.ArrayList;

/**
 *
 * @author Olafi
 */
public class Main {
    public static void main(String[] agrs) {
        int vertex = 12;
		int[][] matrix = new int[vertex][vertex];
                
                ArrayList<Edge> edgeList = new ArrayList<Edge>();
                
		edgeList.add(new Edge(0,1));
		edgeList.add(new Edge(0,2));
		edgeList.add(new Edge(1,2));
		edgeList.add(new Edge(2,3));
		edgeList.add(new Edge(2,5));
		edgeList.add(new Edge(3,0));
		edgeList.add(new Edge(4,5));
		edgeList.add(new Edge(4,7));
		edgeList.add(new Edge(6,9));
		edgeList.add(new Edge(7,6));
		edgeList.add(new Edge(7,8));
		edgeList.add(new Edge(10,3));
		edgeList.add(new Edge(10,11));
		edgeList.add(new Edge(11,0));
                
		for(int i=0;i<edgeList.size();i++){
			Edge currentEdge = edgeList.get(i);
			int startVertex = currentEdge.startVertex;
			int endVertex = currentEdge.endVertex;
			matrix[startVertex][endVertex] = 1;
		}
                System.out.print("        0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\n");
		for(int i=0; i<= vertex -1; i++){
                    System.out.print(i +" \t");
                    for (int j = 0; j < vertex; j++) {
                        System.out.print(matrix[i][j]+"\t"); 
                    }
                    System.out.println();
                }

    }
}


class Edge{
	int startVertex;
	int endVertex;
	public Edge(int start,int end){
		this.startVertex = start;
		this.endVertex = end;

	}
}
