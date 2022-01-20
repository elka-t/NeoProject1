import java.io.IOException;
import java.util.Scanner;

public class PerfectNumber{

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int t;
        int i =0;
        while (i<n){
            int sum =0;
            boolean check = false;
            t = s.nextInt();
            for (int j = 1; j <t; j++) {
                if (t % j==0) {
                    sum+=j;
                }

            }
            if (t==sum){
                System.out.printf("%d eh perfeito%n",t);
            }
            else {
                System.out.printf("%d nao eh perfeito%n",t);
            }
            i++;
        }
    }
}

