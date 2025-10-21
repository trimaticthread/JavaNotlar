/*
Java’da her programın başlangıç noktası vardır.
Bu nokta da main metodudur.
Yani Java, bir dosyayı çalıştırırken ilk olarak main() metodunu arar.

Doğru olan yapı
public → Her yerden erişilebilir (JVM buradan erişir)
static → Nesne oluşturmadan çalışabilir
void → Geriye değer döndürmez
main → Java’nın özel başlangıç noktası
String[] args → Komut satırından alınan verileri taşır
 */

public class Main {
    public static void main(String[] args) {

        // Println kullanırsak satır atlayarak yazar

        System.out.println("Merhaba ");
        System.out.println("Java!");

        // Print kullanırsak yan yana yazar.

        System.out.print("Merhaba ");
        System.out.print("Java!");




    }
}


