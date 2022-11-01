package src1;

public class merge {
    public static void MergeSort1(int[] vetor1, int inicio1, int fim1) {
        if (inicio1 < fim1) {
            int meio1 = (inicio1 + fim1) / 2;
            MergeSort1(vetor1, inicio1, meio1);
            MergeSort1(vetor1, meio1 + 1, fim1);
            Merge(vetor1, inicio1, meio1, fim1);
            System.out.println("Merge1 " + (inicio1+meio1+fim1));
        } 
    }

    public static void MergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            MergeSort(vetor, inicio, meio);
            MergeSort(vetor, meio + 1, fim);
            Merge(vetor, inicio, meio, fim);
            System.out.println("Merge " + (inicio+meio+fim));
        }
    }


    public static void Merge(int[] vetor, int inicio, int meio, int fim) {
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
}
