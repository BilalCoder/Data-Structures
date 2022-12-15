package bubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 10, 6, 0, 2, 1, 7, 4, 9, 8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int temp;
        boolean isSorted;
        for(int i = 0; i<array.length; i++){
            isSorted = true;
            for(int j = 1; j<array.length-i; j++) {
                if(array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }
}
