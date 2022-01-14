import java.io.IOException;
import java.util.Scanner;

public class WeightedAvg{

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        float weightedAvg = 0;
        for (int i = 0; i < n; i++) {
            float first= s.nextFloat();
            float second=s.nextFloat();
            float third=s.nextFloat();
            weightedAvg = ((first*2)+(second*3)+(third*5))/10;
            System.out.printf("%.1f%n",weightedAvg);
        }
    }

}