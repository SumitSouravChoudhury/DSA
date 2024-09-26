package OOPs;

public class ToString {

    String name;
    int age;
    String city;

    public ToString(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {

        return name + " " + age + " " + city;
    }

    public static void main(String[] args) {

        ToString obj = new ToString("Sumit", 22, "Bangalore");
        System.out.println(obj);
    }
}
