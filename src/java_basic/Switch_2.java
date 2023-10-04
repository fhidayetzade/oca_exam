package java_basic;

public class Switch_2 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "mango":
                System.out.println("MANGO");

            case "Banana":
                System.out.println("BANANA");
                break;
        }

        //  "mango" ifadesi tapilmadigindan hamisi capa verecek.
        //Eger default keyword`u axirda olsaydi, tekce default keyword`un icerisinde olan eded capa verecekdi.
        // eger uygun ifade tapilsaydi, default keyword`un icerisinde olan eded capa verilmeyecekdi. Uygun olan -
        // eded capa verilecekdi ve eger uygun olan case`de break ifadesi yoxdursa, ondan sonra olan case`ler de -
        //capa verilecekdi.

    }
}
