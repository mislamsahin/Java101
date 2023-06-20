import java.util.Scanner;
public class aTm {
    public static void main(String[] args) {
        String  userName , password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500 ;
        int select ;
        int price ;

        while (right > 0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("mirac") && password.equals("minel123")) {
                System.out.println("********* Şahin Bankasına Hoşgeldiniz. **********");


                do {
                    System.out.println(
                            "1-Para Yatır\n" +
                            "2-Para Çek\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println(" ");

                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");

                    select = input.nextInt();


                    switch (select) {
                        case 1:
                            System.out.print("Lütfen Yatırmak İstediğiniz Miktari Giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Lütfen Çekmek İstediğiniz Miktari Giriniz : ");
                            price = input.nextInt();
                            if (price > balance){
                                System.out.println("Bakiyeniz Yetersiz!.");
                            }else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("********* Görüşmek Üzere Yine Bekleriz. *********");
                            break;

                        default:
                            System.out.println("Hatalı Giriş");
                    }
                }while (select != 4);
                break;

            }else {
                --right;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre Tekrar Deneyiniz.");
                if (right ==0){
                    System.out.println("Hesabınız Bloke Olmuştur Banka İle İletişime Geçiniz");
                }else {
                    System.out.println("Kalan Hak :" + right);
                }
            }
        }

    }
}
