package homeworkarraylist;
/**
 * Algorithms. Homework ArrayList
 * @author Alexej Lange
 * @version 23 Sep 2022
 */

public interface Dynamic {
    void add(int data);
    void add(int index, int data);
    void remove(int data);
    void removeAt(int index);
    void growSize();
    void shrinkSize();
    void set(int index, int data);
    int get(int index);
    void clear();
    boolean contains(int data);
    boolean isEmpty();
    boolean compare(int[] compArray);
}
