package day16_methodOlusturma_Kullanma;

public class C04_BaskaClasstanMethodYazdirma {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method",1,3);

        C03_MethodOlusturma.isimDuzenle("Burak","Akdeniz");

        String isimDuzenli = C03_MethodOlusturma.isimDuzenle("mehmet","kemal");
        // Düzenlenmiş ismin uzunluğunu yazdırır.

        /*
            Void olan method'da sonucu KAYDEDEMEYİZ, sadece YAZDIRIR,

            Bize değer döndüren method'da ise sonucu istersek direk yazdırır, istersek de kaydederiz.


         */
    }
}
