import java.util.Scanner;
public class ussuSayiBulma {
    public static void main(String[] args) {
        int n , k ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı : ");
        n = inp.nextInt();
        System.out.print("Üssü Sayısı : ");
        k = inp.nextInt();

        int total = 1;
        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Cevap : " + total);

    }
}
