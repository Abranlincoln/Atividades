package atv1;
import java.util.Scanner;

public class ATV5_3 {
    public static int Elevado(int k, int n) {
        if(k<=0){
            return 0;
        } else if (n<=0){
            return 1;
        } else {
            return k * Elevado (k,n-1);
        }
    }
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        input.close();
        System.out.println(Elevado(k,n));
    }

}