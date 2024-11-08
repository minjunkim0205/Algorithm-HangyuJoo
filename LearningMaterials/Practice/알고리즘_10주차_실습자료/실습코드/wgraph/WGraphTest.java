package wgraph;

public class WGraphTest {

	public static void main(String[] args) {
		WGraph gr = new WGraph(6);
		
		gr.insertEdge(0, 1, 5);
		gr.insertEdge(0, 2, 4);
		gr.insertEdge(1, 2, 2);
		gr.insertEdge(1, 3, 7);
		gr.insertEdge(2, 3, 6);
		gr.insertEdge(2, 4, 11);
		gr.insertEdge(3, 4, 3);
		gr.insertEdge(3, 5, 8);
		gr.insertEdge(4, 5, 8);
		
		Edge[] edgelist = gr.spanningTree();
		for(int i = 0; i < edgelist.length; i++)
			System.out.print("(" + edgelist[i].tail + " " + edgelist[i].head + ") ");
		
		/* 과제
		System.out.println("\nPrim");
		edgelist = gr.prim(0);
		for(int i = 0; i < edgelist.length; i++)
			System.out.print("(" + edgelist[i].tail + " " + edgelist[i].head + ") ");
		*/
		

	}

}
