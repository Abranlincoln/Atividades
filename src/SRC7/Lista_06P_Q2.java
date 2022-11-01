package SRC7;

public class Lista_06P_Q2 {
    public int Recursiva(int n) {
        int x;
        if (n <= 0){
            x = 1;
        } else{
            x = Recursiva(n-1) + Recursiva (n-1);
        }
        return x;
    }
    public static void main(String[] args) {
        Lista_06P_Q2 x = new Lista_06P_Q2();
        System.out.println(x.Recursiva(4));
    }
}
// O que este algoritimo Faz é calcular o valor de 2^n, onde n é o valor passado como parametro.