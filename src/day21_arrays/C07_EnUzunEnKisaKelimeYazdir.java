package day21_arrays;

public class C07_EnUzunEnKisaKelimeYazdir {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir Array'deki
        //         en uzun ve en kısa kelimeleri yazdıran bir method oluşturun

        String[] isimler = {"Resul", "Omer", "Mehmet", "Ertugrul", "Ozan", "Suleyman"};

        enUzunenKisaYazdir(isimler);

    }
    public static void enUzunenKisaYazdir(String[] isimler){

        String enKisaKelime = isimler[0];   // sadece başlangıç değeri olması için atandı
        String enUzunKelime = isimler[0];   // sadece başlangıç değeri olması için atandı

        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].length() >= enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() <= enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }



        }
        System.out.println("En uzun isim: " + enUzunKelime);
        System.out.println("En kısa isim: " + enKisaKelime);

    }



}
