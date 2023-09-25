import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Kullanıcıdan vücut ağırlığını ve boy uzunluğunu istiyoruz.
        // Sonucun doğru hesaplanabilmesi için nokta değil virgül kullanmalısınız.
        // Yanlış: 1.78 , Doğru: 1,78 || Yanlış: 77.6 , Doğru: 77,6

        System.out.println("Lütfen vücut ağırlığınızı giriniz(Ör:77,5): ");
        double bodyWeight;
        bodyWeight = scanner.nextDouble();

        System.out.println("Lütfen boy uzunluğunuzu giriniz(Ör:1,80): ");
        double heightLength;
        heightLength = scanner.nextDouble();

        // Sonucu hesaplıyoruz ve ilgili blogu konsola yazdırıyoruz.

        double result = bodyWeight / (heightLength * heightLength);

        if (result < 18.5) {
            System.out.println("Vücut Kitle Endeksiniz: " + result
                    + " ideal kilo altındasınız. ");
        } else if (18.5 <= result && result <= 24.9) {
            System.out.println("Vücut Kitle Endeksiniz: " + result
                    + " ideal kilodasınız. ");
        } else if (25 <= result && result <= 29.9) {
            System.out.println("Vücut Kitle Endeksiniz: " + result
                    + " ideal kilonun üstündesiniz. ");
        } else if (30 <= result && result <= 39.9) {
            System.out.println("Vücut Kitle Endeksiniz: " + result
                    + " ideal kilonun çok üstündesiniz. (Obez) ");
        } else {
            System.out.println("Vücut Kitle Endeksiniz: " + result
                    + " ideal kilonun aşırı üstündesiniz. (Morbid Obez) ");
        }

        scanner.close();
    }
}
