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
        if (p.Rchild == null) return p;
        else return maxNode(p.Rchild);
    }

    private TreeNode delete(TreeNode root, String K) {
        if (root == null) return root;

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

        printNode(n.Lchild);
        System.out.print(n.key + " ");
        printNode(n.Rchild);
    }

    public void print() {
        printNode(rootNode);
        System.out.println();
    }
}