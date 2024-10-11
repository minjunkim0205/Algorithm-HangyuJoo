package heap;

public class TestHeap {

	public static void main(String[] args) {
		Heap h = new Heap();
		h.insert(30);
		h.insert(40);
		h.insert(20);
		h.insert(35);
		h.insert(50);
		h.insert(25);
		h.insert(10);
		h.printHeap();
		
		int[] origArray = {0, 50, 55, 60, 30, 70, 90, 25, 80, 40, 45};
		h = Heap.makeHeap(origArray);
		h.printHeap();
	}
	/*
	 *              90
	 *       80            60
	 *   55      70     50   25
	 * 30  40  45
	 */
}
