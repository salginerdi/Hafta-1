import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılını girmesini istiyoruz
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesaplamak için bir array(dizi) oluşturuyoruz.
        String[] zodyakListesi = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"
        };

        // Array'de tanımlanmış zodyak burçlarının index numaralarının 12 ile modunu alarak
        // kalanı konsola yazdırıyoruz.
        int zodyakIndex = dogumYili % 12;
        String cinZodyagi = zodyakListesi[zodyakIndex];

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);

        scanner.close();
    }
}
