public class QuickSort {

	public void quickSort(int[] a, int low, int high) {
		if (a == null || a.length == 0)
			return;
		
		if ((high - low) <= 15) {
			//System.out.print("Using Insertion Sort");
			insertionSort(a);
		} else{
		
			
		int pivot = medianOf3(a, low, high);
		
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
		
		if (low < j)
			quickSort(a, low, j);

		if (high > i)
			quickSort(a, i, high);
		}
	}

	public static int medianOf3(int[] a, int left, int right) {
		int center = (left + right) / 2;

		if (a[left] > a[center])
			interchange(a, left, center);

		if (a[left] > a[right])
			interchange(a, left, right);

		if (a[center] > a[right])
			interchange(a, center, right);

		interchange(a, center, right - 1);
		return a[right - 1];
	}

	public static void interchange(int[] a, int i1, int i2) {
		int temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
	}

	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			for (j = i - 1; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
	}
}
