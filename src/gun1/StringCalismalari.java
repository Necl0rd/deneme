package gun1;

public class StringCalismalari
{

    public static void main(String[] args)
    {
        String str = "Hello World!";

        System.out.println(str.length());  // 12

        System.out.println(str.toUpperCase());  // HELLO WORLD!
        System.out.println(str.toLowerCase());  // hello world!

        System.out.println(str.indexOf('W'));  // 6
        System.out.println(str.indexOf("W"));  // 6
        System.out.println(str.indexOf("Wor"));  // 6

        System.out.println(str.lastIndexOf('o'));  // 7
        // "str" değişkenindeki 'o' karakterlerinden en sonda bulunan 'o'nun indexini verir ("World"deki 'o').

        System.out.println(str.substring(3,8));  // lo Wo
        // beginIndex = 3  |  endIndex = 8
        // 3. indexteki karakterden başlar ve (8-1). indexteki karaktere kadar alır.
        // Yani beginIndex dahil; ancak endIndex dahil DEĞİL !!!

        System.out.println(str.equals("Hello World!"));  // true
        // String'ler "equals()" metodu ile karşılaştırılır.
        // "==" kullanılmaz; "==" primitif tipler için kullanılır.

        System.out.println(str.equalsIgnoreCase("heLlO WoRlD!"));  // true
        // Büyük harf-küçük harf olayına BAKMADAN karşılaştırma yapar.

        System.out.println(str.replace("o", "1"));  // Hell1 W1rld!
        System.out.println(str.replace('o', '1'));   // Hell1 W1rld!

        System.out.println("   deneme   ".trim());  // deneme
        // İstersek "deneme" değerini String bir değişkene atayıp o String değişkene de "trim()" metodunu uygulayabiliriz.

        System.out.println(str.charAt(6));  // W

        //--------------------------------------------------------------------------------------------------------------------------------

        System.out.println("".isBlank());  // true
        System.out.println(" ".isBlank());  // true
        // "blank" = boşluk, boş
        // String'in boş olup olmadığını kontrol eder.
        // Eğer "boşluk" karakteri varsa onu da boş olarak kabul ediyor.

        System.out.println("\t".isBlank());  // true

        //--------------------------------------------------------------------------------------------------------------------------------

        System.out.println("".isEmpty());  // true
        System.out.println(" ".isEmpty());  // false
        // "Empty" ise görüldüğü gibi eğer "boşluk" karakteri varsa bunu bir karakter olarak algılıyor ve "false" dönüyor.
        // "Blank" ile arasındaki fark bu.

        System.out.println("\t".isEmpty());  // false

        //--------------------------------------------------------------------------------------------------------------------------------

        System.out.println(str.startsWith("Hel"));  // true  |  "Hel"  => String prefix ("önek")
        System.out.println(str.endsWith("rld!"));   // true  |  "rld!" => String suffix ("sonek")

        System.out.println(str.contains(" Worl"));  // true
    }

}