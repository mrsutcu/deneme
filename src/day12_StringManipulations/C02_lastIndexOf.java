package day12_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        // a harfinin ilk kullanım index'ini yazdırın.
        System.out.println(str.indexOf("a"));

        // a harfinin son kullanımının index'ini yazdırın.
        System.out.println(str.lastIndexOf("a"));

        // J harfinin ilk indexini yazdırın
        System.out.println(str.indexOf("J"));

        // J harfinin son kullanımının index'ini yazdırın
        System.out.println(str.lastIndexOf("J"));

        // Metne bakmadan e harfinin 2 kere veya daha fazla kullanılıp kullanılmadığını kontrol edin.
        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex == -1){
            System.out.println("Hiç e kullanılmamış");
        }else if (ilkIndex == sonIndex){
            System.out.println("Sadece 1 e kullanılmış");
        }else{
            System.out.println("e harfi 2 kere veya daha fazla kullanılmış");
        }

        //"Javayi ogrenecegiz, baska yolu yok"

        // o harfinin son index'ini yazdırın
        System.out.println(str.lastIndexOf("o"));

        //o harfinin son kullanımından bir önceli kullanımın index'ini yazdırın
        System.out.println(str.lastIndexOf("o",31));

        //k harfinin son kullanımının index'ini yazdırın
        System.out.println(str.lastIndexOf('k'));





    }
}
