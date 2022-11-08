package homeworkqueue;

/**
 * Algorithms. Homework Queue
 * @author Alexej Lange
 * @version 31 Oct 2022
 *
 */

public class UseQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.pushToEnd(3);
        queue.pushToEnd(7);
        queue.pushToEnd(4);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.pushToEnd(9);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}
