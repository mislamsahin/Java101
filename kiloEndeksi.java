import java.util.Scanner;

/**
 * Formül
 * Kilo (kg) / Boy(m) * Boy(m)
 *
 * Çıktısı
 * Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
 * Lütfen kilonuzu giriniz : 105
 * Vücut Kitle İndeksiniz : 35.49215792320173
 */
public class kiloEndeksi {
    public static void main(String[] args) {
        int kg;
        double boy , bkEndeks ;

        Scanner inpB = new Scanner(System.in);
        System.out.print("Kilogram ? :");
        kg = inpB.nextInt();

        System.out.print("Boy ? :");
        boy =inpB.nextDouble();

        bkEndeks = kg / (boy * boy) ;

        System.out.print("Vücüt Kitle Endeksiniz : " + bkEndeks);
    }
}
