package working_with_methods_and_encapsulation;

public class Counter {
    private static int count;
    private int count1;
    public Counter() {
        count++;
        count1++;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.test();
    }
    public void test() {
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3
        System.out.println(count1); // 1
    }
}

