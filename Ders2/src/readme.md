## Konu Başlıkları

1.  [Tanımlayıcılar (Identifiers)](#1-tanımlayıcılar-identifiers)
2.  [Değişkenler (Variables)](#2-değişkenler-variables)
3.  [Sabitler (Constants)](#3-sabitler-constants)
4.  [İsimlendirme Kuralları (Naming Conventions)](#4-isimlendirme-kuralları-naming-conventions)
5.  [Temel (Primitif) Veri Tipleri](#5-temel-primitif-veri-tipleri)
6.  [Literaller (Literals)](#6-literaller-literals)
7.  [Aritmetik Operatörler](#7-aritmetik-operatörler)
8.  [Atama ve İşlem Operatörleri](#8-atama-ve-i̇şlem-operatörleri)
9.  [Tip Dönüşümleri (Type Conversion/Casting)](#9-tip-dönüşümleri-type-conversioncasting)
10. [Kullanıcıdan Veri Alma (`Scanner` Sınıfı)](#10-kullanıcıdan-veri-alma-scanner-sınıfı)
11. [Sık Yapılan Hatalar](#11-sık-yapılan-hatalar)



# Konu 1: Tanımlayıcılar (Identifiers)

**Tanımlayıcı (Identifier)**, bir değişkeni, metodu, sınıfı veya herhangi bir Java bileşenini adlandırmak için kullandığımız isimdir.

PDF'e göre bir tanımlayıcı, harfler, rakamlar, alt çizgiler (`_`) ve dolar işaretlerinden (`$`) oluşan bir karakter dizisidir.

### Tanımlayıcı Kuralları

Java'da tanımlayıcılar için uyulması gereken katı kurallar vardır:

1.  Bir tanımlayıcı harf, alt çizgi (`_`) veya dolar işareti (`$`) ile başlamalıdır.
2.  Asla bir rakamla başlayamaz.
3.  Java'nın ayrılmış bir anahtar kelimesi (reserved word) olamaz (Örn: `public`, `class`, `int`).
4.  `true`, `false` veya `null` kelimeleri olamaz.
5.  İstenilen uzunlukta olabilir (bir uzunluk sınırı yoktur).

### Geçerli ve Geçersiz Örnekler

| Geçerli Tanımlayıcılar | Geçersiz Tanımlayıcılar | Neden Geçersiz? |
| :--- | :--- | :--- |
| `radius` | `1radius` | Rakamla başlıyor |
| `_sayi` | `class` | Ayrılmış kelime (reserved word) |
| `$fiyat` | `true` | Özel bir kelime (literal) |
| `kullaniciAdi1` | `not-ortalamasi` | `-` (tire) karakteri içeremez (sadece harf, rakam, _, $) |

**Önemli Not (Naming Convention):** `_` ve `$` ile başlamak teknik olarak geçerli olsa da, Java isimlendirme geleneklerine (naming conventions) göre değişken isimleri genellikle küçük harfle başlar (örn: `radius`, `kullaniciAdi`). `$` işareti genellikle otomatik üretilen kodlarda kullanılır ve manuel olarak kullanılması önerilmez.

# Konu 2: Primitif (İlkel) Veri Tipleri

Java’da verilerle çalışmak için kullanılan en temel yapı taşlarıdır.

Bu tipler Java tarafından önceden tanımlanmıştır (built-in) ve doğrudan hafızada belirli bir yer kaplarlar.

İlkel tipler, nesne değildir, yalnızca değer saklarlar. Java’da 8 adet primitif veri tipi bulunur:

| Kategori | Veri Tipi | Açıklama |
| :--- | :--- | :--- |
| Tamsayı Tipleri | `byte`, `short`, `int`, `long` | Tam sayıları tutar (negatif/pozitif) |
| Ondalıklı Tipler | `float`, `double` | Noktalı (kesirli) sayıları tutar |
| Karakter Tipi | `char` | Tek bir karakter tutar |
| Mantıksal Tip | `boolean` | `true` (doğru) veya `false` (yanlış) tutar |

## 🧩 Tamsayı Tipleri

1.  **`byte`**
    * **Boyut:** 8 bit
    * **Aralık:** -128 ile 127
    * **Amaç:** Bellekten tasarruf sağlamak için küçük tamsayıları saklamak.
    * **Kullanım Alanı:** Büyük veri dizilerinde veya hafıza kısıtlı sistemlerde (ör. sensör verileri).
    * **Avantajı:** Daha az yer kaplar (1 byte).

2.  **`short`**
    * **Boyut:** 16 bit
    * **Aralık:** -32,768 ile 32,767
    * **Amaç:** Orta büyüklükteki tamsayıları tutmak.
    * **Kullanım Alanı:** `byte`’tan büyük ama `int`’ten küçük değerlerde, RAM tasarrufu gerektiğinde.
    * **Not:** Günlük Java uygulamalarında çok sık kullanılmaz.

3.  **`int`**
    * **Boyut:** 32 bit
    * **Aralık:** -2,147,483,648 ile 2,147,483,647
    * **Amaç:** En yaygın tamsayı veri tipidir.
    * **Kullanım Alanı:** Sayı sayma, döngü sayaçları, yaş, skor, miktar gibi çoğu durumda.
    * **Avantajı:** Performans ve kullanım kolaylığı açısından idealdir.
    * **Not:** Varsayılan tamsayı tipi `int`’tir.

4.  **`long`**
    * **Boyut:** 64 bit
    * **Aralık:** -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807
    * **Amaç:** Çok büyük tamsayı değerlerini saklamak.
    * **Kullanım Alanı:** Finansal işlemler, sayaçlar, zaman hesaplamaları.
    * **Not:** Sayının sonuna `L` veya `l` eklenir (ör. `long big = 123456789L;`).

## 🧮 Ondalıklı (Floating-Point) Tipler

5.  **`float`**
    * **Boyut:** 32 bit
    * **Hassasiyet:** Yaklaşık 6–7 basamaklı duyarlılık.
    * **Amaç:** Ondalıklı (kesirli) sayıları saklamak, bellekten tasarruf sağlamak.
    * **Kullanım Alanı:** Grafik işlemleri, ölçüm verileri, bilimsel hesaplamalar.
    * **Not:** Değerin sonuna `f` veya `F` eklenir (`float pi = 3.14f;`).
    * **Dezavantaj:** Yuvarlama hatalarına daha açıktır.

6.  **`double`**
    * **Boyut:** 64 bit
    * **Hassasiyet:** Yaklaşık 15–16 basamaklı duyarlılık.
    * **Amaç:** Kesinliği yüksek ondalıklı sayılar tutmak.
    * **Kullanım Alanı:** Finans, mühendislik, bilimsel hesaplamalar.
    * **Not:** Java’da varsayılan ondalıklı sayı tipi `double`’dır.
    * **Avantaj:** Daha hassas sonuçlar üretir, `float`’tan daha yaygın kullanılır.

## ⚙️ Mantıksal Tip

7.  **`boolean`**
    * **Boyut:** 1 bit (teorik olarak)
    * **Değer:** `true` veya `false`
    * **Amaç:** Mantıksal kararlar almak, koşullarda kullanmak.
    * **Kullanım Alanı:** `if`, `while`, `for` gibi kontrol yapılarında koşul ifadesi olarak.
    * **Avantaj:** Yalnızca iki olasılık içerdiğinden hızlı ve net işlem sağlar.

*(Not: `char` tipi, ilk tabloda belirtildiği gibi, 8. primitif tiptir. Tek bir karakteri saklar, örn: `char harf = 'A';`)*

## 💡 Özet Tablosu

| Veri Tipi | Boyut | Aralık / Değer | Kullanım Amacı |
| :--- | :--- | :--- | :--- |
| `byte` | 8 bit | -128 ↔ 127 | Bellek dostu küçük tamsayılar |
| `short` | 16 bit | -32,768 ↔ 32,767 | Orta ölçekli sayılar |
| `int` | 32 bit | ~±2 milyar | Genel amaçlı tamsayılar |
| `long` | 64 bit | Çok büyük sayılar | Zaman, finansal hesaplamalar |
| `float` | 32 bit | ~6 basamaklı ondalık | Yaklaşık değerler |
| `double` | 64 bit | ~15 basamaklı ondalık | Hassas bilimsel işlemler |
| `boolean` | 1 bit | `true` / `false` | Koşullar ve mantıksal işlemler |

## 3. Sabitler (Constants)

Java'da **sabitler (constants)**, program çalıştığı sürece **değeri değişmeyen** değişkenlerdir.  
Bir sabit, **`final`** anahtar kelimesi kullanılarak tanımlanır.

---

### 🔹 Tanım

Sabitler, bir kez atandıktan sonra **yeniden değer verilemeyen değişkenlerdir**.  
Bu özellik, özellikle **matematiksel değerler**, **sabit oranlar**, veya **uygulama ayarları** gibi
program boyunca aynı kalması gereken verilerde kullanılır.

Örnek sözdizimi:

```java
final veriTipi SABIT_ADI = değer; 
```
## Kullanım Amaçları

* **Değişmemesi gereken değerleri korumak**
    * Örneğin: `PI`, `MAX_SPEED`, `TAX_RATE`
* **Kodun okunabilirliğini artırmak**
    * “120” yerine `MAX_SPEED` yazmak kodu daha anlamlı yapar.
* **Bakımı kolaylaştırmak**
    * Tek bir sabit değişince tüm proje güncellenir.
* **Hataları önlemek**
    * Yanlışlıkla değer atamayı engeller.

## Özellikler

| Özellik | Açıklama |
| :--- | :--- |
| Anahtar kelime: `final` | Değer bir kez atanır, değiştirilemez |
| İsimlendirme: `BÜYÜK_HARFLER` ve `_` kullanılır | Örn: `MAX_SPEED`, `PI` |
| İlk değer ataması zorunludur | Aksi halde derleme hatası oluşur |
| Nesneye ait veya sınıfa ait olabilir | Örn: `static final` sabitler |

## 4. İsimlendirme Kuralları (Naming Conventions)

Java'da **isimlendirme kuralları**, kodun daha **okunabilir**, **anlaşılır** ve **profesyonel** olmasını sağlar.  
Doğru isimlendirme, hem hata riskini azaltır hem de büyük projelerde düzeni korur.

---

### 🔹 Tanım

**İsimlendirme kuralları**, değişkenlerin, sınıfların, metotların ve sabitlerin
nasıl adlandırılması gerektiğini belirleyen genel kurallardır.

💡 Java büyük/küçük harfe duyarlıdır (`age` ≠ `Age` ≠ `AGE`).

---

### 🔹 Genel Kurallar

| Kural | Açıklama |
|-------|-----------|
| İsimler harf, rakam, `_` veya `$` içerebilir | Ancak **rakamla başlayamaz** |
| Boşluk, noktalama işareti, Türkçe karakter kullanılmaz | ✅ `studentName`, ❌ `öğrenci adı` |
| Anahtar kelimeler kullanılamaz | ❌ `int class = 5;` hatalıdır |
| Uzun ama anlamlı isimler tercih edilir | ✅ `totalScore`, ❌ `ts` |
| Java büyük/küçük harf duyarlıdır | `Name` ve `name` farklı değişkenlerdir |

---

### 🔹 İsimlendirme Biçimleri

| Tür | Biçim | Örnek | Açıklama |
|------|--------|--------|-----------|
| **Değişken (Variable)** | `camelCase` | `studentAge`, `totalPrice` | Küçük harfle başlar, sonraki kelimeler büyük harfle |
| **Metot (Method)** | `camelCase()` | `getName()`, `calculateArea()` | Küçük harfle başlar, fiil içerir |
| **Sınıf (Class)** | `PascalCase` | `StudentInfo`, `CarModel` | Her kelimenin ilk harfi büyük |
| **Sabit (Constant)** | `UPPER_CASE` | `MAX_SPEED`, `PI`, `TAX_RATE` | Tümü büyük harf, kelimeler `_` ile ayrılır |
| **Paket (Package)** | `lowercase` | `com.company.project` | Tamamen küçük harf, genelde ters alan adı yapısında |

---

### 🔹 Örnek Karşılaştırmalar

| Doğru ✅ | Yanlış ❌ | Açıklama |
|----------|-----------|-----------|
| `studentName` | `Studentname` | Değişken küçük harfle başlamalı |
| `CarModel` | `car_model` | Sınıf adı PascalCase olmalı |
| `MAX_SPEED` | `MaxSpeed` | Sabitler büyük harfle yazılır |
| `calculateTotal()` | `CalculateTotal()` | Metot adı küçük harfle başlamalı |
| `userLogin` | `userlogin` | İkinci kelimenin başı büyük olmalı (camelCase) |

---

### 🔹 İsimlendirme Tavsiyeleri

✅ **Anlamlı** isimler kullan:
> `score`, `age`, `customerName` gibi.

✅ **Kısaltma** yerine açık yaz:
> `totalPrice` → anlaşılır,  
> `tp` → belirsiz.

✅ **Fiil** ile başlayan metot isimleri:
> `printMessage()`, `getName()`, `setAge()`

✅ **Çok kelimeli sabitler için `_` kullan:**
> `MIN_PASSWORD_LENGTH`, `DEFAULT_COLOR`, `MAX_SPEED`

---

### 🔹 Dikkat Edilmesi Gerekenler

⚠️ Türkçe karakter kullanma (`ş, ı, ü, ö, ç, ğ`).  
⚠️ Boşluk veya özel karakter kullanma (`#`, `-`, `!`, `@` vb.).  
⚠️ Anahtar kelimeleri isim olarak verme (`int`, `class`, `static` vb.).  
⚠️ Uzun ama anlamsız değişkenlerden kaçın.

---

### 💬 Özet

| Kategori | Biçim | Örnek |
|-----------|-------|--------|
| **Değişken** | `camelCase` | `studentName` |
| **Metot** | `camelCase()` | `getScore()` |
| **Sınıf** | `PascalCase` | `CarModel` |
| **Sabit** | `UPPER_CASE` | `MAX_SPEED` |
| **Paket** | `lowercase` | `com.stasports.app` |

---


## 5. Literaller (Literals)

Java’da **literal**, bir değişkene **doğrudan atanan sabit değer** demektir.  
Yani programda **elle yazdığın** (hard-coded) değerdir.

💡 Kısaca: Literal = Programda **ne görüyorsan, o değerin kendisi.**

Örnek:
```java
int yas = 18;        // 18 bir tamsayı literalidir.
double pi = 3.14;    // 3.14 bir ondalık (double) literalidir.
char harf = 'A';     // 'A' bir karakter literalidir.
String ad = "Toprak"; // "Toprak" bir metin literalidir.
```

## 6. Aritmetik Operatörler ve İfadeler

Java’da **aritmetik operatörler**, sayısal değerler üzerinde **matematiksel işlemler** yapmak için kullanılır.  
Bu işlemler programlarda en sık kullanılan temel yapı taşlarındandır.  
Bir veya birden fazla değerin (operand) **toplanması, çıkarılması, çarpılması veya bölünmesi** işlemlerini gerçekleştirir.

Aritmetik operatörler sayısal veri tipleriyle (`int`, `float`, `double`, `long`, vb.) kullanılabilir.

---

### 🔹 Aritmetik Operatörler Nedir?

Aritmetik operatörler, bir ifadede matematiksel işlem yapmayı sağlar.  
Java’da 5 temel aritmetik operatör bulunur:

| Operatör | Adı | Açıklama | Örnek Kullanım | Sonuç |
|-----------|-----|-----------|----------------|--------|
| `+` | Toplama | İki sayıyı toplar | `5 + 3` | `8` |
| `-` | Çıkarma | Bir sayıdan diğerini çıkarır | `10 - 4` | `6` |
| `*` | Çarpma | İki sayıyı çarpar | `6 * 2` | `12` |
| `/` | Bölme | Bir sayıyı diğerine böler | `8 / 2` | `4` |
| `%` | Mod (Kalan) | Bölme işleminden kalanı verir | `10 % 3` | `1` |

---

### 🔹 1. Toplama Operatörü (`+`)

**Görevi:**  
İki sayıyı toplar veya metinlerle (String) birlikte kullanıldığında **birleştirme (concatenation)** işlemi yapar.

**Açıklama:**
- Sayısal tiplerde → matematiksel toplama yapar.
- Metin tipinde (`String`) → yazıları birleştirir.

**Örnek Açıklama:**
- `5 + 3` → **8** sonucu verir.
- `"Java" + " Rocks!"` → **"Java Rocks!"** sonucu verir.

**Not:**  
Toplama operatörü `String` ifadelerde soldan sağa çalışır.  
Yani `"Sonuç: " + 5 + 3` çıktısı `"Sonuç: 53"` olur.  
Matematiksel işlem için parantez kullanılmalıdır: `"Sonuç: " + (5 + 3)` → `"Sonuç: 8"`.

---

### 🔹 2. Çıkarma Operatörü (`-`)

**Görevi:**  
Bir sayıdan diğerini çıkarmak için kullanılır.

**Açıklama:**
- Pozitif veya negatif sonuçlar verebilir.
- Tek operand ile kullanıldığında **işaret değiştirme (negatif yapma)** işlemi yapar.

**Örnek Açıklama:**
- `10 - 4` → **6**
- `-a` → a’nın işaretini değiştirir (örneğin a=5 → -a=-5)

**Not:**  
Çıkarma operatörü yalnızca sayısal tiplerle kullanılabilir.

---

### 🔹 3. Çarpma Operatörü (`*`)

**Görevi:**  
İki veya daha fazla sayıyı çarpmak için kullanılır.

**Açıklama:**
- Çarpma operatörü tüm sayısal tiplerde geçerlidir (`int`, `float`, `double`, `long`).
- İfadelerde işlem önceliği yüksektir.

**Örnek Açıklama:**
- `4 * 3` → **12**
- `2 * 3 * 4` → **24**
- `a * b + c` → önce çarpma yapılır, sonra toplama.

**Not:**  
Çarpma işlemi, işlem önceliği sırasına göre **toplamadan ve çıkarmadan önce** yapılır.

---

### 🔹 4. Bölme Operatörü (`/`)

**Görevi:**  
Bir sayıyı diğerine bölmek için kullanılır.

**Açıklama:**
- Eğer iki **tamsayı (int)** bölünüyorsa, sonuç **tamsayı** olur ve **ondalık kısmı atılır.**
- Eğer işlemlerden biri `double` veya `float` ise, sonuç **ondalıklı** olur.

**Örnek Açıklama:**
- `10 / 2` → **5**
- `10 / 3` → **3** (ondalık kısmı atılır)
- `(double)10 / 3` → **3.3333**
- `float sonuc = 7f / 2f;` → **3.5**

**Not:**  
Sıfıra bölme (`/ 0`) hatadır. Java bu durumda `ArithmeticException` hatası verir.

---

### 🔹 5. Mod (Kalan) Operatörü (`%`)

**Görevi:**  
Bir bölme işleminin **kalanını** hesaplar.

**Açıklama:**
- Genellikle çift/tek sayı kontrolü, döngü düzeni, zaman hesaplamalarında kullanılır.
- İşlem sonucu, **bölme işleminin kalan kısmıdır.**

**Örnek Açıklama:**
- `10 % 3` → **1**
- `9 % 2` → **1** (tek sayı olduğu için kalan 1’dir)
- `8 % 4` → **0** (çift sayı olduğu için tam bölünür)

**Kullanım Alanları:**
- Çift/tek kontrolü → `if (sayi % 2 == 0)`
- Dakika/saniye hesaplama → `toplamSaniye % 60`

---

### 🔹 6. Artırma ve Azaltma Operatörleri

Bu operatörler aritmetik işlemler içinde **sık kullanılan özel kısayollardır**.

| Operatör | Açıklama | Kullanım Biçimi |
|-----------|-----------|-----------------|
| `++` | Değeri 1 artırır | `x++` veya `++x` |
| `--` | Değeri 1 azaltır | `x--` veya `--x` |

**Farkı:**
- `x++` → önce değeri kullanır, sonra 1 artırır.
- `++x` → önce artırır, sonra değeri kullanır.

**Örnek Açıklama:**
- `int x = 5; y = x++;` → `y = 5`, `x = 6`
- `int x = 5; y = ++x;` → `y = 6`, `x = 6`

---

### 🔹 7. Aritmetik İfadeler (Arithmetic Expressions)

**Açıklama:**
Bir veya birden fazla aritmetik operatörün kullanıldığı matematiksel yapılardır.  
Sonuç olarak **tek bir değer üretirler.**

**Örnek Açıklama:**
- `a + b * c`
- `(x + y) / 2`
- `(sayi1 + sayi2) % 10`

İfadelerde işlem önceliği sırasıyla:
1. Parantez içi işlemler
2. Çarpma, bölme, mod
3. Toplama, çıkarma

**Yani:**  
`a + b * c` ifadesinde önce `b * c`, sonra `a + ...` işlemi yapılır.

---

### 🔹 8. İşlem Önceliği (Operator Precedence)

Bazı operatörler diğerlerinden önce çalışır.  
Bu sıralama Java tarafından önceden belirlenmiştir.

| Öncelik | Operatör | Açıklama |
|----------|-----------|----------|
| 1 | `()` | Parantez içi işlemler önce yapılır |
| 2 | `*`, `/`, `%` | Çarpma, bölme, mod işlemleri |
| 3 | `+`, `-` | Toplama ve çıkarma işlemleri |

**Not:**  
Parantez kullanımı, işlemlerin sırasını değiştirmek ve okunabilirliği artırmak için önerilir.

---

### 🔹 9. Tür Dönüşümü (Type Conversion)

Farklı türlerde sayılar arasında işlem yapılırsa, küçük veri tipi otomatik olarak **büyük tipe** dönüştürülür.  
Bu işleme **otomatik tür genişletme (widening conversion)** denir.

| Küçük Tip | Dönüştüğü Büyük Tip |
|------------|----------------------|
| `byte` → | `short` → `int` → `long` → `float` → `double` |

**Örnek Açıklama:**
- `int a = 5; double b = 2.0; double sonuc = a + b;`  
  → `a` otomatik olarak `double`’a çevrilir, sonuç `7.0` olur.

---

### 🔹 10. Dikkat Edilmesi Gerekenler

⚠️ Tamsayı bölme kesir kısmını **atabilir** → `10 / 3 = 3`  
⚠️ `0`’a bölme hataya neden olur (`ArithmeticException`)  
⚠️ Parantezler işlem önceliğini değiştirebilir.  
⚠️ Ondalıklı sonuç istiyorsan **double veya float** kullan.  
⚠️ Mod işlemi negatif sayılarda dikkatli kullanılmalıdır:  
`-10 % 3` sonucu `-1` olur (işaret korunur).

---


## 7. Atama ve İşlem Operatörleri

Java’da **atama (assignment)** ve **işlem (compound)** operatörleri, değişkenlere değer atamak veya mevcut değeri yeni bir değerle güncellemek için kullanılır.  
Bu operatörler programlama dillerinin en temel yapı taşlarından biridir.

---

### 🔹 1. Atama Operatörü (`=`)

`=` operatörü, bir değişkene **değer atamak** için kullanılır.  
Sağ taraftaki değeri **sol taraftaki değişkene kopyalar.**

**Örnek Açıklama:**
- `int x = 5;` → `x` değişkenine `5` değeri atanır.
- `double pi = 3.14;` → `pi` değişkenine `3.14` atanır.
- `String ad = "Toprak";` → `ad` değişkenine `"Toprak"` metni atanır.

**Önemli:**  
`=` matematikteki eşitlik anlamına gelmez; **değer atama** anlamındadır.

---

### 🔹 2. Birleşik (Kısaltılmış) Atama Operatörleri

Bir değişkenin mevcut değeriyle işlem yapılıp tekrar aynı değişkene atanması gerektiğinde  
Java **kısayol atama operatörleri** sunar.

| Operatör | Açıklama | Örnek Kullanım | Eşdeğer Uzun Hali |
|-----------|-----------|----------------|--------------------|
| `+=` | Topla ve ata | `x += 5;` | `x = x + 5;` |
| `-=` | Çıkar ve ata | `x -= 3;` | `x = x - 3;` |
| `*=` | Çarp ve ata | `x *= 2;` | `x = x * 2;` |
| `/=` | Böl ve ata | `x /= 4;` | `x = x / 4;` |
| `%=` | Kalanı bul ve ata | `x %= 2;` | `x = x % 2;` |

Bu operatörler hem **daha kısa yazım** sağlar hem de **okunabilirliği artırır.**

---

### 🔹 3. Artırma ve Azaltma Operatörleri (`++` ve `--`)

Bu operatörler bir değişkenin değerini **1 artırır veya azaltır.**

| Operatör | Açıklama | Örnek |
|-----------|-----------|--------|
| `++` | 1 artırır | `x++` veya `++x` |
| `--` | 1 azaltır | `x--` veya `--x` |

**Kullanım Farkı:**

| Yazım | Açıklama | İşleyiş |
|-------|-----------|----------|
| `x++` | Sonra artır | Değeri önce kullanır, sonra artırır |
| `++x` | Önce artır | Önce artırır, sonra değeri kullanır |

**Örnek:**
- `int a = 5; int b = a++;` → `b = 5`, `a = 6`
- `int a = 5; int b = ++a;` → `b = 6`, `a = 6`

---

### 🔹 4. Zincirleme (Chain) Atama

Birden fazla değişkene **aynı değeri tek satırda** atamak mümkündür.

**Örnek Açıklama:**
- `int a, b, c;`
- `a = b = c = 10;`
> Burada `10` değeri önce `c`’ye, ardından `b`’ye ve en son `a`’ya atanır.

---

### 🔹 5. Aritmetik ve Atama Operatörlerinin Birlikte Kullanımı

Atama operatörleri, aritmetik işlemlerle birlikte kullanılarak **ifade kısaltması** sağlar.

**Örnek Açıklama:**
- `x += 3 * 2;` → `x = x + (3 * 2);`
- `y -= (x + 5);` → `y = y - (x + 5);`

Bu tür yazımlar özellikle **döngülerde**, **sayacı artırma/azaltma** gibi durumlarda sık kullanılır.

---

### 🔹 6. Tür Uyumuna Dikkat

Atama işlemi yapılırken sağ taraftaki değer **sol taraftaki veri tipine uygun olmalıdır.**  
Eğer türler uyumlu değilse, **derleme hatası** alınır.

**Örnekler:**
- ✅ `int x = 5;`
- ✅ `double y = x;`  (otomatik dönüşüm: int → double)
- ❌ `int z = 5.5;`  (double → int dönüşümü hatası)

**Not:**  
Gerekirse açık dönüşüm yapılabilir:
```java
int z = (int) 5.5; // Sonuç: 5
```

## 8. Tip Dönüşümleri (Type Conversion / Casting)

Java’da **tip dönüşümü**, bir veri tipinin başka bir veri tipine **çevrilmesi** işlemidir.  
Bu işlem, farklı türlerdeki değişkenlerle (örneğin `int` ve `double`) yapılan hesaplamalarda veya  
farklı türde değişkenlere atama yapılırken kullanılır.

---

### 🔹 Tip Dönüşümü Nedir?

Bir değişkenin türünü başka bir türe dönüştürme işlemidir.  
Örneğin `int` türündeki bir değeri `double` türüne çevirmek gibi.

**Örnek:**
- `int sayi = 10;`
- `double sonuc = sayi;` → `sayi` otomatik olarak `double`’a çevrilir.

---

### 🔹 Tip Dönüşümünün Türleri

Java’da iki tür tip dönüşümü vardır:

| Tür | İngilizcesi | Açıklama |
|------|--------------|-----------|
| **1. Otomatik (Genişletme) Dönüşümü** | *Widening Conversion* | Küçük türden büyük türe geçiş, veri kaybı olmaz |
| **2. Manuel (Daraltma) Dönüşümü** | *Narrowing Conversion* | Büyük türden küçüğe geçiş, veri kaybı olabilir |

---

### 🔹 1. Otomatik Tip Dönüşümü (Widening Conversion)

Küçük bir veri tipi, daha büyük bir veri tipine **otomatik** olarak dönüştürülebilir.  
Bu işlem Java tarafından **kendiliğinden** yapılır.  
Veri kaybı yaşanmaz.

**Örnek Açıklama:**
- `int` → `double` dönüşümünde kesirli kısım eklenir (`10` → `10.0`)
- `byte` → `short` → `int` → `long` → `float` → `double` şeklinde genişler.

| Küçük Tip | → | Büyük Tip |
|------------|---|------------|
| `byte` | → | `short` |
| `short` | → | `int` |
| `int` | → | `long` |
| `long` | → | `float` |
| `float` | → | `double` |

**Örnek Anlatım:**
> Bir `int` değeri `double` değişkenine atarsan Java otomatik olarak dönüştürür.  
> Çünkü `double`, `int`’ten daha geniş bir tiptir.

**Durum:**
- `int sayi = 10;`
- `double sonuc = sayi;` → `sonuc = 10.0`

---

### 🔹 2. Manuel Tip Dönüşümü (Narrowing Conversion)

Büyük bir veri tipini daha küçük bir veri tipine çevirmek istiyorsan  
**elle (manuel)** belirtmen gerekir.  
Bu işleme **casting** denir.

**Yazım Şekli:**
```java
(veri_tipi) değişken_adı
```
## 9. Kullanıcıdan Veri Alma (Scanner Sınıfı)

Java’da kullanıcıdan veri almak için **`Scanner` sınıfı** kullanılır.  
Bu sınıf, **klavyeden (konsoldan)** girilen bilgileri okumamızı sağlar.  
Yani program çalışırken kullanıcıdan sayılar, metinler veya karakterler alınabilir.

`Scanner`, **java.util** paketinde yer alır ve giriş işlemlerinde en sık kullanılan sınıftır.

---

### 🔹 Scanner Nedir?

**Scanner**, kullanıcıdan girdi almak için kullanılan bir araçtır.  
Klavye, dosya veya başka veri kaynaklarından bilgi okuma işlemini kolaylaştırır.

Genellikle:
- sayısal veri (int, double, float)
- metin (String)
- karakter gibi girdileri almak için kullanılır.

---

### 🔹 Scanner Sınıfını Kullanmak İçin Gereken Adımlar

Kullanıcıdan veri alırken üç temel adım uygulanır:

| Adım | Açıklama | Örnek |
|------|-----------|--------|
| **1.** | `Scanner` sınıfını içe aktar | `import java.util.Scanner;` |
| **2.** | `Scanner` nesnesi oluştur | `Scanner input = new Scanner(System.in);` |
| **3.** | `next...()` metotlarıyla veri al | `input.nextInt();`, `input.nextLine();` vb. |

**Not:**  
Kullanıcıdan alınan veriler genellikle değişkenlerde saklanır.

---

### 🔹 Scanner ile Alınabilecek Veri Türleri

| Metot | Açıklama | Kullanım Amacı |
|--------|-----------|----------------|
| `nextInt()` | Tamsayı okur | `int` veri almak için |
| `nextDouble()` | Ondalıklı sayı okur | `double` veya `float` veri almak için |
| `nextLine()` | Tüm satırı (boşluk dahil) okur | `String` veri almak için |
| `next()` | Sadece ilk kelimeyi okur | Boşluk öncesine kadar olan metni alır |
| `nextBoolean()` | `true` veya `false` değeri okur | Mantıksal veri almak için |
| `nextLong()` | Uzun tamsayı okur | `long` veri almak için |
| `nextFloat()` | Ondalıklı sayı okur | `float` veri almak için |

---

### 🔹 next() ve nextLine() Arasındaki Fark

Bu iki metot genellikle karıştırılır.  
Aralarındaki fark, **boşluk ve satır sonu** davranışında görülür.

| Metot | Okuma Şekli | Örnek Girdi | Sonuç |
|--------|---------------|-------------|--------|
| `next()` | İlk boşluğa kadar olan kelimeyi okur | `Ali Toprak` | `"Ali"` |
| `nextLine()` | Tüm satırı (boşluklar dahil) okur | `Ali Toprak` | `"Ali Toprak"` |

**Özet:**
- `next()` → Tek kelime okur.
- `nextLine()` → Tüm satırı okur.

---

### 🔹 Veri Türü Uyumu

Kullanıcıdan alınan veri türü ile değişkenin tipi **uyumlu olmalıdır**.  
Örneğin, kullanıcı `nextInt()` ile sayısal girdi beklenirken metin girerse **hata oluşur**.

**Örnek Durumlar:**
- `nextInt()` kullanırken harf girilirse → `InputMismatchException` hatası alınır.
- `nextLine()` metodu sayılar dahil her şeyi metin olarak okur, bu yüzden güvenlidir.

---

### 🔹 Scanner ile Çoklu Girdi Alma

Birden fazla girdi alınacaksa her veri tipi için uygun `next...()` metodu çağrılır.  
Her `next...()` çağrısı kullanıcıdan yeni bir girdi ister.

Örneğin:
- `nextInt()` ile yaş alınır,
- `nextDouble()` ile not ortalaması alınır,
- `nextLine()` ile isim alınır.

Scanner her `Enter` (yeni satır) basışında bir girdiyi tamamlamış sayar.

---

### 🔹 Scanner Kapatma

Scanner, sistem kaynağı kullandığı için iş bittiğinde **kapatılmalıdır**.  
Bunun için `close()` metodu kullanılır.

Kapatma işlemi yapılmazsa küçük uyarılar alınabilir,  
ama program çalışmaya devam eder.

**Örnek:**  
`input.close();`

---

### 🔹 Scanner Sınıfının Avantajları

✅ Kullanımı kolay ve hızlıdır.  
✅ Farklı türlerde veri alınabilir.  
✅ Küçük konsol uygulamaları için idealdir.  
✅ Kullanıcıyla etkileşimli (interaktif) programlar oluşturmayı sağlar.

---

### 🔹 Dikkat Edilmesi Gerekenler

⚠️ `nextInt()` veya `nextDouble()` kullandıktan sonra `nextLine()` çağrılırsa,  
boş satır sorunu yaşanabilir. Çünkü `nextInt()` satır sonunu okumaz.  
Bunu önlemek için araya ekstra `input.nextLine();` eklenir.

⚠️ Yanlış türde veri girilirse `InputMismatchException` hatası oluşur.  
Örneğin sayı beklenirken harf girilmesi gibi.

⚠️ `Scanner` her `new Scanner(System.in)` çağrısında yeni bir okuma kanalı açar.  
Program boyunca genellikle **tek bir Scanner nesnesi** kullanılmalıdır.

---

### 💬 Özet

| Kavram | Açıklama |
|---------|-----------|
| **Scanner** | Kullanıcıdan veri almak için kullanılan sınıf |
| **import java.util.Scanner;** | Scanner sınıfını projeye dahil eder |
| **nextInt()** | Tamsayı alır |
| **nextDouble()** | Ondalıklı sayı alır |
| **nextLine()** | Tüm satırı okur (boşluk dahil) |
| **next()** | İlk kelimeyi okur (boşluktan önce) |
| **nextBoolean()** | true / false değeri alır |
| **close()** | Scanner nesnesini kapatır |
| **Dikkat** | Tür uyumu zorunludur; yanlış girdi hataya neden olur |

---

