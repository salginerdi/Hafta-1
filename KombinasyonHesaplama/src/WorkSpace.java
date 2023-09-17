import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan N değerini alıyoruz.
        System.out.print("N'i girin: ");
        int n = input.nextInt();

        // Kullanıcıdan R değerini alıyoruz
        System.out.print("R'yi girin: ");
        int r = input.nextInt();

        // Kombinasyonu hesaplıyoruz.
        long kombinasyon = kombinasyonHesapla(n, r);

        // Sonucu ekrana yazdırıyoruz.
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        input.close();
    }

    // Faktoriyel hesaplamak için fonksiyonumuzu yazıyoruz.
    public static long faktoriyel(int sayi) {
        long faktoriyel = 1;
        for (int i = 2; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    // Kombinasyonu hesaplamak için fonksiyon oluşturuyoruz.
    public static long kombinasyonHesapla(int n, int r) {
        // Kombinasyon formülünü kullanarak hesaplama yapıyoruz.
        long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        return kombinasyon;
    }
}
