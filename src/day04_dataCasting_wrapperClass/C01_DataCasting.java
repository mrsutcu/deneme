package day04_dataCasting_wrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        String str = "Java candir";

        // int sayi1 = str;    int'e string atanamaz
        //char chr1 = str;     char'a string atanamaz
        //boolean bl1 = str;   boolean'a string atanamaz
        String s1 = str;     //String string'e atanir

        //boolean bl2 = 10;     boolean'a int atanamaz (boolean= false true)
        //boolean bl2 = 's';    boolean'a' char atanamaz

        int sayi2 = 'k';
        double dbl1 = sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1 = 7;

        sayi3 = (int)dbl2;
        sayi3 = sh1;
        sayi3 = by1;

        dbl2 = sayi3;
        dbl2 = sh1;
        dbl2 = by1;

        by1 = (byte)dbl2;
        by1 = (byte)sh1;
        by1 = (byte)sayi3;

        sh1 = (short)dbl2;
        sh1 = (short)sayi3;
        sh1 = by1;


















    }

}
