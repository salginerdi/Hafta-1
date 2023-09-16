import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // değişkenlerimizi tanımlıyoruz.
        int n, k;
        int total = 1;

        // üssü alınacak sayı ile üs olacak sayıyı kullanıcıdan alıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı yazınız: ");
        n = input.nextInt();

        System.out.println("Üs olacak sayıyı yazınız: ");
        k = input.nextInt();

        // for döngüsüyle sonucu hesaplıyoruz.
        for (int i = 1; i <= k; i++) {
            total *= n;

        }
        // sonucu yazdırıyoruz.
        System.out.println("Sonuç: " + total);
    }
}
