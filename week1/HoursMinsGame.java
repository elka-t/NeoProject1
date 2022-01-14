import java.io.IOException;
import java.util.Scanner;

public class HoursMinsGame{

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int startH = s.nextInt();
        int startM = s.nextInt();
        int endH = s.nextInt();
        int endMin = s.nextInt();
        int hours = endH - startH;
        int mins;
        if (hours < 0) {
            hours = 24 + (endH - startH);
        }

        mins = endMin - startM;
        if (mins < 0) {
            mins = 60 + (endMin - startM);
            hours--;
        }

        if (startH == endH && startM == endMin) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hours, mins);
        }
    }
}
