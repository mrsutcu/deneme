package day19_scrope;

public class C01_Scrope {

    static int classLevelStatic = 12;
    String strClassLevelStaticOlmayan = "Java Güzeldir";


    public static void main(String[] args) {

        int sayiMain = 20;
        System.out.println(classLevelStatic);

        for (int i = 0; i < 10 ; i++) {
            int sayiForLoop = 5;
            System.out.println(classLevelStatic);

        }


    }

    public static void staticMethod (){

        String strstaticMethod = "Java Candir";
        System.out.println(classLevelStatic);

    }

    public void staticOlmayanMethod(){

        boolean blStaticOlmayanMethod = true;
        System.out.println(classLevelStatic);
        classLevelStatic = 40;

    }
    /*
        Scope temelde 2'ye ayrılır.
            1 - Local Variable'lar
                A- Scope'ları içinde oluşturuldukları kod bloğudur.
                   Bir method'da oluşturulan variable, başka method'dan KULLANILAMAZ.
                B- Loop Scope'u
                bir loop içerisinde kullanılabilir.
                Oluşturulduğu method'da loop'un dışında da KULLANILAMAZ

                Not: Local Variable'lar değer verilmeden oluşturulabilir
                ama değer atanmadan KULLANILAMAZ.

            2 - Class Level Variable'lar
                Class Level Variable'lar method'ların ve kod blokların dışında oluşturulur
                 ve scope'ları TÜM CLASS'dır

                Class Level Variable'ların scope'u tüm class olsa da
                static keyword de variable'ların kullanımına etki eder.

                Hastane ismi, Hastane adresi, Başhekim adı gibi variable'lar
                herkes için ortak olmalıdır.
                Bu tür variable'lar static olarak işaretlenir.

                Personel ismi, personel adresi, personel telefonu gibi variable'lar ise tüm personel için
                tanımlı olmakla birlilte bu variable'lardaki değişim herkesi ETKİLEMEZ.
                Sadece o personeli bağlar.
                Bu tür variable'ları ise static yapmayız.
                static olmayan class level'daki variable'lara INSTANCE variable'lar denir.

                    C - Class Level Static variable'lar
                        bu variable'lar static klubüne üye oldukları için
                        her yere gidebilirler
                    D - Class Level Instance variable'lar
                        Variable Static olmayınca üstünlüğü olmaz.
                        Bu durumda seçici olan method olur.

                        Static method'lar instance variable'ların girmesine izin vermez.
                        ama static olmayan method'lar;
                        static olmayan (instance) variable'ları kabul eder.


     */




}
