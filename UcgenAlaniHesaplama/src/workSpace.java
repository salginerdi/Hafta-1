import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // Öncelikle değişkenlerimizi tanımlıyoruz.
        int aKenari, bKenari, cKenari;

        // Daha sonra Scanner sınıfı ile kullanıcıdan kenar uzunluklarını girmesini istiyoruz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen A Kenarının Uzunluğunu Giriniz: ");
        aKenari = input.nextInt();

        // if metodu kullanarak kullanıcının negatif ya da 0 değeri girmesinin önüne geçiyoruz.
        if (aKenari <= 0) {
            System.out.println("Lütfen 0'dan farklı ve pozitif bir değer giriniz");
        }
        ;

        System.out.println("Lütfen B Kenarının Uzunluğunu Giriniz: ");
        bKenari = input.nextInt();

        if (bKenari <= 0) {
            System.out.println("Lütfen 0'dan farklı ve pozitif bir değer giriniz");
        }
        ;

        System.out.println("Lütfen C Kenarının Uzunluğunu Giriniz: ");
        cKenari = input.nextInt();

        if (cKenari <= 0) {
            System.out.println("Lütfen 0'dan farklı ve pozitif bir değer giriniz");
        }
        ;

        // Kullanıcının vermiş olduğu değerleri kullanarak üçgenin çevresini hesaplıyoruz.
        int ucgenCevreYarisi = (aKenari + bKenari + cKenari) / 2;

        // Çevresini bildiğimiz üçgenin alanını hesaplıyoruz ve konsola yazdırıyoruz.
        double ucgenAlanKarekok = ucgenCevreYarisi * ((ucgenCevreYarisi - aKenari) * (ucgenCevreYarisi - bKenari) * (ucgenCevreYarisi - cKenari));
        double ucgenAlan = Math.sqrt(ucgenAlanKarekok);

        System.out.println("Değerlerini Verdiğiniz Üçgenin Alanı: " + ucgenAlan);


    }
}
