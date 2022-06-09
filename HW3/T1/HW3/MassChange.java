package HW3.T1.HW3;

import java.util.Arrays;

public class MassChange {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[2];

        intArr[0] = 100;
        intArr[1] = 300;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));
    }
    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
