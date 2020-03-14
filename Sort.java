package eg.edu.alexu.csd.filestructure.sort;

import java.util.ArrayList;
import java.util.Random;

public class Sort<T extends Comparable<T>> implements ISort<T> {

	@Override
	public IHeap<T> heapSort(ArrayList<T> unordered) {
		IHeap<T> heap = new MyHeap<T>();
		heap.build(unordered);
		return heap;
	}

	@Override
	public void sortSlow(ArrayList<T> unordered) {
		insertionSort(unordered);

	}

	// *Sorting the ArrayList recursively using QuickSort Algorithm with Random
	// Pivot Chosen
	@Override
	public void sortFast(ArrayList<T> unordered) {
		quickSort(unordered, 0, unordered.size() - 1);

	}

	private void quickSort(ArrayList<T> unordered, int first, int last) {
		int size = (last - first) + 1;
		if (size <= 1)
			return;

		Random random = new Random();
		int randomNum = first + random.nextInt(size);
		swap(unordered, first, randomNum);

		int pivot = first;
		int lastSmaller = first;

		for (int firstUnknown = first + 1; firstUnknown <= last; firstUnknown++) {
			int sign = unordered.get(firstUnknown).compareTo(unordered.get(pivot));
			if (sign < 0) {
				swap(unordered, firstUnknown, lastSmaller + 1);
				lastSmaller++;
			}

		}
		swap(unordered, pivot, lastSmaller);

		quickSort(unordered, first, lastSmaller);
		quickSort(unordered, lastSmaller + 1, last);

	}

	private void insertionSort(ArrayList<T> unordered) {

		for (int selectedItem = 1; selectedItem < unordered.size(); selectedItem++) {
			int j;

			for (j = 0; j < selectedItem; j++) {
				int sign = unordered.get(j).compareTo(unordered.get(selectedItem));
				if (sign > 0)
					break;
			}
			if (j < selectedItem) {
				T temp = unordered.get(selectedItem);
				shiftArray(unordered, j, selectedItem);
				unordered.set(j, temp);
			}
		}
	}

	private void swap(ArrayList<T> array, int index1, int index2) {
		T temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}

	private void shiftArray(ArrayList<T> array, int first, int last) {
		while (first < last) {
			array.set(last, array.get(last - 1));
			last--;
		}
	}
}
