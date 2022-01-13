import java.util.Scanner;
public class ColumnInArray {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int colNum = s.nextInt();
        double [][] twoDimArr = new double[12][12];
        String character = s.next();
        double sum = 0;
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr.length; j++) {
                twoDimArr[i][j] = s.nextDouble();
                if (j==colNum){
                    sum += twoDimArr[i][j] ;
                }
            }
        }
        double ans = character.equals("S") ? sum : sum / 12;
        System.out.printf("%.1f%n", ans);

    }

}