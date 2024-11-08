package wgraph;

public class WGraph {
    int n;  // 정점의 개수
    int e;  // 간선의 개수
    int[][] weight;  // 가중치 인접 행렬

    public WGraph(int nOfVertices) {
        n = nOfVertices;
        e = 0;
        weight = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    weight[i][j] = 0;
                else
                    weight[i][j] = 9999;  // 간선이 없음을 표시
            }
        }
    }

    // 간선 추가
    public void insertEdge(int i, int j, int w) {
        if (i >= 0 && i < n && j >= 0 && j < n) {
            weight[i][j] = w;
            weight[j][i] = w;  // 무방향 그래프
            e++;
        }
    }

    // 간선 제거
    public void removeEdge(int i, int j) {
        if (i >= 0 && i < n && j >= 0 && j < n) {
            weight[i][j] = 9999;
            weight[j][i] = 9999;
            e--;
        }
    }

    // 크루스칼 알고리즘을 이용한 최소 신장 트리 생성
    public Edge[] spanningTree() {
        Edge[] T = new Edge[n - 1];
        MinHeap edgeList = new MinHeap();
        UnionFind uf = new UnionFind(n);

        // 모든 간선을 힙에 추가
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (weight[i][j] != 9999) {
                    edgeList.insert(new Edge(i, j, weight[i][j]));
                }
            }
        }

        int Tptr = 0;
        while (Tptr < n - 1 && edgeList.numberElements() > 0) {
            Edge edge = (Edge) edgeList.delete();
            int u = edge.head;
            int v = edge.tail;

            // 사이클이 없는 경우에만 트리에 추가
            if (!uf.find(u, v)) {
                uf.union(u, v);
                T[Tptr++] = edge;
            }
        }

        return T;
    }

    // 프림 알고리즘을 이용한 최소 신장 트리 생성
    public Edge[] prim(int start) {
        Edge[] T = new Edge[n - 1];
        boolean[] visited = new boolean[n];
        MinHeap edgeList = new MinHeap();
        visited[start] = true;

        // 시작 정점에 연결된 간선을 힙에 추가
        for (int i = 0; i < n; i++) {
            if (weight[start][i] != 9999) {
                edgeList.insert(new Edge(start, i, weight[start][i]));
            }
        }

        int Tptr = 0;
        while (Tptr < n - 1 && edgeList.numberElements() > 0) {
            Edge edge = (Edge) edgeList.delete();
            // int u = edge.head;
            int v = edge.tail;

            // 방문하지 않은 노드만 연결
            if (!visited[v]) {
                T[Tptr++] = edge;
                visited[v] = true;

                // 새로운 노드 v에 연결된 간선들을 힙에 추가
                for (int i = 0; i < n; i++) {
                    if (!visited[i] && weight[v][i] != 9999) {
                        edgeList.insert(new Edge(v, i, weight[v][i]));
                    }
                }
            }
        }

        return T;
    }
}
