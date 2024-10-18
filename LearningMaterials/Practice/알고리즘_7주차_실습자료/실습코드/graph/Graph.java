package graph;

public class Graph {
	int n; // Number of vertices
	int e; // Number of edges
	int[][] weight;

	public Graph(int noOfVertices) {
		n = noOfVertices;
		e = 0;
		weight = new int[n][n];
	}

	public void insertEdge(int i, int j) {

		// 이곳에 코드 작성

	}

	public void removeEdge(int i, int j) {
		
		// 이곳에 코드 작성

	}

	public int[] adjacency(int u) {
		int[] adj;
		
		// 이곳에 코드 작성

		return adj;
	}
	
	public void bfs(int v) {
		Queue q = new Queue();
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i < n; i++)
			visited[i] = false;
		
		System.out.println("BFS");
		
		// 이곳에 코드 작성
		
	}
	
	public void dfs(int v) {
		Stack s = new Stack();
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i < n; i++)
			visited[i] = false;
		
		System.out.println("DFS");

		// 이곳에 코드 작성
		
	}
	
	public void dfsComponent() {
		// 이곳에 코드 작성 (과제 1번)
	}
}
