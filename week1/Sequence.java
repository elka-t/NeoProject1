import java.io.IOException;

public class Sequence {

    public static void main(String[] args) throws IOException {

        double i = 0;
        double j = 1;

        while (i<=2){
            if (i==1 || i==0 || i>= 1.9) {
                System.out.printf("I=%d J=%d%n", Math.round(i), (int) (i + j));
                System.out.printf("I=%d J=%d%n", Math.round(i), (int) (i + j + 1));
                System.out.printf("I=%d J=%d%n", Math.round(i), (int) (i + j + 2));
            }else {
                System.out.printf("I=%.1f J=%.1f%n", i, i + j);
                System.out.printf("I=%.1f J=%.1f%n", i, i + j + 1);
                System.out.printf("I=%.1f J=%.1f%n", i, i + j + 2);
            }
            i += 0.2;
        }
    }

}