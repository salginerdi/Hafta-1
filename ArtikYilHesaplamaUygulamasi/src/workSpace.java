import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan yıl bilgisini alıyoruz.
        System.out.println("Yıl Giriniz: ");
        int year = scanner.nextInt();

        // Artık yıllar 4'ün katlarıdır. Fakat 100'ün katı olan yıllardan sadece 400'e kalansız bölünebilenler
        // artık yıl olarak adlandırılır. Aşağıda bu kuralı uyguladık.

        // Kullanıcıya girdiği yılın artık yıl olup olmadığı bilgisini veriyoruz.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
        scanner.close();
    }
}