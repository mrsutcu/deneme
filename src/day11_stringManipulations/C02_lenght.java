package day11_stringManipulations;

public class C02_lenght {
    public static void main(String[] args) {

        String isim = "Ramazan Uzunkavaklaraltındayataruyumazoğlu";
        // son harfi yazdırın

        System.out.println("isim uzunluğu: " + isim.length()); // 42

        System.out.println("son harf: " + isim.charAt(isim.length()-1)); // sondan 1. harfi yazdıdın


    }
}
