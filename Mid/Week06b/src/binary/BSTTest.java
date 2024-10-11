package binary;

public class BSTTest {
	public static void main(String args[]) {

		BinarySearchTree t = new BinarySearchTree();
		t.BSTinsert("S");
		t.BSTinsert("J");
		t.BSTinsert("B");
		t.BSTinsert("D");
		t.BSTinsert("U");
		t.BSTinsert("M");
		t.BSTinsert("R");
		t.BSTinsert("Q");
		t.BSTinsert("A");
		t.BSTinsert("G");
		t.BSTinsert("E");
		
		t.print();

		BinarySearchTree Small = new BinarySearchTree();
		BinarySearchTree Large = new BinarySearchTree();

		t.BSTsplit("C", Small, Large);

		Small.print();
		Large.print();
	}
}
