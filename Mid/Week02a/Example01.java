public class Example01 {
    /*Function */
    public static void printTree(Example01TreeNode node, int level) {
        // 트리 출력 함수
        if (node == null) {
            return;
        }
        printTree(node.right, level + 1);
        System.out.println(" ".repeat(level * 4) + node.data);
        printTree(node.left, level + 1);
    }
    /*Main */
    public static void main(String[] args) {
        // 부모 노드 생성
        Example01TreeNode node = new Example01TreeNode("A");
        // 트리 구성 (레벨 4 완전 이진 트리)
        node.left = new Example01TreeNode("B");
        node.right = new Example01TreeNode("C");
        
        node.left.left = new Example01TreeNode("D");
        node.left.right = new Example01TreeNode("E");

        node.right.left = new Example01TreeNode("F");
        node.right.right = new Example01TreeNode("G");

        node.left.left.left = new Example01TreeNode("H");
        node.left.left.right = new Example01TreeNode("I");

        node.left.right.left = new Example01TreeNode("J");
        node.left.right.right = new Example01TreeNode("K");

        node.right.left.left = new Example01TreeNode("L");
        node.right.left.right = new Example01TreeNode("M");

        node.right.right.left = new Example01TreeNode("N");
        node.right.right.right = new Example01TreeNode("O");
        // 트리의 루트 노드 출력
        printTree(node, 0);
    }
}