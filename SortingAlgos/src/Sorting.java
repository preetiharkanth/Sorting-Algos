import java.util.Scanner;
import java.util.Random;

public class Sorting {

	private static final Random RAND = new Random();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int length, i, j;
		System.out.println("Enter length of array");
		length = scan.nextInt();
		int[] a = new int[length];
		int[] b = new int[length];
		int[] c = new int[length];
		int[] arr = createRandomArray(length);
		int unsorarr[] = new int[length];
		int unsora[] = new int[length];
		int unsorb[] = new int[length];
		int unsorc[] = new int[length];
		for (i = 0; i < length; i++) {
			a[i] = arr[i];
			b[i] = arr[i];
			c[i] = arr[i];
		}

		System.out.println("-------Heap Sort--------");
		HeapSort heapSort = new HeapSort();
		long hsStartTime = System.currentTimeMillis();
		heapSort.sort(arr);
		long hsEndTime = System.currentTimeMillis();
		long hsTotalTime = hsEndTime - hsStartTime;
		// System.out.println("\nAfter sorting ");
		// for (i = 0; i < length; i++)
		// System.out.print(arr[i] + " ");
		System.out.println("\n Heap Sort (Unsorted) " + hsTotalTime + "");

		long hsStartTime1 = System.currentTimeMillis();
		heapSort.sort(arr);
		long hsEndTime1 = System.currentTimeMillis();
		long hsTotalTime1 = hsEndTime1 - hsStartTime1;
		System.out.println("\n Heap Sort (Sorted) " + hsTotalTime1 + "");

		for (i = length, j = 0; j < length; i--, j++)
			unsorarr[j] = arr[i - 1];
		long hsStartTime2 = System.currentTimeMillis();
		heapSort.sort(unsorarr);
		long hsEndTime2 = System.currentTimeMillis();
		long hsTotalTime2 = hsEndTime2 - hsStartTime2;
		System.out.println("\n Heap Sort (Inversely Sorted) " + hsTotalTime2
				+ "");

		System.out.println("-------Merge Sort--------");
		MergeSort mergeSort = new MergeSort();
		long msStartTime = System.currentTimeMillis();
		mergeSort.sort(a);
		long msEndTime = System.currentTimeMillis();
		long msTotalTime = msEndTime - msStartTime;
		// System.out.println("\nAfter sorting ");
		// for (i = 0; i < length; i++)
		// System.out.print(a[i] + " ");
		System.out.println("\n Merge Sort (Unsorted) " + msTotalTime + "");

		long msStartTime1 = System.currentTimeMillis();
		mergeSort.sort(a);
		long msEndTime1 = System.currentTimeMillis();
		long msTotalTime1 = msEndTime1 - msStartTime1;
		System.out.println("\n Merge Sort (Sorted) " + msTotalTime1 + "");

		for (i = length, j = 0; j < length; i--, j++)
			unsora[j] = a[i - 1];
		long msStartTime2 = System.currentTimeMillis();
		mergeSort.sort(unsora);
		long msEndTime2 = System.currentTimeMillis();
		long msTotalTime2 = msEndTime2 - msStartTime2;
		System.out.println("\n Merge Sort (Inversely Sorted) " + msTotalTime2
				+ "");

		System.out.println("-------Inplace Quick Sort--------");
		InPlaceQuickSort inPlaceQuickSort = new InPlaceQuickSort();
		long qsStartTime = System.currentTimeMillis();
		inPlaceQuickSort.quickSort(b, 0, length - 1);
		long qsEndTime = System.currentTimeMillis();
		long qsTotalTime = qsEndTime - qsStartTime;
		// System.out.println("\nAfter sorting ");
		// for (i = 0; i < length; i++)
		// System.out.print(b[i] + " ");
		System.out.println("\n Quick Sort (Unsorted) " + qsTotalTime + "");

		long qsStartTime1 = System.currentTimeMillis();
		inPlaceQuickSort.quickSort(b, 0, length - 1);
		long qsEndTime1 = System.currentTimeMillis();
		long qsTotalTime1 = qsEndTime1 - qsStartTime1;
		System.out.println("\n Quick Sort (Sorted) " + qsTotalTime1 + "");

		for (i = length, j = 0; j < length; i--, j++)
			unsorb[j] = b[i - 1];
		long qsStartTime2 = System.currentTimeMillis();
		inPlaceQuickSort.quickSort(unsorb, 0, length - 1);
		long qsEndTime2 = System.currentTimeMillis();
		long qsTotalTime2 = qsEndTime2 - qsStartTime2;
		System.out.println("\n Quick Sort (Inversely Sorted) " + qsTotalTime2
				+ "");

		System.out.println("-------Median of three Quick Sort--------");
		QuickSort quickSort = new QuickSort();
		long mqsStartTime = System.currentTimeMillis();
		quickSort.quickSort(c, 0, length - 1);
		long mqsEndTime = System.currentTimeMillis();
		long mqsTotalTime = mqsEndTime - mqsStartTime;
		// for (i = 0; i < length; i++)
		// System.out.print(c[i] + " ");
		System.out.println("\n Median of three Quick Sort (Unsorted) "
				+ mqsTotalTime + "");

		long mqsStartTime1 = System.currentTimeMillis();
		quickSort.quickSort(c, 0, length - 1);
		long mqsEndTime1 = System.currentTimeMillis();
		long mqsTotalTime1 = mqsEndTime1 - mqsStartTime1;
		System.out.println("\n Median of three Quick Sort (Sorted) "
				+ mqsTotalTime1 + "");

		for (i = length, j = 0; j < length; i--, j++)
			unsorc[j] = c[i - 1];
		long mqsStartTime2 = System.currentTimeMillis();
		quickSort.quickSort(unsorc, 0, length - 1);
		long mqsEndTime2 = System.currentTimeMillis();
		long mqsTotalTime2 = mqsEndTime2 - mqsStartTime2;
		System.out.println("\n Median of three Quick Sort (Inversely Sorted) "
				+ mqsTotalTime2 + "");

	}

	// Creates an array of the given length, fills it with random
	// non-negative integers, and returns it.
	public static int[] createRandomArray(int length) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = RAND.nextInt(10000);
		}
		return a;
	}

}
