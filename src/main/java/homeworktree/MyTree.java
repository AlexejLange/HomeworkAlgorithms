package homeworktree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree implements Tree, Comparable<MyTree> {
    public int value;
    MyTree left;
    MyTree right;

    public MyTree(int value) {
        this.value = value;
    }

    public MyTree(int value, MyTree left, MyTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    private ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<MyTree> queue = new LinkedList<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            MyTree tree = queue.poll();
            if (tree.left != null) {
                queue.offer(tree.left);
            }
            if (tree.right != null) {
                queue.offer(tree.right);
            }
            list.add(tree.value);
        }
        return list;
    }

    public void addNode(int value) {
        MyTree newNode = new MyTree(value);
        MyTree currentNode = this;
        MyTree parentNode;
        while (true) {
            parentNode = currentNode;
            if (currentNode.compareTo(newNode) == 0) {
                return;
            } else if (currentNode.compareTo(newNode) > 0) {
                currentNode = currentNode.left;
                if (currentNode == null) {
                    parentNode.left = newNode;
                    return;
                }
            } else {
                currentNode = currentNode.right;
                if (currentNode == null) {
                    parentNode.right = newNode;
                    return;
                }
            }
        }
    }

    @Override
    public MyTree balanceTree() {
        ArrayList<Integer> list = this.getValues();
        MyTree newTree = new MyTree(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            newTree.addNode(list.get(i));
        }
        return newTree;
    }

    @Override
    public void print() {
        Queue<MyTree> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            MyTree node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    @Override
    public int compareTo(MyTree o) {
        return this.value - o.value;
    }
}
