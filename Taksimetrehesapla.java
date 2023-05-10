import java.util.Scanner;

/**
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
 *
 * Taksimetre KM başına 2.20 TL tutmaktadır.
 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 * Taksimetre açılış ücreti 10 TL'dir.
 */

public class Taksimetrehesapla {
    public static void main(String[] args) {
        // Değiken Tanımla Yap
        int km ;
        double tutar , baslangic;

        // Scanner sınıfı olustur

        Scanner inp = new Scanner(System.in);

                // Kullanıcı Girişi Al


        System.out.print("Gidilen Mesafeyi Km Cinsinden Belirtin :");
        km = inp.nextInt();

        tutar = (km * 2.20) + 10;

        tutar = (tutar <= 20) ? 20 : tutar ;

        System.out.print("Toplam Tutar :" + tutar + " Tl");



    }
}
