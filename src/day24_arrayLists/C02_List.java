package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        // Bir list oluşturma
        // <> içerisine data türü yazılmalıdır.
        // data türü PRIMITIVE data türleri OLAMAZ

        // List<String> isimler = new List(); --> List abstract olduğu için bu şekilde yazılamaz

        List<String> isimler = new ArrayList<>();
        ArrayList<String> isimler2 = new ArrayList<>();
        // ikinci yazım biçimi çok kullanılmaz

        // Her list oluşturulduğunda boş olarak oluşturulur.
        // sonra elementler tek tek eklenir.

        System.out.println(isimler); // []

        isimler.add("Burhan");
        isimler.add("Şeref");
        isimler.add("Gülşah");

        System.out.println(isimler); // [Burhan, Şeref, Gülşah]

        // elementler ekleme sırasına göre dizilir.

        // eğer en sona değil de istediğimiz bir index'e element eklemek istersek

        isimler.add(2,"Nergiz");
        System.out.println(isimler); // [Burhan, Şeref, Nergiz, Gülşah]

        isimler.add(1,"Omer");
        System.out.println(isimler); // [Burhan, Omer, Şeref, Nergiz, Gülşah]

        isimler.addAll(2,isimler); // Ömer ile Şeref arasına tüm listeyi ekler
        System.out.println(isimler); // [Burhan, Omer, Burhan, Omer, Şeref, Nergiz, Gülşah, Şeref, Nergiz, Gülşah]

        System.out.println(isimler.add("Eyüp")); // true
        System.out.println(isimler); // [Burhan, Omer, Burhan, Omer, Şeref, Nergiz, Gülşah, Şeref, Nergiz, Gülşah, Eyüp]


    }
}
