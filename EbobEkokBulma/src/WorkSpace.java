import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // EBOB  ve EKOK değerleri için değişkenler oluşturuyoruz.
        int ebob = 1;
        int ekok = 1;
        int i = 2;

        // EBOB hesaplıyoruz.
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                // Eğer i, her iki sayının da böleniyse, bu i, EBOB'dur.
                ebob = i;
                sayi1 /= i;
                sayi2 /= i;
            } else {
                // i bölen değilse, bir sonraki sayıya geçilir.
                i++;
            }
        }

        // EKOK hesaplıyoruz.
        ekok = (sayi1 * sayi2) / ebob;

        // Sonucu konsola yazdırıyoruz.
        System.out.println("Girdiğiniz iki sayının EBOB'u: " + ebob);
        System.out.println("Girdiğiniz iki sayının EKOK'u: " + ekok);
        
    }
}
