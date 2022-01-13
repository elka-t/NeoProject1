import java.util.Scanner;
public class BanknotesCoins{
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        int [] arr = {100, 50, 20, 10, 5, 2};
        double [] moeArr = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        double num;
        System.out.println("NOTAS:");
        for (int i = 0; i < arr.length; i++) {
            num = n / arr[i];
            System.out.println((int)num+" nota(s) de R$ "+arr[i]+".00");
            n = n% arr[i];
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moeArr.length-1; i++) {
            num = (double)(n/moeArr[i]);
            if(i==0 || i==1 || i==3){
                System.out.println((int)num+" moeda(s) de R$ "+ moeArr[i]+"0");}
            else {
                System.out.println((int)num+" moeda(s) de R$ "+ moeArr[i]);
            }
            n =(double) (n%moeArr[i]);
        }
        num = (double )(n/moeArr[moeArr.length-1]);
        System.out.println(Math.round(num)+" moeda(s) de R$ "+ moeArr[moeArr.length-1]);

    }

}