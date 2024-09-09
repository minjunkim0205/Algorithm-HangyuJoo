package linked;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.insert("Moon", list1.searchNode("Kim"));
		list1.print();
		
		list1.delete( list1.searchNode("Kim"));
		list1.print();
	

	}
}
