package arrayQueue;

import java.util.Arrays;

public class DummyPriorityQueueUsingArray {

    int[] array = new int[5];
    int count = 0;

    public void add(int number){
        if(isFull())
            throw new IllegalStateException("Priority Queue is full");
        else {
            int index = shiftItemsToInsert(number);
            array[index] = number;
            count++;
        }
    }

    public int shiftItemsToInsert(int number) {
        int i;
        for(i=count-1; i>=0; i--) {
            if(array[i] > number)
                array[i+1] = array[i];
            else
                break;
        }
        return i+1;
    }

    //just for simplicity, we are removing elements from back
    public int remove() {
        if(isEmpty())
            throw new IllegalStateException("Queue is empty");
        return array[--count];
    }

    public boolean isFull() {
        return count == array.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
