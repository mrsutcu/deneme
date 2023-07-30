package day11_stringManipulations;

public class C05_startsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java çok güzel";
        //str Java ile mi başlıyor?

        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Ja"));
        System.out.println(str.startsWith("Java çok güzel"));
        System.out.println(str.startsWith(""));

        //5. index'ten sonrası c ile mi başlar?
        System.out.println(str.startsWith("ç",5));

        //6.index'ten sonrası ok ile mi başlar?
        System.out.println(str.startsWith("o",6));

        ////str güzel ile mi biter?
        System.out.println(str.endsWith("güzel"));

        // str el ile mi biter?
        System.out.println(str.endsWith("el"));

        // str "" ile mi biter?
        System.out.println(str.endsWith(""));





    }
}
