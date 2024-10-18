package graph;

public class GraphTest {

	public static void main(String[] args) {
		// 실습 1번
		Graph gr = new Graph(6);
		gr.insertEdge(0, 1); // 노드0에 1로 향하는 간선 추가(노드,간선)
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
			adj = gr.adjacency(i);
			System.out.print(i + ": ");
			for(int e : adj) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		
		gr.bfs(1);
		System.out.println();
		gr.dfs(1);
		System.out.println();
		
		// 과제 1번
		gr = new Graph(9);
		gr.insertEdge(0, 1);
		gr.insertEdge(0, 2);
		gr.insertEdge(2, 6);
		gr.insertEdge(1, 7);
		gr.insertEdge(3, 4);
		gr.insertEdge(5, 8);
		
		gr.dfsComponent();

		// 과제 2번

		System.out.println("----------------------");

		GraphList grList = new GraphList(6);
		grList.insertEdge(1, 5);
		grList.insertEdge(4, 5);
		grList.insertEdge(3, 5);		
		grList.insertEdge(3, 4);		
		grList.insertEdge(2, 4);
		grList.insertEdge(2, 3);
		grList.insertEdge(1, 3);
		grList.insertEdge(1, 2);		
		grList.insertEdge(0, 2);
		grList.insertEdge(0, 1);		
		
		System.out.println();

		for(int i = 0; i < 6; i++) {
			adj = grList.adjacency(i);
			System.out.print(i + ": ");
			for(int e: adj) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		
		grList.bfs(1);
		System.out.println();
		grList.dfs(1);
		System.out.println();		
	}
}
