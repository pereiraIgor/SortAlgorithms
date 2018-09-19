package algoritmos;

import java.util.Arrays;

public class RadixSort {
	CoutingSort cs = new CoutingSort();
	public void radixSort(int[] array, int leftIndex, int rightIndex) {
		Integer bigger = 0;
		for (int i = leftIndex; i <= rightIndex; i++) {
			if (array[i] > bigger) {
				bigger = array[i];
			}
		}
		for(int exp = 1; bigger/ exp > 0;exp*=10 )
			cs.coutingSort(array, exp, leftIndex, rightIndex);
			System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		CoutingSort cs = new CoutingSort();
		int[] esse = new int[] {12330, 1,2,3,44,634,635,6478,97,65,633,23523,41,412,412,3,12546,835,41,7,14,7,28, 7, 29};
		RadixSort rs = new RadixSort();
		rs.radixSort(esse, 0, esse.length-1);
	}
}
