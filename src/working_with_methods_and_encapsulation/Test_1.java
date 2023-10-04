package working_with_methods_and_encapsulation;

class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}

class OTG extends PenDrive {
    String type;
    String make;
    OTG(int capacity, String type) {
        super(capacity);
        this.type=type; //line 1
    }
    OTG(String make) {
        super(0);
        this.make = make;

    }
}

public class Test_1 {
    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);

        //sual: yuxarida her iki constructor`a ne elave etsek, capa 128 ve TYPE-C capa verilecek?
        // class extend olunugundan ve super class`da int tipinde constructor oldugundan mutleq sekilde sub class`in -
        // her iki constructor`un 1-ci setrine super keyword`u elave etmeliyik ve int tipinde super keyword parametr qebul etmelidir.
        // Sub class`in icerisinde tek parametr`li constructor eslinde run zamani ifadeye hec bir tesir gostermir, elece de -
        // make deyisheni - sadece cashdirmaq ucun qeyd edilib.
        // line 1 setrini commente alsaq 128 ve null ifadesi cap olunacaq. Cunki obj type instance deyisheni capa verir ve
        // TYPE-C method daxilinde Stryin type oturulub. this.type=type burada method daxilinde deyeri instance deyishenine menimsedir.
    }
}