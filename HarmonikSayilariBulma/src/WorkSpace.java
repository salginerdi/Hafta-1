import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // değişkenlerimizi tanımlıyoruz.
        int n;
        double result = 0;

        // Kullanıcıdan bir sayı almak için Scanner sınıfımızı tanımlıyoruz.
        System.out.println("Bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        // harmonik toplamı bulmak için for döngümüzü oluşturuyoruz.
        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }

        // sonucu konsola yazdırıyoruz.
        System.out.println(result);

    }
}
