import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // değişkenlerimizi tanımlıyoruz ve metota atıyoruz.
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        // kullanıcının kaç tane sayı gireceğini öğreniyoruz.
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // kullanıcı tek tek sayılarını giriyor.
        for (int i = 1; i <= n; i++) {
            System.out.print("Sayı " + i + ": ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        // sonucu konsola yazdırıyoruz.
        System.out.println("Girdiğiniz sayılar arasındaki en büyük sayı: " + enBuyuk);
        System.out.println("Girdiğiniz sayılar arasındaki en küçük sayı: " + enKucuk);

        scanner.close();
    }
}
