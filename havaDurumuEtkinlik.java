import java.util.Scanner;
public class havaDurumuEtkinlik {
    public static void main(String[] args) {
        int heat ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz :");
        heat = input.nextInt();

            if (heat < 5) {
                System.out.println("Kayak Yapabilirsiniz");

            }else if  (heat <= 25) {

                if (heat <= 15) {
                    System.out.println("Sinemaya Gidebilirsiniz");
                }
                if (heat >= 10) {
                    System.out.println("Pikniğe Gidebilirsiniz");
                }
            }  else {
                System.out.println("Yüzmeye Gidebilirsiniz");
            }
    }
}
