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
            System.out.println("Insert " + aux);
        }
    }

    public static void insertionSort1(int[] vetor) {
        int i, j, aux1;
        for (i = 1; i < vetor.length; i++) {
            aux1 = vetor[i];
            for (j = i - 1; (j >= 0) && (aux1 < vetor[j]); j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = aux1;
            System.out.println("Insert1 " + aux1);
        }
    }      

    public static void mergeSort1(int[] vetor1, int inicio1, int fim1) {
        if (inicio1 < fim1) {
            int meio1 = (inicio1 + fim1) / 2;
            mergeSort1(vetor1, inicio1, meio1);
            mergeSort1(vetor1, meio1 + 1, fim1);
            merge(vetor1, inicio1, meio1, fim1);
            System.out.println("Merge1 " + (inicio1+meio1+fim1));
        } 
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
            System.out.println("Merge " + (inicio+meio+fim));
        }
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
        int[] vetor1 = randomic.ints(20, 0, 20).toArray();
        int[] vetor = randomic.ints(20000, 0, 20000).toArray();

        insertionSort(vetor);
        mergeSort(vetor, inicio, fim);

        insertionSort1(vetor1);
        mergeSort1(vetor1, inicio, fim);
    }
}
