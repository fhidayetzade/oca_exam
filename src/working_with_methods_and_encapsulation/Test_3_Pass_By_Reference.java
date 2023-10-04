package working_with_methods_and_encapsulation;

class Message {
     String msg = "Happy New Year!";

    public  void print() {
        System.out.println(msg);
    }
}

public class Test_3_Pass_By_Reference {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
    //Metod dəyişikliyinə change(Message) ötürülən obyektin msg property`si dəyişdirmir, əksinə,
    // başqa Message obyekti yaradır və yeni obyektin msg xassəsini "Happy New Year!" çapa verir.
}
