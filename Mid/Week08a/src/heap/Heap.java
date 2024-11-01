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

    // 주어진 배열로부터 힙을 만드는 함수
    public static Heap makeHeap(int[] origArray) {
        Heap heap = new Heap();
        for (int i = 1; i < origArray.length; i++) {
            heap.insert(origArray[i]);
        }
        return heap;
    }

    // 힙에 새로운 요소를 삽입하는 함수
    public void insert(int newItem) {
        if (count >= size - 1) {
            System.out.println("Heap is full");
            return;
        }
        count++;
        int i = count;
        // 새로운 아이템이 부모 노드보다 클 경우 교환하여 위로 이동
        while (i > 1 && newItem > itemArray[i / 2]) {
            itemArray[i] = itemArray[i / 2];
            i /= 2;
        }
        itemArray[i] = newItem;
    }

    // 힙의 내용을 출력하는 함수
    public void printHeap() {
        for (int i = 1; i <= count; i++) {
            System.out.print(itemArray[i] + " ");
        }
        System.out.println();
    }

    // 힙에서 루트(최대값)를 삭제하는 함수
    public int delete() {
        if (count == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int root = itemArray[1]; // 루트 노드(최댓값)
        itemArray[1] = itemArray[count]; // 마지막 노드를 루트 위치에
        count--;

        // 루트에서부터 아래로 힙을 재정렬
        heapify(1);

        return root;
    }

    // 힙의 재정렬을 위한 힙화(heapify) 함수
    private void heapify(int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        // 왼쪽 자식이 존재하고, 현재 노드보다 클 경우
        if (left <= count && itemArray[left] > itemArray[largest]) {
            largest = left;
        }

        // 오른쪽 자식이 존재하고, 현재 노드보다 클 경우
        if (right <= count && itemArray[right] > itemArray[largest]) {
            largest = right;
        }

        // 만약 자식 중 하나가 더 크면 교환
        if (largest != i) {
            int temp = itemArray[i];
            itemArray[i] = itemArray[largest];
            itemArray[largest] = temp;

            // 재귀적으로 자식 노드들에 대해 힙화 실행
            heapify(largest);
        }
    }
}
