import java.util.Scanner;
public class UtsFaktorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long faktorial = 1;

        for (i = n; i >= 1; i--) {
            faktorial *= i;

             System.out.print(i);

         if (i > 1) {
            System.out.print(" x ");
         } else {
            System.out.print(" = ");
         }
        }

         System.out.print(faktorial);
    }
}
