import java.util.Scanner;
public class ciftSayiBulma {
    public static void main(String[] args) {
        int k , i = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        k = input.nextInt();

            while (i <= k){
                i++;
                if (i % 2 != 0){
                    continue;
                }
                System.out.println(i);
            }

    }
}
