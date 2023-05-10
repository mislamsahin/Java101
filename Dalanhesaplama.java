import java.util.Scanner;
public class Dalanhesaplama {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner inpr = new Scanner(System.in);
        System.out.print("Yarı Çap'ı Giriniz :");
        r = inpr.nextInt();

        double alan = pi * r * r ;
        double cevre = 2 * pi * r ;

        System.out.println("Alanı :" + alan);
        System.out.print("Çevresi :" + cevre);
    }
}
