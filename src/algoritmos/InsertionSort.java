package algoritmos;

import java.util.Random;

public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] array = is.geradorNumerosAleatorios(25,20);
		is.insertionSort(array, array.length);
	}

	public void insertionSort(int[] listaOrdenar,int n) {
		for(int i = 1; i < n;i++) {
			int chave = listaOrdenar[i];
			int j = i-1;
			while (j >= 0 && listaOrdenar[j] > chave){
				listaOrdenar[j+1] = listaOrdenar[j];
				j--;
			}
			listaOrdenar[j+1] = chave;
			printaLista(listaOrdenar);
		}
	}

	public int[] troca(int[] listaTrocar, int i, int j) {
		int aux = listaTrocar[i];
		listaTrocar[i] = listaTrocar[j];
		listaTrocar[j] = aux;
		return listaTrocar;
	}

	public void printaLista(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("%d ", lista[i]);
		}
		System.out.println("");
	}
	public int[] geradorNumerosAleatorios(int range,int tamanho) {
		int[] array = new int[tamanho];
		Random rand = new Random();
		for(int i = 0; i< tamanho; i++) {
			int  n = rand.nextInt(range) + 1;
			array[i] = n;
		}
		return array;
	}
}
