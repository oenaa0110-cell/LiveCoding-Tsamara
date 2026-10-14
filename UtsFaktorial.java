import java.util.Scanner;
public class UtsFaktorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        System.out.println(n + "x" + (n - 1) + "x" + (n - 2) + " = " + faktorial);
    }
}
