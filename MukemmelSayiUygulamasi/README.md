Bu Java programı, kullanıcıdan bir tam sayı girmesini isteyen bir konsol uygulamasıdır ve
işleyişi şu şekildedir;

Kullanıcıdan bir tam sayı girmesi istenir ve bu değer "number" adlı bir değişkene atanır.

Girilen sayının pozitifliği kontrol edilir. Eğer girilen sayı 0 veya daha küçükse, "Lütfen pozitif bir tam sayı giriniz!" mesajı ekrana yazdırılır ve program sonlandırılır. Bu, negatif veya sıfır gibi geçersiz girişleri engeller.

Eğer girilen sayı pozitif ise, 1'den başlayarak sayının kendisi hariç pozitif bölenlerini bulmak için bir döngü kullanılır.

Her bölen, girilen sayıya bölündüğünde kalanın 0 olup olmadığı kontrol edilir. Eğer kalan 0 ise, bu sayı bir böleni temsil eder ve toplam değişkenine eklenir.

Döngü tamamlandığında, toplam değişkeni, girilen sayının pozitif bölenlerinin toplamını içerir.

Son olarak, girilen sayı ile toplam karşılaştırılır. Eğer girilen sayı toplam ile eşitse, bu sayı mükemmel bir sayıdır ve "mükemmel sayıdır." mesajı ekrana yazdırılır. Eğer eşit değilse, "mükemmel sayı değildir." mesajı ekrana yazdırılır.
