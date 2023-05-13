import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int s1 , s2 , islem;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
            s1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
            s2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İşlemi Seçiniz: ");
            islem = inp.nextInt();

        switch (islem){
            case 1:
                System.out.println((s1 + s2));
                break;
            case 2:
                System.out.println((s1 - s2));
                break;
            case 3:
                System.out.println((s1 * s2));
                break;
            case 4:
                if (s2==0){
                    System.out.println("Bir Sayı 0 a Bölünemez");
                }else {
                    System.out.println((s1 / s2));
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");

        }

    }
}
