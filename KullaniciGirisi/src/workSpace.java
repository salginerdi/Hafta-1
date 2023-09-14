import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // Değişkenlerimizi oluşturuyoruz
        String userName, password;

        // Scanner sınıfıyla kullanıcıdan kullanıcı adı ve şifresini girmesini istiyoruz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.println("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();

        // Stringlerde equals metodu ile eşitliği kontrol ediyoruz.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarıyla yapılmıştır.");
        } else {
            System.out.println("Kullanıcı adı veya şifreniz hatalıdır!");

            // Şifreyi sıfırlama istenip istenmediğini sormak için kullanıcıya soru soruyoruz
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");
            String resetChoice = input.nextLine();

            if (resetChoice.equalsIgnoreCase("Evet")) {
                // Yeni şifreyi girmesini istiyoruz.
                System.out.println("Yeni şifre giriniz: ");
                String newPassword = input.nextLine();

                // Eski şifre ile yeni şifrenin aynı olup olmadığını kontrol ediyoruz
                if (!newPassword.equals(password)) {
                    System.out.println("Şifre oluşturuldu.");
                    password = newPassword; // Yeni şifreyi kaydediyoruz.
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        }
    }
}






