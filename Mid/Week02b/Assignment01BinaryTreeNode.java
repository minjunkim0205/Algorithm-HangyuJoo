public class Assignment01BinaryTreeNode {
    /* Field */
    public Assignment01BinaryTreeNode left_child;
    public String data;
    public Assignment01BinaryTreeNode right_child;

    /* Construct */
    Assignment01BinaryTreeNode(String data) {
        this.left_child = null;
        this.data = data;
        this.right_child = null;
    }

    Assignment01BinaryTreeNode(Assignment01BinaryTreeNode left_child, String data, Assignment01BinaryTreeNode right_child) {
        this.left_child = left_child;
        this.data = data;
        this.right_child = right_child;
    }

    /* Method */
}
