public class Example01BinaryTreeNode {
    /* Field */
    public Example01BinaryTreeNode left_child;
    public String data;
    public Example01BinaryTreeNode right_child;

    /* Construct */
    Example01BinaryTreeNode(String data) {
        this.left_child = null;
        this.data = data;
        this.right_child = null;
    }

    Example01BinaryTreeNode(Example01BinaryTreeNode left_child, String data, Example01BinaryTreeNode right_child) {
        this.left_child = left_child;
        this.data = data;
        this.right_child = right_child;
    }

    /* Method */
}
