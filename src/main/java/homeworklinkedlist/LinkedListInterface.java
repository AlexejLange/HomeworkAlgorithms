package homeworklinkedlist;

/**
 * Algorithms. Homework LinkedList
 * @author Alexej Lange
 * @version 08 Nov 2022
 *
 */

public interface LinkedListInterface {
    void pushToHead(int data);
    void pushToTail(int data);
    void pushToIndex(int index, int data);
    void removeFirst();
    void removeLast();
    void remove(int index);
    Integer get(int index);
    int size();
    void print();
}
