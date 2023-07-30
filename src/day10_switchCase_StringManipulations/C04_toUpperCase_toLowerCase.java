package day10_switchCase_StringManipulations;

import java.util.Locale;

public class C04_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Candır" ;

        System.out.println(str.toUpperCase());
        str = str.toUpperCase();

        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase(Locale.ENGLISH));


    }
}
