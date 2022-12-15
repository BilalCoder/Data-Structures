package selectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 10, 6, 0, 2, 1, 7, 4, 9, 8};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int temp, minIndex;
        for(int i=0; i<array.length; i++) {
            minIndex = i;
            for(int j=i; j<array.length; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
