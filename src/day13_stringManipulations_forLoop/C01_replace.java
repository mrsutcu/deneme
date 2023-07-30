package day13_stringManipulations_forLoop;

import java.sql.SQLOutput;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Javayı anlıyorum ama yazamıyorum";

        // var olan bir String'in istediğimiz bölümünü değiştirebiliriz.

        System.out.println(str.replace('J', 'T'));
        // Tavayı anlıyorum ama yazamıyorum

        System.out.println(str.replace('a','*'));
        // J*v*yı *nlıyorum *m* y*z*mıyorum

        System.out.println(str.replace("ama yazamıyorum","ve yazabiliyorum"));
        // Javayı anlıyorum ve yazabiliyorum

        System.out.println(str.replace("Java", "AA"));
        // AAyı anlıyorum ama yazamıyorum



    }
}
