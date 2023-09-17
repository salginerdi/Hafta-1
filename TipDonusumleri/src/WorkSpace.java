import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // Kullanıcıdan tam sayı ve ondalıklı sayıyı almak için bir Scanner nesnesi oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tam sayıyı girmesini istiyoruz.
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayıyı girmesini istiyoruz.
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürüyoruz.
        double tamSayiOndalikli = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürüyoruz.
        int ondalikliSayiTam = (int) ondalikliSayi;

        // Sonuçları ekrana yazdırıyoruz.
        System.out.println("Girilen tam sayı: " + tamSayi);
        System.out.println("Girilen ondalıklı sayı: " + ondalikliSayi);
        System.out.println("Tam sayıyı ondalıklıya dönüştürdüğümüzde: " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıyı tama dönüştürdüğümüzde: " + ondalikliSayiTam);

    }
}
