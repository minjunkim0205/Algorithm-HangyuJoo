package testHeap;

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
		// 6주차 과제 참고
	}
	
	public void insert(int newItem) {
		// 6주차 과제 참고
	}
	
	public void printHeap() {
		for(int i = 1, p = 0; i <= count; i++) 
			System.out.print(itemArray[i] + " ");
		System.out.println();
	}
	
	
	public int delete() {
		if(count == 0) {
			return -100;
		} else {
			// 이곳에 코드 추가
		}
	}
	
	
}
