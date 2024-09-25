package OOPs;

public class SingletonClass {

    public static SingletonClass instance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {

        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }

    public static void main(String[] args) {

        SingletonClass obj = SingletonClass.getInstance();
        System.out.println(obj.hashCode());
    }
}
