package homeworkarraylist;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Algorithms. Homework ArrayList
 * @author Alexej Lange
 * @version 23 Sep 2022
 */

public class DynamicArray implements Dynamic, Iterable<Integer> {
    private static int[] array;
    private static int count = 0;
    private static int size = 0;

    DynamicArray(){
        array =  new int[10];
        size = array.length;
    }

    DynamicArray(int capacity){
        array =  new int[capacity];
        size = array.length;
    }

    @Override
    public void add(int data) {
        growSize();
        array[count++] = data;
    }

    @Override
    public void add(int index, int data) {
        growSize();
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0,index);
        System.arraycopy(array, index, newArray, index + 1,array.length - index);
        array = newArray;
        array[index] = data;
        count++;
    }

    @Override
    public void remove(int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                removeAt(i);
                break;
            }
        }
    }

    @Override
    public void removeAt(int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0,index);
        System.arraycopy(array, index + 1, newArray, index,array.length - index - 1);
        array = newArray;
        count--;
    }

    @Override
    public void growSize() {
        if (count >= size) {
            size *= 2;
            array = Arrays.copyOf(array,size);
        }
    }

    @Override
    public void shrinkSize() {
        size = count;
        array = Arrays.copyOf(array, size);
    }

    @Override
    public void set(int index, int data) {
        array[index] = data;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        array =  new int[10];
        size = 10;
        count = 0;
    }

    @Override
    public boolean contains(int data) {
        for (int i : array) {
            if (i == data) return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean compare(int[] compArray) {
        return Arrays.equals(array,compArray);
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Itr();
    }

    private static class Itr implements Iterator<Integer> {
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public Integer next() {
            return array[cursor++];
        }
    }
}
