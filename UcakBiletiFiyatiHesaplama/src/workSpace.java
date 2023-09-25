import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gideceği kilometre bilgisini istiyoruz
        System.out.println("Lütfen gideceğiniz mesafeyi km türünden giriniz: ");
        float distance = scanner.nextFloat();
        scanner.nextLine();

        // iki opsiyon belirledik sadece gidiş veya gidiş-dönüş
        String options = "Sadece gidiş yönlü bilet almak için: 1 " + "Gidiş-dönüş bilet almak için: 2 ";

        System.out.println(options);
        //Kullanıcıdan bu opsiyonlardan birini seçmesini istiyoruz.
        System.out.println("Lütfen bir seçim yapınız: ");
        String choice = scanner.nextLine();

        // Girilen kilometre değerinin sıfırdan büyük olması koşulu var, kullanıcı eğer eksi bir değer girerse direkt
        // else bloğuna atarak hatalı veri girdiğine dair bilgilendirme yazısı paylaşıyoruz.
        if (distance > 0) {

            System.out.println("Yaşınızı giriniz: ");
            int age = scanner.nextInt();
            // Kullanıcıdan yaşını istiyoruz
            double totalAmount = 0;

            switch (choice) {
                // Eğer kullanıcı sadece gidiş bileti alacaksa aşağıdaki blog çalışır.
                case ("1"):
                    // Eğer yaşı 12'den küçükse %50 indirim uyguluyoruz.
                    if (age <= 12) {
                        // Kilometre başı ücretimiz 10TL
                        totalAmount = (distance * 10) * 0.5;
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);
                    } else if (age <= 24) {
                        // Eğer yaşı 24'den küçükse %10 indirim uyguluyoruz.
                        totalAmount = (distance * 10) * 0.1;
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);
                    } else if (age >= 65) {
                        // Eğer 65 yaşından büyükse %30 indirim uyguluyoruz.
                        totalAmount = (distance * 10) * 0.3;
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);
                        // Belirtilen yaş aralığına girmediğinde indirimlerden faydalanamıyor.
                    } else {
                        totalAmount = (distance * 10);
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);
                    }
                    break;

                // Kullanıcı gidiş dönüş bileti alacaksa mesafe ücretimizi ikiyle çarpıp bunun üzerinden %20 ve
                //  yaşla ilgili ekstra indirimlerimizi uyguluyoruz
                case ("2"):
                    if (age < 12) {
                        totalAmount = (((distance * 10) * 2) * 0.5) * 0.2;
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);
                    } else if (age >= 12 && age <= 24) {
                        totalAmount = (((distance * 10) * 2) * 0.1) * 0.2;
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);
                    } else if (age >= 65) {
                        totalAmount = (((distance * 10) * 2) * 0.3) * 0.2;
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);

                    } else {
                        totalAmount = (distance * 10) * 0.2;
                        System.out.println("Ödemeniz gereken tutar: " + totalAmount);
                    }
                    break;
                // Eğer kullanıcımız 1 ve 2 dışında bir değer girerse aşağıdaki uyarıyı alıyor.
                default: {
                    System.out.println("Lütfen geçerli bir işlem numarası giriniz");
                    break;
                }

            }
            // Kullanıcımız kilometre değerini negatif bir sayı girerse aşağıdaki uyarıyı alıyor.
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
        scanner.close();

    }
}
