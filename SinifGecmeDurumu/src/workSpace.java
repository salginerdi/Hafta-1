import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // Değişkenleri oluşturuyoruz.
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı tanımladık.
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri alıyoruz ve notların geçerli olduğunu kontrol ediyoruz.
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz Matematik Notu! Lütfen 0 ile 100 arasında bir not giriniz.");
            return; // Geçersiz not girildiği için programı sonlandır.
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz Fizik Notu! Lütfen 0 ile 100 arasında bir not giriniz.");
            return;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz Kimya Notu! Lütfen 0 ile 100 arasında bir not giriniz.");
            return;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz Türkçe Notu! Lütfen 0 ile 100 arasında bir not giriniz.");
            return;
        }

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();
        if (tarih < 0 || tarih > 100) {
            System.out.println("Geçersiz Tarih Notu! Lütfen 0 ile 100 arasında bir not giriniz.");
            return;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz Müzik Notu! Lütfen 0 ile 100 arasında bir not giriniz.");
            return;
        }

        // Kullanıcıdan aldığımız geçerli değerleri topluyoruz.
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        // Ortalamayı bulmak için ders sayısına bölüyoruz.
        double ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        // Sınıf geçme durumunu belirtiyoruz.
        String durum = ortalama >= 60 ? " Sınıfı Geçtiniz!" : " Sınıfta Kaldınız!";
        System.out.println("Durumunuz: " + durum);
    }
}
