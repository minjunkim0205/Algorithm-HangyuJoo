public class Example01BinaryTree {
    /* Field */
    private Example01BinaryTreeNode root;

    /* Construct */
    Example01BinaryTree() {
        this.root = null;
    }

    Example01BinaryTree(String data) {
        this.root = new Example01BinaryTreeNode(data);
    }

    Example01BinaryTree(Example01BinaryTree left_tree, String data, Example01BinaryTree right_tree) {
        this.root = new Example01BinaryTreeNode(left_tree.root, data, right_tree.root);
    }

    /* Method */
    public boolean isEmpty() {
        return (this.root == null);
    }

    public Example01BinaryTree leftSubTree() {
        if (this.root != null && this.root.left_child != null) {
            return new Example01BinaryTree(this.root.left_child.data);
        }
        return null;
    }

    public Example01BinaryTree rightSubTree() {
        if (this.root != null && this.root.right_child != null) {
            return new Example01BinaryTree(this.root.right_child.data);
        }
        return null;
    }

    public String rootData() {
        return (this.root.data);
    }

    public void printTree() {
        printTree(root);
    }

    private void printTree(Example01BinaryTreeNode next) {
        if (next == null) {
            return;
        }
        printTree(next.left_child);
        System.out.print(next.data + " ");
        printTree(next.right_child);
    }
}
