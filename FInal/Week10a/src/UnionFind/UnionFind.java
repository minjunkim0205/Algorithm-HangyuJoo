package UnionFind;

class UnionFind {
    /* Field */
    int[] parent;

    /* Construct */
    UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    /* Method */
    private int root(int i) { // 인자 노드의 부모(root)를 찾는다, 만약 root가 자기 자신이라면 아무것도 연결되지 않은 노드
        while (i != parent[i]) {
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }

    public void union(int p, int q) { // 합집합
        int i = root(p);
        int j = root(q);
        parent[i] = j;
    }

    public boolean find(int p, int q) { // 같은 집합에 속하는가 체크
        return root(p) == root(q);
    }
}