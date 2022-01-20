import java.io.IOException;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t;
        int i =0;
        while (i<n){
            boolean check = true;
            t = s.nextInt();
            for (int j = 2; j < t; j++) {
                if (t%j==0){
                    check=false;}
            }
            if (check){
                System.out.printf("%d eh primo%n",t);}
            else {
                System.out.printf("%d nao eh primo%n",t);}
            i++;
        }
    }
}
