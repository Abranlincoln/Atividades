package atv1;
public class ATV5_2 {
    public static void N(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            N(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        N(55);
}
}