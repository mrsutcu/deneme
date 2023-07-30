package day26_forEachLoop_constructor;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {

        // Array'in elementlerinden en büyük olanı bulun

        int[] arr = {3,6,5,9,8,7,5,95,8,45,23,1,12,26,92,3,56,71};

        int enBuyukElement = arr[0];

        for (int each: arr
             ) {
            if (each > enBuyukElement){
                enBuyukElement = each;
            }
        }

        System.out.println("Array'deki en büyük element: " + enBuyukElement);




    }






}
