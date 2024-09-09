package list;

public class Main {

	public static void main(String[] args) {
		LinearList linear = new LinearList();
		
		System.out.println(linear.isEmpty());
		
		linear.insert("A");
		linear.insert("C");
		linear.insert(1, "AA");
		linear.insert(2, "B");
		
		linear.printArray();
		
		linear.delete(1);

		System.out.println(linear.isEmpty());
		linear.printArray();
		
	}

}



