import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // Kullanıcıdan yükseklik değerini istiyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        // Üst kısmı oluşturuyoruz.
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı oluşturuyoruz.
        for (int i = yukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

