public class MergeSort {

	public int[] a;
	public int[] tempArray;
	public static int N;


	public void sort(int arr[]) {
		a = arr;
		N = arr.length;
		tempArray = new int[N];
		mergeSort(0, N - 1);
	}

	public void mergeSort(int lIndex, int hIndex) {

		if (lIndex < hIndex) {
			int middle = (lIndex + hIndex ) / 2;
			mergeSort(lIndex, middle);
			mergeSort(middle + 1, hIndex);
			merge(lIndex, middle, hIndex);
		}
	}

	public void merge(int lIndex, int middle, int hIndex) {
		
		
		for (int i = lIndex; i <= hIndex; i++) {
			tempArray[i] = a[i];
		}
		int i = lIndex;
		int j = middle + 1;
		int k = lIndex;
		while (i <= middle && j <= hIndex) {
			if (tempArray[i] <= tempArray[j]) {
				a[k] = tempArray[i];
				i++;
			} else {
				a[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			a[k] = tempArray[i];
			k++;
			i++;
		}

	}


}