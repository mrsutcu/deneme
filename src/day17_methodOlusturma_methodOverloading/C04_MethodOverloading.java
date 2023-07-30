package day17_methodOlusturma_methodOverloading;

public class C04_MethodOverloading {

    /*

        Biz bir method call yaptığımızda
        Java öncelikle method ismini kontrol eder.
        Sonra argument olarak verilen değerler ile, parametre olarak yazılan variable'ların data türlerini karşılaştırır.
        Ve uyumlu ise method'u çalıştırır.
        Argumentler ve parametreler uyumlu değilse Compile Time Error verir.

        Java'da aynı data türüne ve parametre sayısına sahip
        birden fazla method oluşturamazsınız.

        Farklı data türlerinde parametreler varsa diziliş değiştirildiğinde
        java farklı bir method olarak kabul eder.

     */


    public static void main(String[] args) {

        toplama(5,6); // iki int'in toplamı

        toplama(5.4,3); // double ve int'in toplamı

        toplama(9,9.9); // int ve double'ın toplamı

        toplama(5.3,5.2); // double ve double'ın toplamı

        toplama(3.9f,7); // double ve int'in toplamı

        toplama(3.4f,5f); // double ve double'ın toplamı



    }

    public static void toplama (int sayi1 , int sayi2){                         // toplama int int

        System.out.println("iki int'in toplamı: " + (sayi1 + sayi2));

    }

    public static void toplama (int a , double b){                              // toplama int double
        System.out.println("int ile double'ın toplamı: " + (a + b));
    }

    public static void toplama (double b , int a){                              // toplama double int
        System.out.println("double ve int'in toplamı: " + (a + b));
    }

    public static void toplama (double sayi1 , double sayi2){                   // toplama double double
        System.out.println("double ile double'ın toplamı: " + (sayi1 + sayi2));
    }

    /*
        method ismi + parametrelerin data türlerine METHOD SIGNATURE denir.
        Java aynı class'da signature'ı aynı olan 2 method'a izin verilmez

        Bir class'da ismi aynı fakat signature'ı farklı
        birden fazla method oluşturulmasına METHOD OVERLOADING denir
     */


}
