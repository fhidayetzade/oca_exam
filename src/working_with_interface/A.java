package working_with_interface;

import working_with_methods_and_encapsulation.B;

public class A extends B {
    public void print() {
        A obj = (A)new B();
        System.out.println(obj.i1); //Line 8
        System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }

    public static void main(String [] args) {
        new A().print();
    }
}
