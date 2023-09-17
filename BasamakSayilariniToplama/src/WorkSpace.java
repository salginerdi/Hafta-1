import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // değişkenimizi tanımladık
        int a;

        // kullanıcıdan bir sayı girmesi için Scanner sınıfımızı oluşturduk.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        a = scanner.nextInt();

        // toplam değerini başlangıçta 0 olarak belirliyoruz.
        int toplam = 0;

        while (a != 0) {
            int basamak = a % 10; // Sayının en sağdaki basamağını alıyoruz.
            toplam += basamak; // Basamağı toplama ekliyoruz.
            a /= 10; // Sayının en sağdaki basamağını çıkartıyoruz.
        }
        System.out.println("Bu sayının basamaklarının toplamı: " + toplam);
    }
}
