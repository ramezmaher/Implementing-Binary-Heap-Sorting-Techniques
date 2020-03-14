package eg.edu.alexu.csd.filestructure.sort;

public class tester {

	public static void main(String[] args) {
		IHeap<Integer> heap = new MyHeap();
		for (int i = 0; i <= 1000; i++) {
			heap.insert(i);
		}
		while (heap.size() != 0) {
			System.out.println(heap.extract());
		}

	}

}
