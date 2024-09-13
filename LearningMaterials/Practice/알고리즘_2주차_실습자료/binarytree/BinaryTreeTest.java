package binarytree.copy;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree btree;
		BinaryTree ltree;
		BinaryTree rtree;
		
		rtree = new BinaryTree("1");
		ltree = new BinaryTree("2");
		btree = new BinaryTree(ltree, "+", rtree);
		ltree = btree;
		rtree = new BinaryTree("3");
		btree = new BinaryTree(ltree, "-", rtree);
		
		btree.printTree();
		// System.out.println(" = " + btree.calculate());
		
	}

}
