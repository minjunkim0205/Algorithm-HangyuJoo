package wgraph;

public class WGraph {
	int n;
	int e;
	int[][] weight;
	
	public WGraph(int nOfVertices) {
		n = nOfVertices;
		e = 0;
		weight = new int[n][n];
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j)
					weight[i][j] = 0;
				else
					weight[i][j] = 9999;
			}
		}
		
	}

	public void insertEdge(int i, int j, int w) {
		// 이곳에 코드 작성
	}
	
	public void removeEdge(int i, int j, int w) {
		// 이곳에 코드 작성
		// 제거된 edge는 9999의 값을 가짐
	}
	
	public Edge[] spanningTree() {
		Edge[] T = new Edge[n - 1];
		MinHeap edgeList = new MinHeap();
		UnionFind uf = new UnionFind(n);

		int Tptr = -1;

		// 이곳에 코드 작성

		return T;
	}
	
	public Edge[] prim(int i) {		
		Edge[] T = new Edge[n - 1];
		MinHeap edgeList = new MinHeap();
		UnionFind uf = new UnionFind(n);

		int Tptr = -1;

		// 이곳에 코드 작성

		return T;
	}
}

