public class PrimitifVeriTipleri {
     public static void main(String[] args) {
         // ----------- TAMSAYI TİPLERİ -----------
         // 1. byte: 8-bit, -128 ile 127 arası değerleri saklar.
         byte yas = 25;
         System.out.println("byte örneği (yas): " + yas);

         // 2. short: 16-bit, -32,768 ile 32,767 arası
         short ogrenciSayisi = 32000;
         System.out.println("short örneği (ogrenciSayisi): " + ogrenciSayisi);

         // 3. int: 32-bit, en sık kullanılan tamsayı tipi
         int maas = 50000;
         System.out.println("int örneği (maas): " + maas);

         // 4. long: 64-bit, çok büyük tamsayılar için
         long evrenYasi = 13800000000L; // L son ek zorunlu
         System.out.println("long örneği (evrenYasi): " + evrenYasi);


         // ----------- ONDALIKLI SAYI TİPLERİ -----------
         // 5. float: 32-bit, yaklaşık 6–7 basamak duyarlılık
         float sicaklik = 36.6f; // f son ek zorunlu
         System.out.println("float örneği (sicaklik): " + sicaklik);

         // 6. double: 64-bit, yaklaşık 15–16 basamak duyarlılık
         double pi = 3.141592653589793;
         System.out.println("double örneği (pi): " + pi);


         // ----------- MANTIKSAL TİP -----------
         // 7. boolean: sadece true veya false değeri alır
         boolean girisBasarili = true;
         boolean sistemAktifMi = false;
         System.out.println("boolean örneği (girisBasarili): " + girisBasarili);
         System.out.println("boolean örneği (sistemAktifMi): " + sistemAktifMi);


         // ----------- KISA ÖZET -----------
         System.out.println("\n--- Veri Tipleri Özeti ---");
         System.out.println("byte  -> Küçük tamsayılar için (örneğin yaş).");
         System.out.println("short -> Orta büyüklükte sayılar için.");
         System.out.println("int   -> Genel amaçlı tamsayılar (varsayılan).");
         System.out.println("long  -> Çok büyük sayılar (ör. evren yaşı).");
         System.out.println("float -> Kesirli ama hassasiyet düşük (ör. sıcaklık).");
         System.out.println("double-> Daha hassas ondalıklı sayılar (ör. PI değeri).");
         System.out.println("boolean -> Mantıksal kararlar (doğru/yanlış).");
     }
}
