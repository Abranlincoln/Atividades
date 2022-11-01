package src1;
import java.util.Random;

public class Ordenação {
    public static void main(String[] args) {
        Random randomic = new Random();
        int inicio = 0;
        int fim = 5;
        int[] vetor1 = randomic.ints(20, 0, 20).toArray();
        int[] vetor = randomic.ints(20000, 0, 20000).toArray();

        Insert.insertionSort(vetor);
        merge.MergeSort(vetor, inicio, fim);

        Insert.insertionSort1(vetor1);
        merge.MergeSort1(vetor1, inicio, fim);

        bubble.bubbleSort(vetor1);
        System.out.print("BubbleSort ");
        for(int v : vetor1) {
            System.out.print(v);
        }
    }
}