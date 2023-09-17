import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // üçgenin yüksekliğini kullanıcıdan almak için Scanner sınıfı tanımlıyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin yüksekliğini giriniz: ");
        // Yüksekliği n değişkenine atıyoruz.
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" "); // Boşlukları ekliyoruz
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*"); // Yıldızları ekliyoruz
            }
            System.out.println(); // Burada satırı tamamlıyoruz.
        }
    }
}
