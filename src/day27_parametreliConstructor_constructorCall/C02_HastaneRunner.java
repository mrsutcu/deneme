package day27_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {

        C01_Hastane personel1 = new C01_Hastane();
        System.out.println(personel1.personelIsmi); // Isim atanmadi
        System.out.println(personel1.personelTelefonu); // telefon atanmadı
        System.out.println(personel1.hastaneAdi); // Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); //03126593212

        personel1.personelTelefonu = "5552653666";
        personel1.personelIsmi= "Hamdi";

        C01_Hastane personel2 = new C01_Hastane();
        System.out.println(personel2.personelIsmi); // Isim atanmadi
        System.out.println(personel2.personelTelefonu); // telefon atanmadı


    }
}
