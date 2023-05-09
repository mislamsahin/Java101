import java.util.Scanner;
/**
 * Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik Derlerinin Puanlarını Kullanıcıdan Alan
 * ve Not Ortalamasını Hesaplayan Bir
 * Program Yazacagız
 */


public class NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenleri Oluştur

        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner Sınıfını Oluştur
        Scanner inp = new Scanner(System.in);

        //Kullanıcan Değerleri Al

        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
                double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        boolean kosul1 = sonuc <= 50;
        boolean kosul2 = sonuc >= 50;

        String str =kosul1 ? "Kaldınız" : "Geçtiniz";

        System.out.println(str);


    }
}
