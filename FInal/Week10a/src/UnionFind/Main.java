package UnionFind;

public class Main {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(6); // 0, 1, 2, 3, 4, 5 (독립적인 요소들)

        uf.union(1, 2); // 0, (1, 2), 3, 4, 5 
        uf.union(1, 3); // 0, (1, 2, 3), 4, 5

        System.out.println(uf.find(1, 3));
        System.out.println(uf.find(2, 3));
    }
}
