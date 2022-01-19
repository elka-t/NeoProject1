import java.io.IOException;
import java.util.Scanner;

public class FibonacciArray {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long [] arr = new long [61];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <= 60; i++) {
            arr[i] = arr[i-2]+arr[i-1];
        }
        for (int j= 0; j<n; j++){
            int t = s.nextInt();
            System.out.printf("Fib(%d) = %d%n",t, arr[t]);
        }

    }

}
