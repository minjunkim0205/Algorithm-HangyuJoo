package wgraph;

class WDigraph { // Matrix
    /* Field */
    int n; // Number of vertices
    int e; // Number of edges
    int[][] weight;

    /* Construct */
    WDigraph(int noOfVertices) {
        this.n = noOfVertices;
        this.e = 0;
        this.weight = new int[this.n][this.n];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (i == j) {
                    this.weight[i][j] = 0;
                } else {
                    this.weight[i][j] = 9999; // 9999?
                }
            }
            System.err.println();
        }
    }

    WDigraph() {
        this.n = 0;
        this.e = 0;
    }

    /* Method */
    public void insertEdge(int tail, int head, int w) {
        if (this.weight[tail][head] == 9999) {
            this.e++;
            this.weight[tail][head] = w;
        }
    }

    public void removeEdge(int tail, int head) {
        if (this.weight[tail][head] != 9999 && this.weight[tail][head] != 0) {
            this.e--;
            this.weight[tail][head] = 9999;
        }
    }

    public int[] topologicalSort() {
        int[] indegree = new int[this.n];
        LinkedQueue zeroPredQ = new LinkedQueue();
        int sortedNo = 0;
        int[] sortedList = new int[this.n];

        // 이곳에 코드 작성
        for (int i = 0; i < this.n; i++) { // 1.진입 차수 계산
            for (int j = 0; j < this.n; j++) {
                if (i != j && this.weight[i][j] != 9999) {
                    indegree[j]++;
                }
            }
        }
        for (int i = 0; i < this.n; i++) { // 2.진입 차수가 0인 정점들을 큐에 추가
            if (indegree[i] == 0) {
                zeroPredQ.enqueue(i);
            }
        }
        while (!zeroPredQ.isEmpty()) { // 3.큐에서 정점들을 꺼내며 계산(bfs와 유사하지만 꼭 모든 정점을 탐색 하기 때문에 bfs는 아니다)
            int current = (int) zeroPredQ.dequeue(); // Object to Int
            sortedList[sortedNo] = current;
            sortedNo++;

            for (int j = 0; j < this.n; j++) {
                if (current != j && this.weight[current][j] != 9999) {
                    indegree[j]--;
                    if (indegree[j] == 0) {
                        zeroPredQ.enqueue(j);
                    }
                }
            }
        }
        return sortedList; // 4.결과 반환
    }

    public int[] EC(int[] sl) { // Earliest Completion Time
        int[] ec = new int[this.n];

        // 이곳에 코드 작성
        for (int i = 0; i < this.n; i++) { // 위상 정렬 결과에 따라 계산
            int current = sl[i]; // 현재 정점
            for (int j = 0; j < this.n; j++) {
                if (this.weight[current][j] != 9999) { // 간선이 존재할 경우
                    if (ec[j] < ec[current] + this.weight[current][j]) {
                        ec[j] = ec[current] + this.weight[current][j];
                    }
                }
            }
        }

        return ec;
    }

    public int[] LC(int[] sl, int ecEnd) { // Latest Completion Time
        int[] lc = new int[this.n];

        // 이곳에 코드 작성
        for (int i = 0; i < this.n; i++) { // 모든 정점을 가장 큰 값으로 초기화
            lc[i] = 9999;
        }
        lc[sl[this.n - 1]] = ecEnd; // 도착점 정점의 LC는 EC의 마지막 값으로 설정
        for (int i = this.n - 1; i >= 0; i--) { // 위상 정렬 순서를 반대로 따라가며 계산
            int current = sl[i]; // 현재 정점
            for (int j = 0; j < this.n; j++) {
                if (this.weight[current][j] != 9999) { // 간선이 존재할 경우
                    if (lc[current] > lc[j] - this.weight[current][j]) {
                        lc[current] = lc[j] - this.weight[current][j];
                    }
                }
            }
        }

        return lc;
    }

    public int[][] CR(int[] ec, int[] lc) { 
        int[][] cr = new int[this.n][this.n];
    
        // 모든 간선에 대해 확인
        for (int u = 0; u < this.n; u++) {
            for (int v = 0; v < this.n; v++) {
                if (this.weight[u][v] != 9999) { // 간선이 존재하는 경우
                    // 임계 경로 조건: EC[u] + weight[u][v] == LC[v]
                    if (ec[u] + this.weight[u][v] == lc[v]) {
                        cr[u][v] = 9999; // 간선 (u, v)는 임계 경로에 속함
                    } else {
                        cr[u][v] = 0; // 임계 경로에 속하지 않음
                    }
                } else {
                    cr[u][v] = 9999; // 간선이 없는 경우, 9999로 설정 (주어진 출력 형식에 맞게)
                }
            }
        }
    
        return cr; // 임계 경로를 포함한 행렬 반환
    }
    
    

    public int[][] cpm() {
        int[] sortedList = topologicalSort();
        int[] ec = EC(sortedList);
        System.out.println("EC is : ");
        for (int vtx : ec) {
            System.out.print(vtx + " ");
        }
        System.out.println();
        System.out.println("End.");

        int[] lc = LC(sortedList, ec[sortedList[n - 1]]);
        System.out.println("LC is : ");
        for (int vtx : lc) {
            System.out.print(vtx + " ");
        }
        System.out.println();
        System.out.println("End.");

        int[][] cr = CR(ec, lc);

        return cr;
    }
}