import java.io.IOException;
import java.util.Scanner;
public class LogicalSequence{

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n2 = s.nextInt();
        for (int i = 1; i <= n2; i++) {
            System.out.print(i);
            if (i % n == 0) {
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }
    }
}