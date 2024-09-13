public class Example01 {
    public static void main(String[] args) {
        Example01BinaryTree binary_tree;
        Example01BinaryTree left_tree;
        Example01BinaryTree right_tree;

        right_tree = new Example01BinaryTree("1");
        left_tree = new Example01BinaryTree("2");
        binary_tree = new Example01BinaryTree(left_tree, "+", right_tree);
        left_tree = binary_tree;
        right_tree = new Example01BinaryTree("3");
        binary_tree = new Example01BinaryTree(left_tree, "-", right_tree);

        binary_tree.printTree();
    }
}
