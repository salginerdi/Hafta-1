import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // ilk olarak değişkenlerimizi tanımlıyoruz.
        int n1, n2, select;

        // Kullanıcıdan değer almak için Scanner sınıfı oluşturuyoruz.
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        // İşlem seçenekleri oluşturuyoruz.
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("Toplam: " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpım: " + (n1 * n2));
        } else if (select == 4) {
            System.out.println("Bölüm: " + (n1 / n2));
        } else {
            System.out.println("Lütfen 1 ve 4 arasında bir rakam seçiniz1");
        }
    }
}
