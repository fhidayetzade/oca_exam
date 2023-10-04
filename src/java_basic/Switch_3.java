package java_basic;

public class Switch_3 {
    public static void main(String[] args) {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
//            case 200: //line 1
//                System.out.println("var is 200");
//                break;
            default:
                System.out.println("In default");
        }

        // line 1 - setri error verecek. Byte max -128 - 127 ededi ozunde ehtiva edir.
    }
}
