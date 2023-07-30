package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kaan");
        isimler.add("Bülent");
        isimler.add("Tuğba");
        isimler.add("Burhan");
        isimler.add("Kaan");

        System.out.println(isimler); // [Kaan, Bülent, Tuğba, Burhan, Kaan]

        System.out.println(isimler.remove("Hasan")); // false --> Hasan olmadığı için Hasan'ı bulamaz ve false yazdırır

        System.out.println(isimler.remove("Kaan")); // true

        System.out.println(isimler); // [Bülent, Tuğba, Burhan, Kaan]

        System.out.println(isimler.remove(1)); // Tuğba --> sildiği elementi gösterir

        System.out.println(isimler); // [Bülent, Burhan, Kaan]



        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar); // [3, 5, 7, 1]

        sayilar.remove(1);
        System.out.println(sayilar); // [3, 7, 1] --> element olan 1'i değil index olan 1'i sildi

        // ben element olan 1'i silmek istersem

        Integer silinecekElement = 1;
        sayilar.remove(silinecekElement);

        System.out.println(sayilar); // [3, 7]

        sayilar.clear();
        System.out.println(sayilar); // []




    }



}
