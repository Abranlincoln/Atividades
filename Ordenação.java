import java.util.Arrays;
import java.util.Random;
public class Ordenação {

    public static void insertionSort(int[] vetor) {
        int i, j, aux;
        for (i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            for (j = i - 1; (j >= 0) && (aux < vetor[j]); j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = aux;
        }
        System.out.println("Insert " + Arrays.toString(vetor));
    }   

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
        System.out.println("Merge " + Arrays.toString(vetor));
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] aux = new int[vetor.length];
        for (int i = inicio; i <= fim; i++) {
            aux[i] = vetor[i];
        }
        int i = inicio;
        int j = meio + 1;
        int k = inicio;
        while (i <= meio && j <= fim) {
            if (aux[i] <= aux[j]) {
                vetor[k] = aux[i];
                i++;
            } else {
                vetor[k] = aux[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            vetor[k] = aux[i];
            k++;
            i++;
        }
    }
   
    public static void main(String[] args) {
        Random randomic = new Random();
        int inicio = 0;
        int fim = 5;
        int[] vetor1 = randomic.ints(20, 0, 100).toArray();
        int[] vetor2 = randomic.ints(20000, 0, 100).toArray();
        insertionSort(vetor1);
        mergeSort(vetor1, inicio, fim);
        insertionSort(vetor2);
        mergeSort(vetor2, inicio, fim);
    }
}

 