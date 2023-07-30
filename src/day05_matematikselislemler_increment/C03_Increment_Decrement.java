package day05_matematikselislemler_increment;

public class C03_Increment_Decrement {

    public static void main(String[] args) {

        int sayi = 10;

        sayi = 2 * sayi +5;

        System.out.println(sayi);

        sayi = 10;
        sayi *= 2;
        sayi += 5;
        System.out.println(sayi);

        sayi = 10;
        sayi *= 3;
        sayi -= 3;
        sayi /= 3;
        System.out.println(sayi);

        int a = 10;

        int b = a;
        a++;

        System.out.println("a: " + a + " b: " + b);

        a= 10;

        a++;

        b= a;
        System.out.println("a: " + a + " b: " + b);







    }
}
