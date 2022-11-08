package homeworkqueue;

import java.util.Arrays;

/**
 * Algorithms. Homework Queue
 * @author Alexej Lange
 * @version 31 Oct 2022
 *
 */

public class Queue {
    private final int[] array;
    private int head;
    private int tail;
    private final int capacity;
    private int count;

    public Queue(int size)
    {
        array = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    public void pushToEnd(int data) {
        if (count < capacity) {
            if (tail == capacity - 1) {
                tail = -1;
            }
            array[++tail] = data;
            count++;
        } else {
            throw new ArrayStoreException("Queue is full");
        }
    }

    public void remove() {
        if (count > 0) {
            array[head] = 0; // получаем первый элемент из очереди
            head++;
            if (head == capacity) { // циклический перенос
                head = 0;
            }
            count--; // уменьшаем количество элементов в очереди
        } else {
            throw new ArrayStoreException("Queue is empty");
        }
    }

    public int peek() {
        return array[head];
    }
    public boolean isEmpty() {
        return (count == 0);
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
