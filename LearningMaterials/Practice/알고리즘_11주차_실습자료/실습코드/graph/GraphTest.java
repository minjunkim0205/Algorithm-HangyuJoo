package graph;

public class GraphTest {

	public static void main(String[] args) {
		Graph gr1 = new Graph(6);
		gr1.insertEdge(0, 1);
		gr1.insertEdge(0, 2);
		gr1.insertEdge(1, 2);
		gr1.insertEdge(1, 3);
		gr1.insertEdge(2, 1);
		gr1.insertEdge(2, 4);
		gr1.insertEdge(3, 4);
		gr1.insertEdge(3, 5);
		gr1.insertEdge(4, 5);
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++)
				if(gr1.arc[i][j])
					System.out.print("1 ");
				else
					System.out.print("0 ");
			System.out.println();
		}
		boolean[][] isPath = gr1.transitive();
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++)
				if(isPath[i][j])
					System.out.print("1 ");
				else
					System.out.print("0 ");
			System.out.println();
		}
	}

}
