import src.BinaryTree;

public class Assignment01 {
    public static void main(String[] args) {
        BinaryTree binary_tree;
        BinaryTree left_tree;
        BinaryTree right_tree;

        right_tree = new BinaryTree("1");
        left_tree = new BinaryTree("2");
        binary_tree = new BinaryTree(left_tree, "+", right_tree);
        left_tree = binary_tree;
        right_tree = new BinaryTree("3");
        binary_tree = new BinaryTree(left_tree, "-", right_tree);

        binary_tree.printTree();
        System.out.print("= " + binary_tree.calculate());
    }
}
