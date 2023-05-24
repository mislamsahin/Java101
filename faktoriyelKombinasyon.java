import java.util.Scanner;

public class faktoriyelKombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = input.nextInt();

        System.out.print("r değerini girin: ");
        int r = input.nextInt();

        int nfakto = 1;
        for (int i = 1; i <= n; i++) {
            nfakto *= i;
        }

        int rfakto = 1;
        for (int i = 1; i <= r; i++) {
            rfakto *= i;
        }
        int nrfakto = 1;
        for (int i = 1; i <= n - r; i++) {
            nrfakto *= i;
        }

        double total = nfakto / (rfakto * (nrfakto));

        System.out.println("C(" + n + "," + r + ") = " + total);
    }
}