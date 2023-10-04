package working_with_methods_and_encapsulation;

public class Test_7_String {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);

        // sb.toString - String`in literal dəyərini yaratmır, String class`ın instance`nı yaratmaq üçün, String constructor`nu yaradır.
        // ona görə, nəticə false olacaq.
    }
}
