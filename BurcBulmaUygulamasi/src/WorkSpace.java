import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {

        // Değişkenlerimizi Tanımlıyoruz
        int month, day;
        String burc = "";
        boolean isError = false;

        // Kullanıcıdan doğduğu ay ve gün bilgisini alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı \"rakamla\" yazınız: ");
        month = scanner.nextInt();

        System.out.println("Doğduğunuz günü \"rakamla\" yazınız: ");
        day = scanner.nextInt();

        // Bu bilgilere göre burcunu kullanıcıya söylüyoruz
        if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 20)) {
            burc = "Koç";
        } else if ((month == 4 && day >= 21 && day <= 30) || (month == 5 && day >= 1 && day <= 21)) {
            burc = "Boğa";
        } else if ((month == 5 && day >= 22 && day <= 31) || (month == 6 && day >= 1 && day <= 22)) {
            burc = "İkizler";
        } else if ((month == 6 && day >= 23 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            burc = "Yengeç";
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
            burc = "Aslan";
        } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
            burc = "Başak";
        } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
            burc = "Terazi";
        } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
            burc = "Akrep";
        } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
            burc = "Yay";
        } else if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 21)) {
            burc = "Oğlak";
        } else if ((month == 1 && day >= 22 && day <= 31) || (month == 2 && day >= 1 && day <= 19)) {
            burc = "Kova";
        } else if ((month == 2 && day >= 20 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) {
            burc = "Balık";
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Geçersiz tarih girdiniz.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}


