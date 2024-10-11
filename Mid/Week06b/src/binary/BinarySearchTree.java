package binary;

public class BinarySearchTree {
    private TreeNode rootNode;

    public TreeNode BSTsearch(String K) {
        return searchRec(rootNode, K);
    }

    private TreeNode searchRec(TreeNode root, String K) {
        if (root == null || root.key.equals(K)) {
            return root;
        }

        if (K.compareTo(root.key) < 0) {
            return searchRec(root.Lchild, K);
        } else {
            return searchRec(root.Rchild, K);
        }
    }

    public void BSTinsert(String K) {
        rootNode = insertRec(rootNode, K);
    }

    private TreeNode insertRec(TreeNode root, String K) {
        if (root == null) {
            root = new TreeNode();
            root.key = K;
            return root;
        }

        if (K.compareTo(root.key) < 0) {
            root.Lchild = insertRec(root.Lchild, K);
        } else if (K.compareTo(root.key) > 0) {
            root.Rchild = insertRec(root.Rchild, K);
        }

        return root;
    }

    private TreeNode maxNode(TreeNode root) {
        TreeNode p = root;
        if (p.Rchild == null)
            return p;
        else
            return maxNode(p.Rchild);
    }

    private TreeNode delete(TreeNode root, String K) {
        if (root == null)
            return root;

        if (K.compareTo(root.key) < 0) {
            root.Lchild = delete(root.Lchild, K);
        } else if (K.compareTo(root.key) > 0) {
            root.Rchild = delete(root.Rchild, K);
        } else {
            if (root.Lchild == null && root.Rchild == null) {
                return null;
            }

            if (root.Lchild == null) {
                return root.Rchild;
            } else if (root.Rchild == null) {
                return root.Lchild;
            }

            TreeNode maxLeft = maxNode(root.Lchild);
            root.key = maxLeft.key;
            root.Lchild = delete(root.Lchild, maxLeft.key);
        }

        return root;
    }

    public void BSTdelete(String K) {
        rootNode = delete(rootNode, K);
    }

    private void printNode(TreeNode n) {
        if (n == null) return;
    
        System.out.print("(");
    
        printNode(n.Lchild);
        System.out.print(n.key);
        printNode(n.Rchild);
    
        System.out.print(")");
    }
    

    public void print() {
        printNode(rootNode);
        System.out.println();
    }

    public void BSTsplit(String K, BinarySearchTree Small, BinarySearchTree Large) {
        splitRec(rootNode, K, Small, Large);
    }

    private void splitRec(TreeNode root, String K, BinarySearchTree Small, BinarySearchTree Large) {
        if (root == null) {
            return;
        }
        if (K.compareTo(root.key) > 0) {
            // K보다 작은 값은 Small 트리에 삽입
            Small.BSTinsert(root.key);
            splitRec(root.Lchild, K, Small, Large); // 왼쪽
            splitRec(root.Rchild, K, Small, Large); // 오른쪽
        } else {
            // K보다 크거나 같은 값은 Large 트리에 삽입
            Large.BSTinsert(root.key);
            splitRec(root.Lchild, K, Small, Large); // 왼쪽
            splitRec(root.Rchild, K, Small, Large); // 오른쪽
        }
    }
}