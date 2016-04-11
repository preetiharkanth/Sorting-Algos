public class HeapSort {

	private static int N;

	public void sort(int a[]) {
		heapify(a);
		for (int i = N; i > 0; i--) {
			interchange(a, 0, i);
			N = N - 1;
			maxheap(a, 0);
		}
	}

	/* Build heap */
	public static void heapify(int a[]) {
		N = a.length - 1;
		for (int i = N / 2; i >= 0; i--)
			maxheap(a, i);
	}

	/* Function to swap largest element in heap */
	public static void maxheap(int a[], int i) {
		int low = 2 * i;
		int high = 2 * i + 1;
		int max = i;
		if (low <= N && a[low] > a[i])
			max = low;
		if (high <= N && a[high] > a[max])
			max = high;

		if (max != i) {
			interchange(a, i, max);
			maxheap(a, max);
		}
	}

	/* Interchange two numbers in an array */
	public static void interchange(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	

}