package algoritmos;
import java.util.*; 
  
public class BubbleSortRecursivo{
	public void insertionSort(int[] array, int leftIndex , int rightIndex) {
		for(int i = leftIndex+1; i <= rightIndex; i++) {
			int valor = array[i];
			int index = i-1;
			while(index >= leftIndex && valor > array[index] ) {
				array[index+1] = array[index--];
			}
			array[index+1] = valor;
		}
	}
}