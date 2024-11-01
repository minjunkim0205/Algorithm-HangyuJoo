package heap;

public class TestHeap {

	public static void main(String[] args) {
		Heap h = new Heap();
		int[] origArray = {0, 50, 55, 60, 30, 70, 90, 25, 80, 40, 45};
		h = Heap.makeHeap(origArray);
		h.printHeap();

		h.delete();
		h.delete();
		h.delete();
		
		h.printHeap();
	}
	/*
	 *       90
	 *      /  \
	 *     80   70
	 *    / \   / \
	 *   60 30 50 40
	 *  / \
	 * 55 45
	 */
}
