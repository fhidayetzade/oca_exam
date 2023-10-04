package creating_and_using_arrays;

public class Test_5_String {
    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);

        // her ikisi literal deyerlerdir. + birleshme emeliyyati compile time zamani hesablamanin icrasi String pool teredinden
        // yerine yetirilecek. Ona gore netice true verecek.
    }
}
