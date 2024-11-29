package sort;

public class SortingTest {
	public static void main(String[] args) {
		int[] test = {5,2,1,7,8,9,14,0};
		
		Sorting.insertionSort(test);
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + ", ");
		System.out.println();
		
		int[] test1 = {5,2,1,7,8,9,14,0};
		Sorting.selectionSort(test1);
		for(int i = 0; i < test1.length; i++)
			System.out.print(test1[i] + ", ");
		System.out.println();
		
		int[] test2 = {5,2,1,7,8,9,14,0};
		Sorting.bubbleSort(test2);
		for(int i = 0; i < test2.length; i++)
			System.out.print(test2[i] + ", ");
		System.out.println();
	}
}
