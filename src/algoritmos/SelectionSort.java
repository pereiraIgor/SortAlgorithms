package algoritmos;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort sl = new SelectionSort();
		int[] array = { 8, 4, 7, 1 };
		sl.selectionSort(array);
	}

	public void selectionSort(int[] listaOrdenar) {
		for (int i = 0; i < listaOrdenar.length - 1; i++) {
			int less = i;
			for (int j = i + 1; j < listaOrdenar.length; j++) {
				if (listaOrdenar[less] > listaOrdenar[j]) {
					less = j;
				}
			}
			troca(listaOrdenar, i, less);
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
}
