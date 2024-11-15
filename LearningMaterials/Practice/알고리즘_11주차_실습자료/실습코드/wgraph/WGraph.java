package asd;

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
	
	public WGraph() {
		n = 0;
		e = 0;
	}
	
	public void insertEdge(int i, int j, int w) {
		if(weight[i][j] == 9999)
			e++;
		weight[i][j] = w;
	}
	
	public void removeEdge(int i, int j, int w) {
		if(weight[i][j] != 9999)
			e--;
		weight[i][j] = 9999;
	}
	
	public int[] shortestPath(int v) {
		boolean s[] = new boolean[n];
		int dist[] = new int[n];
		int u;
		// 이곳에 코드 작성
		return dist;
	}

	public int[] negativePath(int v) {
		int dist[] = new int[n];
		// 이곳에 코드 작성
		return dist;
	}
	
	public int[][] allShortestPath() {
		int[][] distance = weight;
		int[][] distanceP;
		int k, i, j;
		// 이곳에 코드 작성
		return distance;
	}
}
