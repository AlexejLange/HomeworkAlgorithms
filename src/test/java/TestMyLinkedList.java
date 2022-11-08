import homeworklinkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMyLinkedList {
    private static MyLinkedList linkedList;

    @BeforeEach
    public void init() {
        linkedList = new MyLinkedList();
        linkedList.pushToTail(1);
        linkedList.pushToTail(2);
        linkedList.pushToTail(3);
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(linkedList.size(), 3);
    }

    @Test
    public void testGet() {
        Assertions.assertEquals(linkedList.get(1), 2);
    }

    @Test
    public void testPushToHead() {
        linkedList.pushToHead(4);
        Assertions.assertEquals(linkedList.size(), 4);
        Assertions.assertEquals(linkedList.get(0), 4);
    }

    @Test
    public void testPushToTail() {
        linkedList.pushToTail(5);
        Assertions.assertEquals(linkedList.size(), 4);
        Assertions.assertEquals(linkedList.get(3), 5);
    }

    @Test
    public void testPushToIndex() {
        linkedList.pushToIndex(2, 6);
        Assertions.assertEquals(linkedList.size(), 4);
        Assertions.assertEquals(linkedList.get(2), 6);
        Assertions.assertEquals(linkedList.get(3), 3);
    }

    @Test
    public void testRemoveFirst() {
        linkedList.removeFirst();
        Assertions.assertEquals(linkedList.size(), 2);
        Assertions.assertEquals(linkedList.get(0), 2);
    }

    @Test
    public void testRemoveLast() {
        linkedList.removeLast();
        Assertions.assertEquals(linkedList.size(), 2);
        Assertions.assertEquals(linkedList.get(1), 2);
    }

    @Test
    public void testRemove() {
        linkedList.remove(1);
        Assertions.assertEquals(linkedList.size(), 2);
        Assertions.assertEquals(linkedList.get(1), 3);
    }

    @Test
    public void testPrint() {
        linkedList.print();
    }
}
