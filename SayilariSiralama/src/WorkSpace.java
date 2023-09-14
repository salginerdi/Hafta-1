import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        // Değişkenlerimizi oluşturuyoruz.
        int a, b, c;

        // Kullanıcıdan 3 tane sayı girmesini istiyoruz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir a sayısı giriniz: ");
        a = input.nextInt();

        System.out.println("Lütfen bir b sayısı giriniz: ");
        b = input.nextInt();

        System.out.println("Lütfen bir c sayısı giriniz: ");
        c = input.nextInt();


        // Bu sayıları büyükten küçüğe sıralıyoruz

        if (a > b && b > c) {
            System.out.println("Büyükten küçüğe doğru sıralama: a>b>c şeklindedir.");
        } else if (a < b && a > c) {
            System.out.println("Büyükten küçüğe doğru sıralama: b>a>c şeklindedir.");
        } else if (a < c && b > c) {
            System.out.println("Büyükten küçüğe doğru sıralama: b>c>a şeklindedir.");
        } else if (a < b && b < c) {
            System.out.println("Büyükten küçüğe doğru sıralama: c>b>a şeklindedir.");
        } else if (a > b && c > a) {
            System.out.println("Büyükten küçüğe doğru sıralama: c>a>b şeklindedir.");
        } else if (a == b && b == c) {
            System.out.println("Sayılar eşittir: a=b=c");
        } else if (a == b && b > c) {
            System.out.println("a ve b sayıları eşit, c'den büyüktür. a=b>c");
        } else if (a == c && b < c) {
            System.out.println("a ve c sayıları eşit, b'den büyüktür. a=c>b");
        } else if (b == c && a < b) {
            System.out.println("b ve c sayıları eşit, a'dan büyüktür. b=c>a");
        } else if (a == b && b < c) {
            System.out.println("a ve b sayıları eşit, c'den küçüktür. a=b<c");
        } else if (a == c && c < b) {
            System.out.println("a ve c sayıları eşit, b'den küçüktür. a=c<b");
        } else if (b == c && b < a) {
            System.out.println("b ve c sayıları eşit, a'dan küçüktür. b=c<a");
        }

    }
}
