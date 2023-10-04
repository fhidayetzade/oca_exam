package working_with_methods_and_encapsulation;

public class Test_5 {
    int x=1;
    static int y=1;
     Test_5(){
        x++;
        y++;
    }
    public static void main(String[] args) {
        Test_5 t=new Test_5();
        Test_5 t1=new Test_5();
        Test_5 t2=new Test_5();
        System.out.println(t.x);
        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(y);

    }
}
