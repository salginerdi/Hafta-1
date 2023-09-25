import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // Ürünlerimizin satış fiyatlarını belirliyoruz.
        // Fiyatlar(kg)
        double mandalina = 25.5;
        double muz = 30;
        double elma = 17.3;
        double erik = 45;
        double cilek = 32.5;

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan almak istediği miktarı kilogram cinsinden yazmasını istiyoruz.

        System.out.println("Kaç kilo mandalina almak istersiniz?");
        double mandalinaKilo = scanner.nextDouble();

        System.out.println("Kaç kilo muz almak istersiniz?");
        double muzKilo = scanner.nextDouble();

        System.out.println("Kaç kilo elma almak istersiniz?");
        double elmaKilo = scanner.nextDouble();

        System.out.println("Kaç kilo erik almak istersiniz?");
        double erikKilo = scanner.nextDouble();

        System.out.println("Kaç kilo cilek almak istersiniz?");
        double cilekKilo = scanner.nextDouble();

        // ürün fiyatıyla kullanıcının girmiş olduğu kilogram miktarını çarpıp, hepsini topluyoruz.

        double toplam = (mandalina * mandalinaKilo) + (muz * muzKilo) + (elma * elmaKilo) + (erik * erikKilo) + (cilek * cilekKilo);

        // Son olarak kullanıcı konsolda ödemesi gereken toplam miktarı görüyor.
        System.out.println("Toplam ödemeniz gereken tutar " + toplam + " TL'dir.");

        scanner.close();
    }
}
