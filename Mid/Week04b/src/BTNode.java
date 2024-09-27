package src;
public class BTNode {
	public String data;
	public BTNode Lchild;
	public BTNode Rchild;
	
	public BTNode() {
		
	}
	
	public BTNode(String dt) {
		data = dt;
		Lchild = null;
		Rchild = null;
	}
	public BTNode(BTNode lc, String dt, BTNode rc) {
		data = dt;
		Lchild = lc;
		Rchild = rc;
	}
	
}
