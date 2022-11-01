package src1;

public class bubble {
    public static  void bubbleSort(int[] vetor1) {
        int aux;
        for (int i = 0; i < vetor1.length - 1; i++) {
            for (int j = 0; j < vetor1.length - 1; j++) {
                if (vetor1[j] > vetor1[j + 1]) {
                    aux = vetor1[j];
                    vetor1[j] = vetor1[j + 1];
                    vetor1[j + 1] = aux;
                        
                }
            }
        }
    }
}
