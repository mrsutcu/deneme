package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir metin isteyin.
            Metindeki tüm sayıları ve özel karakterleri temizleyin.
            Metnin sonuna da nokta koyun
            Örnek input : J1*2av4.a C67/an=+dir--
            Output : "Java Candır."
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen istediğiniz mesajı girin");
        String str = scanner.nextLine();

        // önce sayılardan kurtulalım.

        str = str.replaceAll("\\d","");
        System.out.println(str);

        // Özel karakterlerden kurtulmak istediğimizde space de kaybolur.
        // bunun için önce space'i korumaya almalıyız
        // artık metnimizde sayı yok onun için space yerine herhangi bir sayıyı atayalım
        str = str.replaceAll("\\s", "1");


        // özel karakterlerden kurtulalım

        str = str.replaceAll("\\W","");

        // space yerine atadığımız 1'i yeniden space yapalım
        str = str.replaceAll("1" , " ");

        str = str + ".";

        System.out.println(str);





    }
}
