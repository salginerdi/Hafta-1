import java.util.Scanner;

public class workSpace {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlıyoruz. r=yarıçap, a=merkez açı ölçüsüdür.
        double r;
        int a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yarıçap giriniz: ");
        r = input.nextDouble();

        if (r <= 0) {
            System.out.println("Lütfen 0'dan büyük ve pozitif bir yarıçap değeri giriniz.");
            return;
        }
        ;


        System.out.println("Lütfen bir merkez açı giriniz: ");
        a = input.nextInt();


        if (a <= 0) {
            System.out.println("Lütfen 0'dan büyük ve pozitif bir merkez açı değeri giriniz.");
            return;
        }
        ;

        double alan = (pi * (r * r) * a) / 360;

        System.out.println("Alan= " + alan);
    }
}
