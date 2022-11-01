package src1;

public class Insert{
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

}