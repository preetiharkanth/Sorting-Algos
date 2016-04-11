
public class InPlaceQuickSort {
	public void quickSort(int[] a, int low, int high) {
		if (a == null || a.length == 0)
			return;

		// pivot selection
		int middle = (low + high) / 2;
		int pivot = a[middle];

		int i = low, j = high;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}

		// recursive calls
		if (low < j)
			quickSort(a, low, j);

		if (high > i)
			quickSort(a, i, high);
	}


}
