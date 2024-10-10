public class BSTTest {
	public static void main(String args[]) {

		BinarySearchTree t = new BinarySearchTree();
		t.BSTinsert("S");
		t.BSTinsert("J");
		t.BSTinsert("B");
		t.BSTinsert("D");
		t.BSTinsert("U");
		t.BSTinsert("M");
		t.BSTinsert("R");
		t.BSTinsert("Q");
		t.BSTinsert("A");
		t.BSTinsert("G");
		t.BSTinsert("E");
		
		t.print();

		TreeNode n = t.BSTsearch("R");
		if (n == null) {
			System.out.println("[R]: Not Found");
		} else {
			System.out.println("[R]: Found");
		}
		
		// 하단은 실습 과제 (delete method)관련 테스트 코드입니다.  
		System.out.println("[Delete R]");
		t.BSTdelete("R");
		
		n = t.BSTsearch("R");
		if (n == null) {
			System.out.println("[R]: Not Found");
		} else {
			System.out.println("[R]: Found");
		}
		t.print();
	}
}
