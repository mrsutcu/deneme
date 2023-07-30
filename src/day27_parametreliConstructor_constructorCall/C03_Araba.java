package day27_parametreliConstructor_constructorCall;

public class C03_Araba {

    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    int yil = 1900;
    int fiyat;
    String renk = "Renk belirtilmemiş";




    C03_Araba(){
        // Herhangi bir class'a görünür bir construcor oluşturursanız
        // default constructor silinir.
        // daha önce default constructor'ı kullanan başka class'larda
        // default constructor'ın silinmesi sorun oluşturabilir..
        // GENEL UYGULAMA OLARAK
        // bir class'a görünür bir parametreli constructor oluşturursak
        // soruna sebebiyet vermemek için
        // default constructor yerine parametresiz bir constructor da oluşturmalıyız.
    }



    C03_Araba(String mrk, String mdl, int yl, int fyt, String rnk){

        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        renk = rnk;


    }







    public String toString() {
        return "Araba bilgileri ==>" +
                ", marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk:'" + renk + '\'';
    }
}
