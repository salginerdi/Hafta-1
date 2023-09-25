package Main;

import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlıyoruz. Kilometre başına 2.20tl ücret eklenmektedir.
        // Taksimetre açılış ücreti 10tl'dir.
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gitmek istediğiniz mesafeyi km cinsinden yazınız: ");
        km = input.nextInt();

        total = km * perKm;
        total += startPrice;

        // Toplam tutar 20tl altında tutarsa da minimum 20tl ödenir.
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Tutar: " + total);
    }
}
