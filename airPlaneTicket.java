import java.util.Scanner;

public class airPlaneTicket {
    public static void main(String[] args) {
        int km, years, yolTip;
        double perKm = 0.10, normalTutar, iTutar, yasiTutar, ggitutar, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Mesafeyi Giriniz : ");
        km = input.nextInt();


        System.out.print("Yaşınız : ");
        years = input.nextInt();

        System.out.print("Yolculuk Tipini Belirtiniz   ");
        System.out.print("Tek Yön için 1  Gidiş Dönüş İçin 2 :");
        yolTip = input.nextInt();

        if (years > 0 && km > 0) {

            switch (yolTip) {
                case 1 -> {
                    if (years <= 12) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.05;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam Ücret : " + iTutar + "TL");

                    } else if (years <= 24) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.1;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam Ücret : " + iTutar + "Tl");

                    } else if (years <= 65) {
                        normalTutar = (km * perKm);
                        System.out.println("Toplam Ücret : " + normalTutar + "TL");

                    } else {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.3;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam Ücret" + iTutar + "TL");
                    }
                }
                case 2 -> {
                    if (years <= 12) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.5;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar) * 2;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else if ((years >= 12) && (years <= 24)) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.1;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar) * 2;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else if (years < 65) {
                        normalTutar = (km * perKm);
                        ggitutar = normalTutar * 0.2;
                        total = normalTutar - ggitutar;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.3;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar);
                        System.out.println("Toplam Ücret : " + total + "TL");
                    }

                }
                default -> System.out.println("Hatalı Giriş Yaptınız.");
            }
        } else {
            System.out.println("Geçersiz Değer Girdiniz.");
        }

    }
}
