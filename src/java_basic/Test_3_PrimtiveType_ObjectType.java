package java_basic;

public class Test_3_PrimtiveType_ObjectType {
    public static void main(String[] args) {
        Integer i1=10;
        Integer i2=10;
        Integer i3 = new Integer(10);
        Integer i6 = new Integer(10);
        System.out.println(i3==i6);
        int     i4=new Integer(10);
        int     i5=10;
        System.out.println(i1==i2);          //true
        System.out.println(i1==i3);         //false
        System.out.println(i1==i4);         //false
        System.out.println(i1==i5);         //true
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        System.out.println(i1.equals(i4));
        System.out.println(i1.equals(i5));
        System.out.println(i3.equals(i4));
        System.out.println(i3.equals(i5));
        System.out.println(i3==i4);
        System.out.println(i3==i5);
        System.out.println(i4==i5);
        byte b1=10;
        Byte b2=10;
        long l1=10;
        Long l2=new Long(10l);
       // Long l3=new Long("")

    }
}
