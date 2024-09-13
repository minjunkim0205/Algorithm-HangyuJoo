public class Assignment01BinaryTree {
    /* Field */
    private Assignment01BinaryTreeNode root;

    /* Construct */
    Assignment01BinaryTree() {
        this.root = null;
    }

    Assignment01BinaryTree(String data) {
        this.root = new Assignment01BinaryTreeNode(data);
    }

    Assignment01BinaryTree(Assignment01BinaryTree left_tree, String data, Assignment01BinaryTree right_tree) {
        this.root = new Assignment01BinaryTreeNode(left_tree.root, data, right_tree.root);
    }

    /* Method */
    public boolean isEmpty() {
        return (this.root == null);
    }

    public Assignment01BinaryTree leftSubTree() {
        if (this.root != null && this.root.left_child != null) {
            return new Assignment01BinaryTree(this.root.left_child.data);
        }
        return null;
    }

    public Assignment01BinaryTree rightSubTree() {
        if (this.root != null && this.root.right_child != null) {
            return new Assignment01BinaryTree(this.root.right_child.data);
        }
        return null;
    }

    public String rootData() {
        return (this.root.data);
    }

    public void printTree() {
        this.printTree(root);
    }

    private void printTree(Assignment01BinaryTreeNode next) {
        if (next == null) {
            return;
        }
        printTree(next.left_child);
        System.out.print(next.data + " ");
        printTree(next.right_child);
    }

    public int calculate(){
        return (this.theCalculate(root));
    }

    private int theCalculate(Assignment01BinaryTreeNode next){
        if (next == null) {
            return 0;
        }
        int leftValue = theCalculate(next.left_child);
        int rightValue = theCalculate(next.right_child);
    
        switch (next.data) {
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                return leftValue / rightValue;
            default:
                return Integer.parseInt(next.data);
        }
    }
}
