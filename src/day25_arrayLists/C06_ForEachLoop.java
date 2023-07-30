package day25_arrayLists;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {20,30,5,45};

        // array'in tüm elementlerini toplayın
        // array'in tüm elementlerini yazdırın
        // array'in elementlerinden çift sayı olanlarını yazdırın
        // array'in elementlerinden en büyük olanı bulun

        /*
            Array'in tüm elementlerini gözden geçirmemiz gereken sorularda for loop kullanırız.

            For Loop'un en önemli özelliği;
            tüm elementleri 0.index'ten sonuncu index'e kadar sıralı getirmesidir.

            ama bu sorularda elementi sırasıyla getirmesinin hiçbir önemi yok.

            index'in yani; sıralı getirmenin önemli olmadığı durumlarda for loop yerine;
            for-each-loop kullanırız.
            for each loop: array'e git, herbir elementi al bana getir.
         */

        for (int each: arr
             ) {
            System.out.print(each + " ");
        }
        
        

    }
}
