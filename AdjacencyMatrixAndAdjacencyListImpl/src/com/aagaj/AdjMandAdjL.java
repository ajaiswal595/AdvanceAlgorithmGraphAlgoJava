package com.aagaj;

public class AdjMandAdjL {

	public static void main(String[] args) {
		
		int adjacencyMatrix [][]= {
				{0,3,6},
				{7,0,9},
				{1,2,0}
				};
		
		for(int i=0;i<adjacencyMatrix[0].length;i++) {
			for (int j=0;j<adjacencyMatrix.length;j++) {
				System.out.print(adjacencyMatrix[i][j]);
			}
			System.out.println();
		}
		
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		
		A.addNeighbour(B);
		B.addNeighbour(C);
		C.addNeighbour(D);
		B.addNeighbour(D);
		
		A.showNeighbour();
		B.showNeighbour();
		C.showNeighbour();
		D.showNeighbour();
		
		
		
	}

}
