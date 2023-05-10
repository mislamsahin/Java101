import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        // Değişkenleri Belirliyelim
        double fiyat , kdv = 0.18;

        //Scanner Sınıfını Oluştur
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Veri Alalım
        System.out.print("Fiyatı Giriniz :");
        fiyat = inp.nextDouble();

        // İşlemi Belirliyelim

        double kdvsi = fiyat * kdv ;
        double kdvlif = fiyat + kdvsi ;

        System.out.println("Kdv'si :" + kdvsi);
        System.out.println("Kdv'li Fiyati :" + kdvlif );
        }

    }

