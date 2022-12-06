import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array =  {3, 5, 1, 10, 6, 0, 2, 1, 7, 4, 9, 8};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertionSort(int[] array) {
        for (int i=1; i<array.length; i++) {
            int j = i-1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
