package src;

public class BinaryTree {
    BTNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(BinaryTree ltree, String data, BinaryTree rtree) {
		root = new BTNode(ltree.root, data, rtree.root);
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public BinaryTree leftSubTree() {
		BinaryTree ltree = new BinaryTree();
		ltree.root = root.Lchild;
		return ltree;
	}

	public BinaryTree rightSubTree() {
		BinaryTree rtree = new BinaryTree();
		rtree.root = root.Rchild;
		return rtree;
	}

	public String rootData() {
		return root.data;
	}

	public void inorder() {
		System.out.println("[Inorder]");
		theInorder(root);
		System.out.println();
		
		// 아래 내용은 실습 과제입니다. (주석 해제 후 inorderIter 메소드에 코드 작성)
		System.out.println("[InorderIter]");
		inorderIter();
		System.out.println();
	}

	public void preorder() {
		System.out.println("[Preorder]");
		thePreorder(root);
		System.out.println();
		
		// 아래 내용은 실습 과제입니다. (주석 해제 후 preorderIter 메소드에 코드 작성)
		System.out.println("[PreorderIter]");
		preorderIter();
		System.out.println();
	}

	public void postorder() {
		System.out.println("[Postorder]");
		thePostorder(root);
		System.out.println();
	}

	private void theInorder(BTNode t) {
		if (t != null) {
			theInorder(t.Lchild); // 왼쪽 자식 방문
			System.out.print(t.data + " "); // 루트 출력
			theInorder(t.Rchild); // 오른쪽 자식 방문
		}
	}	

	private void thePreorder(BTNode t) {
		if (t != null) {
			System.out.print(t.data + " "); // 루트 출력
			thePreorder(t.Lchild); // 왼쪽 자식 방문
			thePreorder(t.Rchild); // 오른쪽 자식 방문
		}
	}
	
	private void thePostorder(BTNode t) {
		if (t != null) {
			thePostorder(t.Lchild); // 왼쪽 자식 방문
			thePostorder(t.Rchild); // 오른쪽 자식 방문
			System.out.print(t.data + " "); // 루트 출력
		}
	}
	
	private void inorderIter() {
		Stack s = new Stack();
		BTNode p = root;
	
		while (p != null || !s.empty()) {
			// 왼쪽 끝까지 스택에 추가
			while (p != null) {
				s.push(p);
				p = p.Lchild;
			}
			// 스택에서 꺼내 출력 후, 오른쪽 자식으로 이동
			p = (BTNode)s.pop();
			System.out.print(p.data + " ");
			p = p.Rchild;
		}
	}
	

	private void preorderIter() {
		Stack s = new Stack();
		BTNode p = root;
	
		if (p == null) return;
	
		s.push(p);
	
		while (!s.empty()) {
			p = (BTNode)s.pop();
			System.out.print(p.data + " ");
	
			// 오른쪽 자식 먼저 스택에 추가
			if (p.Rchild != null) {
				s.push(p.Rchild);
			}
			// 왼쪽 자식 스택에 추가
			if (p.Lchild != null) {
				s.push(p.Lchild);
			}
		}
	}
	

	public void levelorder() {
		BTNode p = root;
		Queue q = new Queue();
	
		if (p == null) return;
	
		q.enqueue(p);
		System.out.println("[Level order]");
	
		while (!q.isEmpty()) {
			p = (BTNode)q.dequeue();
			System.out.print(p.data + " ");
	
			if (p.Lchild != null) {
				q.enqueue(p.Lchild);
			}
			if (p.Rchild != null) {
				q.enqueue(p.Rchild);
			}
		}
		System.out.println();
	}
	

	public BinaryTree copy() {
		BinaryTree newTree = new BinaryTree();
		newTree.root = theCopy(root);
		return newTree;
	}

	private BTNode theCopy(BTNode t) {
		if (t == null) {
			return null;
		}
		// 새로운 노드를 생성하고 왼쪽과 오른쪽 자식을 복사하여 연결
		return new BTNode(theCopy(t.Lchild), t.data, theCopy(t.Rchild));
	}
	

	public boolean equals(BinaryTree tr) {
		return theEqual(this.root, tr.root);
	}

	private boolean theEqual(BTNode s, BTNode t) {
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null) {
			return false;
		}
		return s.data.equals(t.data) && theEqual(s.Lchild, t.Lchild) && theEqual(s.Rchild, t.Rchild);
	}
}
