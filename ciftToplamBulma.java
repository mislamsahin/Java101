import java.util.Scanner;
public class ciftToplamBulma {
    public static void main(String[] args) {
        int a , toplam = 0 ;
        Scanner scan = new Scanner(System.in);

            do {
                System.out.print("Bir Sayı Giriniz : ");
                a = scan.nextInt();
                    if (a % 2 == 0 && a % 4 == 0){
                        toplam += a;
                    }
            }while (a > 0);

        System.out.println( "Girilen Çift Sayıların Toplamı : "+ toplam);
    }
}
