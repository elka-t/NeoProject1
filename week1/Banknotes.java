import java.util.Scanner;
public class Banknotes{

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int [] arr = new int[]{100, 50, 20, 10, 5, 2, 1};
        int [] notes = new int[7];
        System.out.println(num);
        for (int i = 0; i < arr.length; i++) {
            notes[i] = num / arr[i];
            System.out.println(notes[i]+" nota(s) de R$ "+arr[i]+",00");
            num = num - notes[i] * arr[i];
    }

}
