package OOPs;

public class GettersAndSetters {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        GettersAndSetters obj = new GettersAndSetters();
        obj.setName("Sumit");
        System.out.println(obj.getName());
    }
}
