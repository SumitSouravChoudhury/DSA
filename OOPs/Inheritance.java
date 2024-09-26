package OOPs;

class A {

    int salary = 30000;
}

class B extends A {

    int benefits = 10000;
}

public class Inheritance {

    public static void main(String[] args) {

        B obj = new B();
        System.out.println(obj.salary + " " + obj.benefits);
    }
}
