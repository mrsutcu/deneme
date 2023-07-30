package day13_stringManipulations_forLoop;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5dir";

        str = str.replace("1", "");
        System.out.println(str);

        // Sayıların tamamından kurtulmak istersek replace yeterli olmaz.
        /*
            Java'da sayılar, özel karakterler, alfabetik karakterlerin tümüyle işlem yapmak isterseniz
            replaceAll(istenenGrup, yeniDeğer
         */

        str = str.replaceAll("\\d","");
        System.out.println(str);

        // s : space
        // S : space olmayan her şey
        // s+: yan yana birden fazla space
        // w : harf veya rakam
        // W : harf veya rakam olmayan her şey




    }
}
