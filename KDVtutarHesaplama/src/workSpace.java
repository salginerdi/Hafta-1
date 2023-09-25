import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // İlk olarak değişkenlerimizi oluşturuyoruz.
        double tutar, kdvOran = 0.18, kdvOran2 = 0.8, kdvTutar, kdvliTutar;

        // Scanner sınıfı ile kullanıcıdan değerimizi alıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        // KDV tutarımızı ve KDV'li tutarımızı hesaplıyoruz.
        if (tutar > 0 && tutar <= 1000) {
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'li tutar " + kdvliTutar + " olarak hesaplanmıştır.");
        } else if (tutar > 1000) {
            kdvTutar = tutar * kdvOran2;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'li tutar " + kdvliTutar + " olarak hesaplanmıştır.");

        } else {
            System.out.println("Lütfen 0'dan farklı ve pozitif bir değer giriniz!");
        }
    }
}
