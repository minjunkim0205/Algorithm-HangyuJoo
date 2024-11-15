package graph;

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
	
	// 워셜 알고리즘 사용
	public boolean[][] transitive() {
		boolean[][] distance = new boolean[n][n];
		
		// 초기 distance 행렬을 arc 행렬로 설정
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				distance[i][j] = arc[i][j];
			}
		}

		// 워셜 알고리즘 수행
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// 경유지 k를 통해 i에서 j로 가는 경로가 있으면 true로 설정
					if (distance[i][k] && distance[k][j]) {
						distance[i][j] = true;
					}
				}
			}
		}
		
		return distance;
	}
}
