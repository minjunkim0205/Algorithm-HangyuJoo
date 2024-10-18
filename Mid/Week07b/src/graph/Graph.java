package graph;

public class Graph {
	int n; // Number of vertices(정점)
	int e; // Number of edges(간선)
	int[][] weight; // [From][To] 로 생각하고 구현

	Graph(int noOfVertices) {
		this.n = noOfVertices;
		this.e = 0;
		this.weight = new int[n][n];
	}

	public void insertEdge(int i, int j) {
		
		this.weight[i][j] = 1; // 고정 가중치(간선의 가중치는 항상 1임)
		this.weight[j][i] = 1;
	}

	public void removeEdge(int i, int j) {
		this.weight[i][j] = 0;
		this.weight[j][i] = 0;
	}

	public int[] adjacency(int u) {
		int[] adj;
		int count = 0;
		for(int i = 0; i < this.n; i++){
			if(this.weight[u][i] == 1){
				count++;
			}
		}
		adj = new int[count];
		int index = 0;
		for(int i = 0; i < this.n; i++){
			if(this.weight[u][i] == 1){
				adj[index] = i;
				index++;
			}
		}
		return adj;
	}
	
	public void bfs(int v) {
		Queue q = new Queue();
		boolean visited[] = new boolean[n];
		
		System.out.println("BFS");
		// 시작 노드 설정
		q.enqueue(v);
		visited[v] = true;
		// 다 탐색할때 까지 반복문
		while (!q.isEmpty()) {
			// 현제 노드 출력
			int cur_node = (int)q.dequeue();
			System.out.print(cur_node + ", ");
			// 인접 노드 추가
			for(int i = 0; i < this.n; i++){
				if(this.weight[cur_node][i]==1 && visited[i] == false){
					q.enqueue(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public void dfs(int v) {
		Stack s = new Stack();
		boolean visited[] = new boolean[this.n];
		
		System.out.println("DFS");
		// 시작 노드 설정(방문 체크)
		s.push(v);
		visited[v] = true;
		// 다 탐색할때 까지 반복문
		while (!s.empty()) {
			// 현제 노드 출력
			int cur_node = (int)s.pop();
			System.out.print(cur_node + ", ");
			// 인접 노드 추가(방문 체크)
			for(int i = 0; i < this.n; i++){
				if(this.weight[cur_node][i]==1 && visited[i] == false){
					s.push(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public void dfsComponent() {
		Stack s = new Stack();
		boolean visited[] = new boolean[this.n];
		
		// 방문 안한 노드 검색
		for(int j = 0; j < this.n; j++){
			if(visited[j] == false){
				System.out.print("New Component : ");
				// 시작 노드 설정(방문 체크)
				s.push(j);
				visited[j] = true;
				// 다 탐색할때 까지 반복문
				while (!s.empty()) {
					// 현제 노드 출력
					int cur_node = (int)s.pop();
					System.out.print(cur_node + ", ");
					// 인접 노드 추가(방문 체크)
					for(int i = 0; i < this.n; i++){
						if(this.weight[cur_node][i]==1 && visited[i] == false){
							s.push(i);
							visited[i] = true;
						}
					}
				}
				System.out.print("\n");
			}
		}
	}
}
