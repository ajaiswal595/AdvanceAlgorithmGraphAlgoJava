package com.aagaj;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	List<Vertex> list = new ArrayList<Vertex>();
	String vertexName;
	
	public Vertex(String vertexName) {
		this.vertexName = vertexName;
	}

	public void addNeighbour(Vertex vertex) {
		this.list.add(vertex);
	}
	
	public void showNeighbour() {
		System.out.print(this.vertexName+"->");
		for(Vertex ver:this.list) {
			System.out.print(ver.vertexName+" ");
		}
		System.out.println();
	}

}
