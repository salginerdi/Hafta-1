import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // değişkenimizi tanımlıyoruz.
        int n;

        // kullanıcıdan bir sayı istiyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        n = scanner.nextInt();

        System.out.println("4 ve 5'in ortak kuvvetleri:");

        // hem 4'e, hem 5'e bölünebilen ortak sayıları buluyoruz.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 4 == 0 && j % 5 == 0 && i == j) {
                    // konsola yazdırıyoruz.
                    System.out.println(i + " sayısı 4 ve 5'in ortak kuvvetidir.");
                }
            }
        }
    }
}
