import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını alıyoruz
        System.out.print("Eleman sayısı: ");
        int n = s.nextInt();

        // İlk iki Fibonacci terimini kendimiz tanımlıyoruz.
        long a = 0, b = 1;

        // İlk iki terimi ekrana yazdırıyoruz.
        System.out.print("Fibonacci Serisi: " + a + " " + b + " ");

        // Fibonacci serisini hesaplıyoruz ve ekrana yazdırıyoruz
        for (int i = 2; i < n; i++) {
            // Yeni terimi hesaplıyoruz
            long c = a + b;

            // ve Yeni terimi ekrana yazdırıyoruz.
            System.out.print(c + " ");

            // Terimleri güncelliyoruz
            a = b;
            b = c;
        }
    }
}
