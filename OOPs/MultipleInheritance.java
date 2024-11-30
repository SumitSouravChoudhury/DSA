package OOPs;

interface A {
    int a = 10;
}

interface B {
    int b = 20;
}

public class MultipleInheritance implements A, B {

    public static void main(String[] args) {

        System.out.println(a + " " + b);
    }
}
