import java.io.IOException;
import java.util.Scanner;

public class Grenais {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int interGoals = 0;
        int gremioGoals = 0;
        int empates = 0;
        int grenais = 0;
        boolean check =false;
        while (!check) {
            int Inter = s.nextInt();
            int Gremio = s.nextInt();
            if(Inter>Gremio){interGoals++;}
            else if(Gremio>Inter){ gremioGoals++;}
            else {empates++;}
            System.out.println("Novo grenal (1-sim 2-nao)");
            int n = s.nextInt();
            grenais++;
            if(n==2){
                System.out.println(grenais + " grenais");
                System.out.println("Inter:"+interGoals);
                System.out.println("Gremio:"+gremioGoals);
                System.out.println("Empates:"+empates);
                if (interGoals>gremioGoals){
                    System.out.println("Inter venceu mais");
                }
                else if(gremioGoals>interGoals){
                    System.out.println("Gremio venceu mais");
                }
                else {
                    System.out.println("Não houve vencedor");
                }
                check=true;
            }
        }


    }
}
