import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 sayı alıyoruz
        System.out.print("Birinci sayıyı girin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double b = scanner.nextDouble();

        System.out.print("Üçüncü sayıyı girin: ");
        double c = scanner.nextDouble();

        // İşlemi hesaplıyoruz
        double sonuc = hesapla(a, b, c);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Sonuç: " + sonuc);

    }

    // Verilen sayıları kullanarak işlemi hesaplayan metot
    public static double hesapla(double a, double b, double c) {
        // İşlem sırasını paranteze alarak hesaplıyoruz
        return a + (b * c) - b;
    }
}
