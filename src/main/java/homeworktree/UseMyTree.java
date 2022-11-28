package homeworktree;

/**
 * Algorithms. Homework Queue
 * @author Alexej Lange
 * @version 23 Nov 2022
 *
 */

public class UseMyTree {
    public static void main(String[] args) {
        MyTree root =
                new MyTree(13,
                        new MyTree(5,
                                new MyTree(1, null, null), new MyTree(30, null, null)),
                        new MyTree(8, null, null));
        System.out.println("Before Balancing:");
        root.print();
        System.out.println();
        System.out.println("-----------------");
        root = root.balanceTree();
        System.out.println("After Balancing:");
        root.print();
    }
}
