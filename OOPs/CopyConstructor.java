package OOPs;

public class CopyConstructor {

    String name;
    int age;

    public CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CopyConstructor(CopyConstructor obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    public static void main(String[] args) {

        CopyConstructor obj1 = new CopyConstructor("Sumit", 22);
        CopyConstructor obj2 = new CopyConstructor(obj1);

        System.out.println("Name: " + obj2.name + " " + "Age: " + obj2.age);
    }
}
