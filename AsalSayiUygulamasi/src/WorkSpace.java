public class WorkSpace {
    public static void main(String[] args) {
        // for döngüsü kurarak kuralı belirliyoruz.
        for (int sayi = 2; sayi <= 100; sayi++) {
            // sayıların asallığını kontrol etmek için bir boolean oluşturuyoruz.
            boolean asalMi = true;
            // 2'den başlayarak sayının sayının karesine kadar kontrol eden bir for döngüsü oluşturuyoruz.
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                // if koşuluyla sayının i ile bölümü 0 ise asal olmadığını belirtiyoruz
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            // if koşuluyla ile asal olan sayıları konsola yazdırıyoruz
            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
