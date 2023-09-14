import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // değişkenlerimizi tanımlıyoruz.
        int k;
        int total = 0;
        double counter = 0;


        // Kullanıcıdan sayı girmesini istiyoruz.
        System.out.println("Sayı Giriniz: ");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();

        // 0 etkisiz eleman olduğu için döngümüzü 1'den başlatıyoruz ve k'ya kadar olan sayılardan 3 ve 4'e bölünebilen
        // koşulunu yakalıyoruz.
        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                // Sayıların toplamını total değişkeniyle, kaç tane sayı olduğunu da counter değişkeniyle tutuyoruz.
                total += i;
                counter++;

            }

        }
        // Sayacımızın 0'dan büyük olduğu durumlarda sayıların toplamını sayı adedine bölerek ortalamayı buluyoruz.
        if (counter > 0) {
            double average = total / counter;
            System.out.println("0'dan girdiğiniz sayıya kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması: " + average);
            // Eğer girdiğimiz değere kadar 3 ve 4'e ortak bölünen hiçbir sayı yoksa aşağıdaki bloğumuz çalışır.
        } else {
            System.out.println("0'dan girdiğiniz sayıya kadar olan sayılardan 3 ve 4'e tam bölünen hiçbir sayı yok");
        }
    }
}
