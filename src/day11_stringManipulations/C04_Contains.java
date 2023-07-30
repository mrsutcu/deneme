package day11_stringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        String str = "Java gün geçtikçe güzelleşiyor";

        //str Java içeriyor mu?
        System.out.println(str.contains("Java"));

        //str java içeriyor mu?
        System.out.println(str.contains("java"));

        //str a içeriyor mu?
        System.out.println(str.contains("a"));

        //*** contains method'u aranan metnin sayısı ile ilgilenmez.
        // sadece VAR veya YOK sonucu döndürür.




    }
}
