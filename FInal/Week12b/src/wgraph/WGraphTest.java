package wgraph;

class WGraphTest {
    public static void main(String args[]) {
        WDigraph AOV = new WDigraph(7);

        AOV.insertEdge(0, 1, 4);
        AOV.insertEdge(0, 2, 2);
        AOV.insertEdge(0, 3, 3);
        AOV.insertEdge(1, 6, 5);
        AOV.insertEdge(1, 5, 3);
        AOV.insertEdge(2, 4, 1);
        AOV.insertEdge(4, 5, 2);
        AOV.insertEdge(3, 5, 4);
        AOV.insertEdge(5, 6, 5);

        int[] sortedList = AOV.topologicalSort();

        System.out.println("Topological Order is : ");
        for (int vtx : sortedList) {
            System.out.print(vtx + " ");
        }
        System.out.println();
        System.out.println("End.");

        int[][] cr = AOV.cpm();

        System.out.println("CR is : ");
        for (int i = 0; i < cr.length; i++) {
            for (int j = 0; j < cr.length; j++) {
                System.out.print(cr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("End.");
    }
}
