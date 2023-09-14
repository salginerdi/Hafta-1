import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava Sıcaklığını Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz. İyi eğlenceler!");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz. İyi eğlenceler!");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsiniz. İyi eğlenceler!");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz. İyi eğlenceler!");
        }
    }
}
