package day09_NestedIfElseStatements_Ternary;

public class C04_Ternary {
    public static void main(String[] args) {

        int input = 20;
        // input % 3 == 0 ? "3 ile tam bölünüyor" : "3 ile tam bölünmüyor"

        System.out.println(input % 3 == 0 ? "3 ile tam bölünüyor" : "3 ile tam bölünmüyor");

        // YA DA

        String sonuc = input % 3 == 0 ? "3 ile tam bölünüyor" : "3 ile tam bölünmüyor" ;
        System.out.println(sonuc);

        // verilen input çift sayı ise "çift sayı,
        // input tek sayı ise 2 * input sonucunu veren bir ternary yazın

        System.out.println(input % 2 == 0 ? "çift sayı" : 2 * input);


    }
}
