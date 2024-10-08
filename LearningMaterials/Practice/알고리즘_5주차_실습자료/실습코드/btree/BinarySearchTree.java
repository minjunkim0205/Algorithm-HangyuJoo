package btree;

public class BinarySearchTree {
private TreeNode rootNode;
    
    public TreeNode BSTsearch(String K) {
    	// 문자열 k에 해당하는 TreeNode를 찾아서 반환
    }

    public void BSTinsert(String K) {
        // BinarySearchTree에 새로운 TreeNode 추가
    }

    private TreeNode maxNode(TreeNode root) {
        TreeNode p = root;
        if (p.Rchild == null) return p;
        else return maxNode(p.Rchild);
    }

    private TreeNode delete(TreeNode root, String K) {
        // BinarySearchTree에서 문자열 k를 갖는 TreeNode를 삭제
    }

    public void BSTdelete(String K) {
        rootNode = delete(rootNode, K);
    }
  
    private void printNode(TreeNode n) {
        // BinarySearchTree 출력
    }
    
    public void print() {
        printNode(rootNode);
        System.out.println();
    }
}
