public class Assignment01 {
    public static void main(String[] args) {
        Assignment01BinaryTree binary_tree;
        Assignment01BinaryTree left_tree;
        Assignment01BinaryTree right_tree;

        right_tree = new Assignment01BinaryTree("1");
        left_tree = new Assignment01BinaryTree("2");
        binary_tree = new Assignment01BinaryTree(left_tree, "+", right_tree);
        left_tree = binary_tree;
        right_tree = new Assignment01BinaryTree("3");
        binary_tree = new Assignment01BinaryTree(left_tree, "-", right_tree);

        binary_tree.printTree();
        System.out.print("= " + binary_tree.calculate());
    }
}
