package working_with_methods_and_encapsulation;

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}

public class Test_2_toString {
    public static void main(String[] args) {
        Object [] arr = new Object[4];
        for(int i = 1; i <=3; i++) {
            switch(i) {
                case 1:
                    arr[i] = new String("Java");
                    break;
                case 2:
                    arr[i] = new StringBuilder("Java");
                    break;
                case 3:
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        // arr dəyişəni - 4 ölçülü Object massivi`nə aiddir və bu massivin bütün elementləri null təyin edilir.
        // for 1-dən başlandığından 0-cı indeks null təyin edilir. 1-ci indeks String, 2-ci indeks StringBuilder, 3-cü ind SpecialString
        // String və StringBuilder toString methodu`nu override etdiyindən Java çapa veriləcək. Class`lar toString methodu -
        // nu override etməyindən çapa class`ın tam adı və  hashCode`un 16 təmsili çapa veriləcək
        for(Object obj : arr) {
            System.out.println(obj);
        }
    }
}
