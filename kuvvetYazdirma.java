import java.util.Scanner;
public class kuvvetYazdirma {
    public static void main(String[] args) {
        int n , k;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kuvvetini Öğrenmek İstediğiniz Sayı :");
        k = girdi.nextInt();

        System.out.print("Sınır Sayısını Belirleyiniz : ");
        n = girdi.nextInt();

        if (k > 1) {
            for (int i = 1; i < n; i *= k) {
                System.out.println(i);
            }
        }

    }
}
