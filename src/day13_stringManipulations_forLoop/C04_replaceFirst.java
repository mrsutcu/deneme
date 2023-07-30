package day13_stringManipulations_forLoop;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str = "Java Candır, kendisini çok seviyoruz123.";

        // sadece a'yı büyük A yapın

        str = str.replaceFirst("a","A");
        System.out.println(str);
        // JAva Candır

        // ilk space'i iki space haline getiriniz

        System.out.println(str.replaceFirst(" ", "  "));
        // JAva  Candır, kendisini çok seviyoruz123.

        // ilk sayıyı space haline dönüştürün

        System.out.println(str.replaceFirst("\\d", " "));
        // JAva Candır, kendisini çok seviyoruz 23.

        // ilk özel karakteri * olarak değiştirin

        System.out.println(str.replaceFirst("\\W", "*"));
        // JAva*Candır, kendisini çok seviyoruz123.


    }
}
