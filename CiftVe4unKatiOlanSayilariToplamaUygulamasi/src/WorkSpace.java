import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // değişkenlerimizi tanımlıyoruz
        int n;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lütfen bir sayı giriniz: ");
            n = input.nextInt();

            // 4'e tam bölünen sayılarımızı toplamda tutuyoruz.
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0); // Girilen sayı çift olduğu sürece döngü devam eder.

        // 4'e bölünen çift sayıların toplamını ekrana yazdırıyoruz.
        System.out.println("Toplam: " + total);
    }
}

