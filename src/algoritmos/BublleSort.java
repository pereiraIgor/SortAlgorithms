package algoritmos;

public class BublleSort {
	public static void main(String[] args) {
		BublleSort bb = new BublleSort();
		int[] array = { 8, 4, 7, 1 };
		bb.bublleSort(array);
	}

	public void bublleSort(int[] listaOrdenar) {
		int tamanhoLista = listaOrdenar.length;
		for (int i = 0; i < tamanhoLista - 1; i++) {
			for (int j = 0; j < tamanhoLista - 1; j++) {
				if (listaOrdenar[j] > listaOrdenar[j + 1]) {
					listaOrdenar = troca(listaOrdenar, j, j + 1);
					printaLista(listaOrdenar);
				}
			}
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
