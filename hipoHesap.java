import java.util.Scanner;
public class hipoHesap {
    public static void main(String[] args) {
        // Değişkenleri Belirle
        double a , b , c ;
        // Scanner Sınıfını Oluştur

        Scanner girdi = new Scanner(System.in);

        // Kullanıcı Girişi Al

        System.out.print("Lütfen A yı Belirtiniz : ");
        a = girdi.nextDouble();

        System.out.print("Lütfen B yi Belirtiniz : ");
        b = girdi.nextDouble();

        // İşlemi Yapın

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüsü : " + c);

        }

    }

