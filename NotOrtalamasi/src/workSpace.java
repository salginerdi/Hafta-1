import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // Değişkenleri oluşturuyoruz.
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı tanımladık.
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri alıyoruz.
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();


        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();


        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();


        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();


        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();


        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        // Kullanıcıdan aldığımız değerleri topluyoruz
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        // Ortalamayı bulmak için ders sayısına bölüyoruz.
        double ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        // Sınıf geçme durumunu belirtiyoruz.
        String durum = ortalama >= 60 ? " Sınıfı Geçtiniz!" : " Sınıfta Kaldınız!";
        System.out.println("Durumunuz: " + durum);
    }
}
