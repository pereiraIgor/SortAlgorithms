package algoritmos;

import java.util.Arrays;

public class CoutingSort {
	public void coutingSort(int[] array, int d, int leftIndex, int rightIndex) {
		int bigger = 0;
		for (int i = leftIndex; i <= rightIndex; i++) {
			if ((array[i] / d) % 10 > bigger) {
				bigger = (array[i] / d) % 10;
			}
		}
		Integer[] array_C = new Integer[bigger + 1];
		for (int i = 0; i < array_C.length; i++) {
			array_C[i] = 0;
		}

		for (int i = leftIndex; i <= rightIndex; i++) {
			array_C[(array[i] / d) % 10]++;
		}
		// soma dos prefixos
		for (int i = 1; i < array_C.length; i++) {
			array_C[i] += array_C[i - 1];
		}
		int[] array_B = new int[array.length];
		for (int i = rightIndex; i >= leftIndex; i--) {
			array_C[(array[i] / d) % 10]--;
			array_B[array_C[(array[i] / d) % 10]] = array[i];
		}
		for (int i = leftIndex; i <= rightIndex; i++) {
			array[i] = array_B[i];
		}
	}
}
