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
        Heap h = new Heap();
        h.count = origArray.length - 1;
        h.itemArray = new int[origArray.length];
        
        System.arraycopy(origArray, 0, h.itemArray, 0, origArray.length);
        for (int i = (h.count / 2); i >= 1; i--) {
            h.downHeap(i);
        }
        return h;
    }
    
    public void insert(int newItem) {
        if (count == size - 1) {
            size*= 2; // 배열이 가득 찼을 때 배열을 두 배로 늘림
            int[] newArray = new int[size];
            System.arraycopy(itemArray, 0, newArray, 0, count + 1);
            itemArray = newArray;
        }
        itemArray[++count] = newItem;
        upHeap(count);
    }
    
    public void printHeap() {
        for (int i = 1; i <= count; i++) {
            System.out.print(itemArray[i] + " ");
        }
        System.out.print("\n");
    }
    
	private void upHeap(int i) {
        int temp = itemArray[i];
        while (i > 1 && temp > itemArray[i / 2]) { 
            itemArray[i] = itemArray[i / 2];
            i /= 2;
        }
        itemArray[i] = temp;
    }
    
    private void downHeap(int i) {
        int temp = itemArray[i];
        while (i * 2 <= count) {
            int child = i * 2;
            if (child < count && itemArray[child] < itemArray[child + 1]) {
                child++; 
            }
            if (temp >= itemArray[child]) {
				break;
			} 
            itemArray[i] = itemArray[child];
            i = child;
        }
        itemArray[i] = temp;
    }
}
