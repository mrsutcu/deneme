package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_BaskaClasstanMethodKullanma {
    public static void main(String[] args) {

        int[] arr = { 2,4,6,8};
        System.out.println("Eski Array: " + Arrays.toString(arr)); // Eski Array: [2, 4, 6, 8]


        arr = C02_ArrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr,4);
        System.out.println("Yeni Array: " + Arrays.toString(arr)); // Yeni Array: [6, 8, 10, 12]

        System.out.println(C03_pozitifElementleriTopla.pozitifElementleriTopla(arr)); // 36

        C04_ElementSay.elemanSay(arr,6); // method void olduğu için sout yapmamıza gerek yok

        // kullanıcıdan değer alarak int[] bir değer oluşturmak istiyorum

        int[] kullaniciArrayi = C05_ArrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));


    }
}
