package OOPs;

public class ParameterizedConstructor {

    String name;
    int age;

    public ParameterizedConstructor(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        ParameterizedConstructor obj = new ParameterizedConstructor("Sumit", 22);
        System.out.println("Name: " + obj.name + " " + "Age: " + obj.age);
    }
}
