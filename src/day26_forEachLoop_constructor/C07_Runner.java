package day26_forEachLoop_constructor;

public class C07_Runner {
    public static void main(String[] args) {

        C04 obj;

        // deklarasyon vardır ama ete kemiğe bürünmüş bir obje yoktur.

        new C04();
        // objeyi oluşurduk ama sonraki satırlarda kullanamayız
        // çünkü bir objeye atamadık.

        System.out.println(new C04().sayi);

        C04 obj2 = new C04();


    }
}
