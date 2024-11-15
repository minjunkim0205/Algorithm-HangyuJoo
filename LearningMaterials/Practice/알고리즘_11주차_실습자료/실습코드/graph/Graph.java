package asd;

public class Graph {

	int n;
	boolean[][] arc;
	
	public Graph(int n) {
		this.n = n;
		arc = new boolean[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0 ; j < n; j++)
				arc[i][j] = false;
	}
	
	public Graph(int n, boolean[][] wArc) {
		this.n = n;
		arc = wArc;
	}
	
	public void insertEdge(int i, int j) {
		arc[i][j] = true;
	}
	
	public boolean[][] transitive() {
		boolean[][] distance = arc;
		boolean[][] distanceP;
		int k, i, j;
		

		// 이곳에 코드 작성
		
		
		return distance;
	}
}
