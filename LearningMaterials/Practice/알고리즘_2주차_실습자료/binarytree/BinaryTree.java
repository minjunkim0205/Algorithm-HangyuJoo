package binarytree.copy;

public class BinaryTree {
	BTNode root;
	
	public BinaryTree() {
		root = null;
	}
	public BinaryTree(String data) {
		root = new BTNode(null, data, null);;
	}
	public BinaryTree(BinaryTree lTree, String data, BinaryTree rTree) {
		root = new BTNode(lTree.root, data, rTree.root);
	}
	
	public boolean isEmpty() {
		// 현재 Tree에 노드가 없다면 True 반환
	}
	
	public BinaryTree leftSubTree() {
		// 현재 Tree의 왼쪽 서브트리를 반환
	}
	
	public BinaryTree rightSubTree() {
		// 현재 Tree의 오른쪽 서브트리를 반환
	}
	
	public String rootData() {
		// root Node의 데이터를 반환
	}
	
	public void printTree() {
		printTree(root);
	}
	
	private void printTree(BTNode t) {
		// 중위 순회를 이용하여 이진트리에 입력된 수식을 출력	
	}
	
	public int calculate() {
		return theCalculate(root);
	}
	
	private int theCalculate(BTNode t) {
		// 재귀 알고리즘을 이용하여 이진 트리에 입력된 수식을 계산
	}
	

}
