package biblioteki;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] liczby = {123, 5, 56, 47, 234, 1};
        System.out.println(liczby);
        System.out.println(Arrays.toString(liczby));
        Arrays.sort(liczby);
        System.out.println(Arrays.toString(liczby));
        System.out.println(Arrays.binarySearch(liczby,123));
        Arrays.fill(liczby, 3);
        System.out.println(Arrays.toString(liczby));
    }
}
