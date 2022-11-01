package SRC7;

public class Lista_06P_Q1_AeB {

    public int[] vetor_reverso(int[] v, int i) {
        if (i == v.length) {
            return v;
        } else {
            vetor_reverso(v, i + 1);
            System.out.println("Vetor em odem reversa: " + v[i] + " " + (i + 1) + "º valor");
            return v;
        }
    }

    public static void main(String[] args) {

        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
            System.out.println("Vetor em ordem:        " + v[i] + " " + (i + 1) + "º valor");
        }

        Lista_06P_Q1_AeB vetor = new Lista_06P_Q1_AeB();
        vetor.vetor_reverso(v, 0);
    }
}
//O passo base é descobrir o tamanho do vetor, o passo recursivo é percorrer o vetor e imprimir os valores em ordem reversa.
//Como demonstrado no Algoritimo acima.