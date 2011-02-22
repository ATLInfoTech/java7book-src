package ch09;

public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer);
        System.out.println(inner);
        Class k = OuterClass.InnerClass.class;
    }
}
