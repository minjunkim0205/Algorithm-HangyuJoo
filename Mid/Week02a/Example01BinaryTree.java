public class Example01BinaryTree {
    /*Field */
    int data;
    Example01BinaryTree node_left;
    Example01BinaryTree node_right;

    /*Construct */
    public Example01BinaryTree(int data) {
        // 자식이 없는 노드
        this.data = data;
        this.node_left = null;
        this.node_right = null;
    }
    public Example01BinaryTree(int data, Example01BinaryTree node_left, Example01BinaryTree node_right) {
        // 자식이 둘 다 있는 노드
        this.data = data;
        this.node_left = node_left;
        this.node_right = node_right;
    }

    /*Method */
    public Example01BinaryTree leftNode() {
        // 왼쪽 자식 노드 반환
        return node_left;
    }
    public Example01BinaryTree rightNode() {
        // 오른쪽 자식 노드 반환
        return node_right;
    }
}
