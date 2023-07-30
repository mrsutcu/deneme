package day12_StringManipulations;

public class C04_nullPointer {
    public static void main(String[] args) {

        String str1;




        /*
            null bir değer değil pointer'dır(işaretleyici)

            "str2'nin değeri null" ya da "str2'ye null değeri atanmış" ifadeleri yanlıştır.

            doğru olan ifade;
            "str2'ye değer atamadık, bunun farkındayız ve null olarak işaretledik."
         */


        String str2 = null;
        System.out.println(str2);
        System.out.println(str2 + " candır");

        System.out.println(str2.concat(" candır"));



    }
}
