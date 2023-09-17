import java.util.Scanner;

public class WorkSpace {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        // Kullanıcının üç hakkı varken döngü başlatılır.
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            // Kullanıcı adı ve parola doğru ise işlemler başlar.
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    // Kullanıcıya seçenekler sunulur.
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            // Para yatırma işlemi
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            // Para çekme işlemi
                            System.out.print("Para miktarı : ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            // Bakiye sorgulama işlemi
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            // Çıkış işlemi
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            // Geçersiz bir seçenek girildiğinde hata mesajı verilir.
                            System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                // Kullanıcı adı veya parola hatalı ise hakkı azaltılır.
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
