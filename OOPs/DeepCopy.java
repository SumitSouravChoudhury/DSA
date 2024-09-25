package OOPs;

public class DeepCopy {

    private int[] data;

    public DeepCopy(int[] values) {
        data = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData() {
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] values = { 1, 2, 3, 4, 5 };
        DeepCopy obj = new DeepCopy(values);
        obj.showData();
    }
}
