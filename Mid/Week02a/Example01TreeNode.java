public class Example01TreeNode {
    /*Field */
    protected Object data;
    protected Example01TreeNode left;
    protected Example01TreeNode right;

    /*Construct */
    public Example01TreeNode(Object data){
        // 자식이 없는 노드
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public Example01TreeNode(Object data, Example01TreeNode left, Example01TreeNode right){
        // 자식이 있는 노드
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /*Method */
    public Object data(){
        return (this.data);
    }
    public Example01TreeNode left(){
        // 왼쪽 자식 반환
        return (this.left);
    }
    public Example01TreeNode right(){
        // 오른쪽 자식 반환
        return (this.right);
    }
}
