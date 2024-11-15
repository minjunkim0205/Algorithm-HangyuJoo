package wgraph;

import graph.Graph;

public class WGraphTest {

	public static void main(String[] args) {
		WGraph gr = new WGraph(5);
		
		gr.insertEdge(0, 1, 2);
		gr.insertEdge(0, 2, 5);
		gr.insertEdge(0, 4, 3);
		gr.insertEdge(1, 3, 4);
		gr.insertEdge(1, 4, 10);
		gr.insertEdge(2, 3, 6);
		gr.insertEdge(2, 4, 2);
		gr.insertEdge(4, 2, 1);
		gr.insertEdge(4, 3, 2);
		
		int[] sp = gr.shortestPath(0);
		
		
		for(int i = 0; i < sp.length; i++)
			System.out.println("0 -> " + i + ": " + sp[i]);
		System.out.println();

		gr = new WGraph(6);
		
		gr.insertEdge(0, 1, 6);
		gr.insertEdge(0, 2, 5);
		gr.insertEdge(0, 3, 5);
		gr.insertEdge(1, 4, -1);
		gr.insertEdge(2, 1, -2);
		gr.insertEdge(2, 4, 1);
		gr.insertEdge(3, 2, -3);
		gr.insertEdge(3, 5, -1);
		gr.insertEdge(4, 5, 3);
		
		sp = gr.negativePath(0);
		for(int i = 0; i < sp.length; i++)
			System.out.println("0 -> " + i + ": " + sp[i]);
		System.out.println();
		
		gr = new WGraph(6);
		gr.insertEdge(0, 1, 5);
		gr.insertEdge(0, 2, 4);
		gr.insertEdge(1, 2, 2);
		gr.insertEdge(1, 3, 7);
		gr.insertEdge(2, 3, 6);
		gr.insertEdge(2, 4, 11);
		gr.insertEdge(3, 4, 3);
		gr.insertEdge(3, 5, 8);
		gr.insertEdge(4, 5, 8);
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(gr.weight[i][j] == 9999)
					System.out.print("- ");
				else
					System.out.print(gr.weight[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] shpath = gr.allShortestPath();
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(shpath[i][j] == 9999)
					System.out.print("- ");
				else
					System.out.print(shpath[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
