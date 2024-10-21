package graph;


public class DiGraphTest {

	public static void main(String[] args) {
		DiGraph gr = new DiGraph(6);
		gr.insertEdge(0, 1);
		gr.insertEdge(0, 2);
		gr.insertEdge(1, 2);
		gr.insertEdge(1, 3);
		gr.insertEdge(2, 3);
		gr.insertEdge(2, 4);
		gr.insertEdge(3, 4);
		gr.insertEdge(3, 5);
		gr.insertEdge(4, 5);
		gr.insertEdge(1, 5);
		
		System.out.println();
		int[] adj;
		for(int i = 0; i < 6; i++) {
			adj = gr.successor(i);
			System.out.print(i + ": ");
			for(int e: adj) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		
		gr.bfs(0);
		System.out.println();
		gr.dfs(0);
		System.out.println();
	}

}
