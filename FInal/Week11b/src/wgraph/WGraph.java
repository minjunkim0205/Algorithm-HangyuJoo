package wgraph;

import java.util.Arrays;

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
	
	public void removeEdge(int i, int j) {
		if(weight[i][j] != 9999)
			e--;
		weight[i][j] = 9999;
	}
	
	// 다익스트라 알고리즘
	public int[] shortestPath(int v) {
		boolean[] s = new boolean[n];
		int[] dist = new int[n];
		Arrays.fill(dist, 9999);
		dist[v] = 0;

		for (int count = 0; count < n - 1; count++) {
			int u = -1;
			int minDist = 9999;
			for (int i = 0; i < n; i++) {
				if (!s[i] && dist[i] < minDist) {
					u = i;
					minDist = dist[i];
				}
			}
			if (u == -1) break;
			s[u] = true;

			for (int i = 0; i < n; i++) {
				if (!s[i] && weight[u][i] != 9999 && dist[u] + weight[u][i] < dist[i]) {
					dist[i] = dist[u] + weight[u][i];
				}
			}
		}
		return dist;
	}

	// 벨만-포드 알고리즘
	public int[] negativePath(int v) {
		int[] dist = new int[n];
		Arrays.fill(dist, 9999);
		dist[v] = 0;

		for (int k = 0; k < n - 1; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (weight[i][j] != 9999 && dist[i] + weight[i][j] < dist[j]) {
						dist[j] = dist[i] + weight[i][j];
					}
				}
			}
		}
		return dist;
	}

	// 플로이드-워셜 알고리즘
	public int[][] allShortestPath() {
		int[][] distance = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.arraycopy(weight[i], 0, distance[i], 0, n);
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (distance[i][k] != 9999 && distance[k][j] != 9999 && distance[i][k] + distance[k][j] < distance[i][j]) {
						distance[i][j] = distance[i][k] + distance[k][j];
					}
				}
			}
		}

		return distance;
	}
}
