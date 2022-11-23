package arraypackage;

public class DummyArray {
    private int[] array;
    private int count = 0;
    public DummyArray(int length) {
        array = new int[length];
    }

    public void insert(int value) {
        if(count == array.length) {
            int[] newArray = new int[array.length*2];
            for (int i=0; i<count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count++] = value;
    }

    public void print() {
        for(int i=0; i<count; i++) {
            System.out.println(array[i]);
        }
    }

    public void removeAt(int index) {
        if(index < 0 || index > count)
            throw new IllegalArgumentException();
        for(int i=index; i<count; i++)
            array[i] = array[i+1];
        count--;
    }

    public int indexOf(int value) {
        for(int i=0; i<count; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }
}
