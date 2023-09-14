import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {

        // değişkenlerimizi tanımlıyoruz ve başlangıçta toplamı 0'a eşitliyoruz.
        int number, total = 0;

        // kullanıcıdan bir sayı girmesini istiyoruz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        // sayının pozitifliğini kontrol ediyoruz.
        if (number <= 0) {
            System.out.println("Lütfen 0'dan farklı ve pozitif bir değer giriniz!");
            // eğer sayı pozitifse kalansız bölenlerini buluyoruz ve bunu toplama eşitliyoruz.
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }
            // girdiğimiz sayı toplam sayıya eşitse mükemmel sayı değilse mükemmel sayı değil ifadesini konsola yazdırıyoruz.

            if (number == total) {
                System.out.println(number + " mükemmel sayıdır.");
            } else {
                System.out.println(number + " mükemmel sayı değildir.");
            }
        }


    }
}
