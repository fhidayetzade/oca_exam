package working_with_methods_and_encapsulation;

class Pen {

}

public class TestPen_5 {
    public static void main(String[] args) {
        new Pen(); //Line 1
        Pen p = new Pen(); // Line 2
        change(p); //Line 3
        System.out.println("About to end."); //Line 4
    }

    public static void change(Pen pen) { //Line 5
        pen = new Pen(); //Line 6
    }
    // Pen Class`nın neçə obyekti 4-cü sətirdə Garbage Collection üçün uyğundur?
    // line 1-ci sətirdə yaradılmış obyekt yalnız 1-ci sətirdən sonra GC üçün uyğun olur,
    // çünki ona istinad yoxdur. Beləliklə, GC üçün işarələnmiş bir obyektimiz var.
    //change(Pen) metodu STACK-dan çıxdıqdan sonra 6-cı sətirdə yaradılmış obyekt əlçatmaz olur və
    // bu, 3-cü sətirdən sonra baş verir.

    //Beləliklə, 4-cü sətirdə GC üçün uyğun iki Pen obyektimiz var:
    // 1-ci sətirdə yaradılmış və 6-cı sətirdə yaradılmışdır.
}