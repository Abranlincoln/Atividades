package atv1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ATV5 {    
    public static void main(String[] args) {
        Queue<Character> U = new LinkedList<>();
        Queue<Character> L = new LinkedList<>();

        try (Scanner Letter = new Scanner(System.in)) {
            System.out.printf("Digite letras minusculas e maiusculas: ");
   
            String UandL = Letter.nextLine();
   
            for (int S = 0;S < UandL.length();S++){
                char var_char = UandL.charAt(S);
                    if (Character.isUpperCase(var_char)) {
                        U.add(var_char);
                    } 
                    else if (Character.isLowerCase(var_char)) {
                       L.add(var_char);
                    }
            }
        }
        System.out.println("Maiúsculas: ");
        while (!U.isEmpty()){
        System.out.print(U.poll());
    
        }
        System.out.println("\nMinúsculas: ");
        while (!L.isEmpty()){
        System.out.print(L.poll());

        }
    }
}
