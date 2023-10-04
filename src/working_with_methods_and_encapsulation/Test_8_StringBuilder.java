package working_with_methods_and_encapsulation;

public class Test_8_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //   System.out.println(sb.append(null).length()); //line 1

        // line 1 - append overload method`dur. append(String), append(StringBuilder), append(char []) ve s. qebul edir.
        // bu halda kompilyator çox səviyyəli varislikdə String, StringBuilder, char [] - hansı tipə aid etməyini müəyyənləşdirə
        // bilməməsi üçün, çaşqınlıq yaradır və append(null) kompilyator xətası verir.
    }
}
