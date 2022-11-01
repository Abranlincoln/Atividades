package atv1;
public class ATV5_1 {
    
    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }   else{
        return n + Sum(n - 1);}
    }
    public static void main(String[] args) {
        System.out.println(Sum(10));
    }
}       


