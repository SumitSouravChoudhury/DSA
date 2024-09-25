package OOPs;

import java.util.Arrays;

public class ShallowCopy {

    private int[] data;

    public ShallowCopy(int[] values) {
        data = values;
        System.out.println(data);
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {

        int[] values = { 1, 2, 3, 4, 5 };
        ShallowCopy obj = new ShallowCopy(values);
        obj.showData();
    }
}
