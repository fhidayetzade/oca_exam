package creating_and_using_arrays;

import java.util.ArrayList;
import java.util.List;

public class Test_List_Immutable_Mutable_4 {
    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);
        // 3 defe Hello capa verilecek. String immutable oldugundan l ve L evezlenmesi olunmayacaq. l ve L evezlenmesi ucun,
        // yeniden s referansinda menimsetmeliyik.

        //1)String nedir? Niye String'i  imutable etdiler? - String bir class'dir.String'in deyerini deyishdirmek olmur. Yeni deyeri dehismezdir. Eger setrin deyerini deyishdirmek mumkun olarsa, her hansi haker istinad deyerini deyishdirerek application'da tehlukesizlik problemi yarada biler. Imutable olduguna gore String multithreading ucun tehlukesizdir. Thread tehlukesizliyi ucun sinxronizasiyani aradan qaldirir.
        //String'ler 2 cur olur. Literal deyerlere malik String'ler ve new ifadesi ile yaradilan Stringler. Literal deyerlere malik String'ler String pool'da saxlanilir, yeni eger 2 referansa eyni deyer menimsedilibse, onlar ucun yaddashda bir defe yer ayrillir. Amma new ile yaradilan String'ler ise, heap'da saxlanilir. Eslinde String pool ozude heap'da saxlanilir. Ferqi budur ki, String pool intern ozelliyine malikdir. Eyni deyerler ucun yaddashda bir defe yer ayirir.
        //Niye Java'da String pool'a ehtiyac var? - Yaddashda yaradilan String obyketlerin sayini azaltmaq ucun yaradilmishdir. Her defe yeni setir yaradilanda, JVM evvelce String pool'u yoxlayir. Eyni setirle qarshilasharsa, o zaman yeni setir yaratmaq yerine, deyishene istinad movcud setri qaytarir.
        //String Concatenation - performans baximindan yaxshi deyil. Eger iki String'i birleshdirmek isteyirikse, o zaman String birleshmir, copyalanir. Buna gore zaman baximindan String'i birlehsirmek, o qeder de elverishli sayilmir.
        //StringBuilder Append - Eger iki String'i birlehsirmek isteyirikse, biz StringBuilder methodundan istifade etmeliyik. Performans baximindan String'den daha yaxhidir.
        //Ona gore String tehlukesiz baximindan daha yaxshi, StringBuilder performans baximindan daha yaxshidir.
        //String pool niye heap'e getirildi? evvel heap'da deyildi.
        //String pool ile heap'in ferqi nedir?
        //StringBuilder nedir? StringBuffer nedir? StringBuilder ile StringBuffer ferqi nedir? - StringBuffer synchronized'dir, StringBuilder ise deyil. Bir method eger synchronized'dirsa ona bir thread gire biler, iki thread gire bilmez. Eger sizin verilenleri saxlamaginizla bir probleminiz varsa, StringBuffer istifade etmeliyik. Eger yoxsa, StringBuilder istifade etmeliyik. StringBuilder daha suretlidir.
        //2)Runtime Polymorphism nedir? - Polymorphism  tek hereketi ferqli shekilde icra eden bir prosesdir. Real-time - polimorfizm tek bir insanin xas olan hereketi muxtelif shekilde icra ede bilir. Misal: Kishi, ogul, ata, er ve s. Yeni insanin bir cox xususiyyeti var ve onlari her birini veziyyete uygun olaraq heyata kecirir.
        //3)Mutable nedir?
        //Eger bir Obyektin deyerini deyishdire bilirikse, o zaman bu mutable deyishendir.
        //4)Imutable nedir?
        //Eger bir obyektin deyerini deyishdire bilmirikse, o zaman bu Imutable deyishendir.
    }
}
