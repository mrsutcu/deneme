package day26_forEachLoop_constructor;

public class C06 {

    C06(){
        // bu constructor default constructor'ın özelliklerine sahiptir.
        // ama bu constructor görünür olduğundan buna default constructor diyemeyiz.
        // bu constructor'ı eklediğimiz için default constructor silinir.

    }

    void C06(){
        //  by bir constructor değildir.
        // ama return type'ı olduğundan method'dur.
    }

    //c06(){
        // Invalid method declaration; return type required
        // Class adı ile aynı olmadığından constructor olamaz
        // return type'ı olmadığı için method da olamaz.
        // bunun için java altını kırmızı çizer.
    }



    /*
        Constuctor, bazı kaynaklarda özel bir method diye geçer.
        Ama çoğunluğun kabulüyle
        Constructor, başka yapılardan farklı, kendisine özgü bir yapıdır.

        Constructor, constructor'dır.

        Bir kod bloğunun constructor olabilmesi için
        2 şartı gerçekleştirmesi gerekir.
        - İsmi, Class ismi ile aynı olmalıdır.
        - return type'ı olmaz


     */




