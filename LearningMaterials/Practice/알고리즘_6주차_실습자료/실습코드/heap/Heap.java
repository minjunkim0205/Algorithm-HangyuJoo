package heap;

public class Heap {
	private int count;
	private int size;
	private int[] itemArray;
	
	public Heap() {
		count = 0;
		size = 64;
		itemArray = new int[size];
	}
	
	public static Heap makeHeap(int[] origArray) {
		// origArray를 바탕으로 max heap 생성
	}
	
	public void insert(int newItem) {
		// newItem을 max heap에 맞게 추가
	}
	
	public void printHeap() {
		for(int i = 1; i <= count; i++) 
			System.out.print(itemArray[i] + " ");
		System.out.println();
	}
	
}

