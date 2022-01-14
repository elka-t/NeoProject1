import java.io.IOException;
import java.util.Scanner;

public class PopulationIncrease {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int cityA = s.nextInt();
            int cityB = s.nextInt();
            double a = s.nextDouble();
            double b = s.nextDouble();
            int ans=0;

            while (cityA<=cityB) {
                cityA = cityA + (int) ( ((float)cityA * a) / 100);
                cityB = cityB + (int) ( ((float)cityB * b) / 100);
                ans++;
                if (ans>100){
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (ans<=100){
                System.out.println(ans+ " anos.");
            }

        }


    }
}